import org.autotest.StackAr;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomRegressionTest {
    @Test
    public void customTest1AlteringReadIndexShouldBrakeInternalRep() throws Throwable {
        
        
        
        class ExtendedStack {
            
            private final Object[] elems;
            
            private int readIndex = -1;
            
            public ExtendedStack(int capacity) throws IllegalArgumentException {
                if (capacity < 0) {
                    throw new IllegalArgumentException();
                }
                this.elems = new Object[capacity];
            }
            
            public int size() {
                return readIndex+1;
            }
            
            public boolean isEmpty() {
                return size() == 0;
            }
            
            public boolean isFull() {
                return size() == elems.length;
            }
            
            public void push(Object o) throws IllegalStateException {
                if (isFull()) {
                    throw new IllegalStateException();
                }
                this.readIndex++;
                this.elems[readIndex] = o;
            }
            
            public Object pop() throws IllegalStateException {
                if (isEmpty()) {
                    throw new IllegalStateException();
                }
                Object rv = this.top();
                readIndex--;
                return rv;
            }

            public boolean repOK() {
                return StackAr.repOkFunction(this.readIndex, this.elems);
                
            }
            public void setReadIndex(int newReadIndex){
                this.readIndex = newReadIndex;
            }
            
            public Object top() throws IllegalStateException {
                if (isEmpty()) {
                    throw new IllegalStateException();
                }
                Object rv = this.elems[readIndex];
                return rv;
            }

        }
        ExtendedStack estackAr1 = new ExtendedStack(2);
        estackAr1.push(1);
        estackAr1.push(2);
        estackAr1.pop();
        estackAr1.pop();
        
        if(estackAr1.repOK())  org.junit.Assert.fail("Representation should be wrong");

        ExtendedStack estackAr2 = new ExtendedStack(2);
        estackAr2.push(1);
        estackAr2.setReadIndex(2);
        
        if(estackAr2.repOK())  org.junit.Assert.fail("Representation should be wrong");

        StackAr s = new StackAr();
        if(!s.equals(s)) org.junit.Assert.fail("Object should be equal to itself");
        if(s.hashCode()<30)org.junit.Assert.fail("Stack Hashcode should be a big number, grater at least than its prime minus the base readIndex");
       
        
        
    } 
}