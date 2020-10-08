import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = org.autotest.StackAr.repOkFunction(100, objArray7);
        boolean boolean11 = org.autotest.StackAr.repOkFunction(100, objArray7);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Class<?> wildcardClass15 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean5 = stackAr1.equals((java.lang.Object) 100L);
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction(100, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray8);
        java.lang.Class<?> wildcardClass14 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        boolean boolean16 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isFull();
        int int13 = stackAr7.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) 'a');
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        boolean boolean17 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction(100, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) (short) 1, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 1, objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) 'a');
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        int int13 = stackAr12.size();
        stackAr10.push((java.lang.Object) int13);
        boolean boolean15 = stackAr1.equals((java.lang.Object) int13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Class<?> wildcardClass15 = stackAr8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str15 = stackAr8.toString();
        java.lang.Class<?> wildcardClass16 = stackAr8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[4]" + "'", str15, "[4]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean6 = stackAr1.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isFull();
        int int13 = stackAr7.size();
        boolean boolean14 = stackAr1.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean8 = stackAr1.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction(0, objArray7);
        boolean boolean10 = org.autotest.StackAr.repOkFunction(1, objArray7);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray7);
        java.lang.Class<?> wildcardClass12 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
        int int2 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isFull();
        int int13 = stackAr7.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) 'a');
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        java.lang.Class<?> wildcardClass17 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean5 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        java.lang.String str7 = stackAr1.toString();
        java.lang.Object obj8 = stackAr1.pop();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[]]" + "'", str7, "[[]]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "[]" + "'", obj8, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        int int8 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        java.lang.String str2 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        boolean boolean8 = stackAr1.equals((java.lang.Object) 100);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (byte) 1);
        boolean boolean13 = stackAr10.isFull();
        boolean boolean14 = stackAr10.isFull();
        int int15 = stackAr10.size();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 1);
        stackAr17.push((java.lang.Object) "[]");
        stackAr10.push((java.lang.Object) stackAr17);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr17);
        boolean boolean24 = stackAr17.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr((int) '#');
        boolean boolean4 = stackAr2.equals((java.lang.Object) (byte) 100);
        boolean boolean5 = stackAr2.isEmpty();
        boolean boolean6 = stackAr2.isEmpty();
        boolean boolean7 = stackAr0.equals((java.lang.Object) stackAr2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.String str5 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object[] objArray1 = null;
        boolean boolean2 = org.autotest.StackAr.repOkFunction((int) (byte) -1, objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 'a');
        int int7 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 0);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = stackAr3.isFull();
        java.lang.Object obj7 = new java.lang.Object();
        stackAr3.push(obj7);
        boolean boolean9 = stackAr3.isFull();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '#');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (byte) 1);
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = new java.lang.Object();
        stackAr11.push(obj15);
        boolean boolean17 = stackAr11.isFull();
        java.lang.String str18 = stackAr11.toString();
        boolean boolean19 = stackAr3.equals((java.lang.Object) str18);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        java.lang.String str6 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) 'a');
        java.lang.String str10 = stackAr1.toString();
        int int11 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean6 = stackAr1.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        stackAr7.push((java.lang.Object) '4');
        java.lang.Object obj13 = null;
        boolean boolean14 = stackAr7.equals(obj13);
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Class<?> wildcardClass16 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr4.isEmpty();
        boolean boolean6 = stackAr4.isEmpty();
        int int7 = stackAr4.size();
        int int8 = stackAr4.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr4);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '#');
        boolean boolean12 = stackAr11.isEmpty();
        boolean boolean13 = stackAr11.isEmpty();
        int int14 = stackAr11.size();
        boolean boolean15 = stackAr11.isEmpty();
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object[] objArray9 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) 'a', objArray9);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray9);
        boolean boolean12 = org.autotest.StackAr.repOkFunction(100, objArray9);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray9);
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray9);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (short) 100, objArray9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) 'a');
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        int int13 = stackAr12.size();
        stackAr10.push((java.lang.Object) int13);
        boolean boolean15 = stackAr1.equals((java.lang.Object) int13);
        java.lang.Class<?> wildcardClass16 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.autotest.StackAr stackAr1 = new org.autotest.StackAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 0.0f);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean5 = stackAr1.equals((java.lang.Object) 100L);
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction(100, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction(10, objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 0.0f);
        int int5 = stackAr1.size();
        java.lang.String str6 = stackAr1.toString();
        int int7 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        boolean boolean8 = stackAr1.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction(0, objArray7);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray7);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) ' ', objArray7);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        int int3 = stackAr2.size();
        stackAr0.push((java.lang.Object) int3);
        java.lang.String str5 = stackAr0.toString();
        boolean boolean6 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr8.isEmpty();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        stackAr1.push((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isEmpty();
        int int11 = stackAr8.size();
        boolean boolean12 = stackAr8.isFull();
        boolean boolean13 = stackAr8.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean8 = stackAr1.equals((java.lang.Object) (byte) -1);
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj15 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[4]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 1);
        java.lang.Object obj6 = stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 'a');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr(0);
        int int9 = stackAr8.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) int9);
        java.lang.Class<?> wildcardClass11 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean5 = stackAr1.equals((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        java.lang.String str6 = stackAr1.toString();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = new java.lang.Object();
        stackAr6.push(obj10);
        boolean boolean12 = stackAr6.isFull();
        java.lang.String str13 = stackAr6.toString();
        stackAr6.push((java.lang.Object) (byte) 0);
        stackAr1.push((java.lang.Object) stackAr6);
        int int17 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "[]" + "'", obj7, "[]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = stackAr5.isFull();
        java.lang.Object obj9 = new java.lang.Object();
        stackAr5.push(obj9);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.String str12 = stackAr5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (byte) 1);
        boolean boolean25 = stackAr22.isFull();
        java.lang.Object obj26 = new java.lang.Object();
        stackAr22.push(obj26);
        boolean boolean28 = stackAr22.isFull();
        java.lang.String str29 = stackAr22.toString();
        stackAr22.push((java.lang.Object) (byte) 0);
        stackAr17.push((java.lang.Object) stackAr22);
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr22);
        boolean boolean34 = stackAr22.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.String str16 = stackAr1.toString();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr(0);
        int int19 = stackAr18.size();
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackAr18.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[4]]" + "'", str16, "[[4]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        int int3 = stackAr2.size();
        stackAr0.push((java.lang.Object) int3);
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass11 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        java.lang.String str7 = stackAr1.toString();
        int int8 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) (short) 1, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) -1, objArray6);
        java.lang.Class<?> wildcardClass10 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object[] objArray16 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean17 = org.autotest.StackAr.repOkFunction((int) 'a', objArray16);
        boolean boolean18 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray16);
        boolean boolean19 = org.autotest.StackAr.repOkFunction(100, objArray16);
        boolean boolean20 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray16);
        boolean boolean21 = stackAr1.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction(100, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (short) 100, objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr8.isEmpty();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean13 = stackAr8.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '#');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (byte) 1);
        boolean boolean18 = stackAr15.isFull();
        stackAr15.push((java.lang.Object) '4');
        stackAr8.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr8);
        int int23 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) 'a');
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        int int13 = stackAr12.size();
        stackAr10.push((java.lang.Object) int13);
        boolean boolean15 = stackAr1.equals((java.lang.Object) int13);
        int int16 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Class<?> wildcardClass12 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) 'a', objArray13);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray13);
        boolean boolean16 = org.autotest.StackAr.repOkFunction(100, objArray13);
        boolean boolean17 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray13);
        stackAr1.push((java.lang.Object) objArray13);
        java.lang.String str19 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean19 = stackAr12.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr0.equals((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '#');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (byte) 1);
        boolean boolean28 = stackAr25.isFull();
        java.lang.Object obj29 = new java.lang.Object();
        stackAr25.push(obj29);
        boolean boolean31 = stackAr17.equals(obj29);
        stackAr1.push((java.lang.Object) stackAr17);
        java.lang.String str33 = stackAr17.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        java.lang.String str16 = stackAr1.toString();
        java.lang.Class<?> wildcardClass17 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) 1);
        boolean boolean13 = stackAr8.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr8);
        java.lang.Class<?> wildcardClass15 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) 'a', objArray10);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray10);
        boolean boolean13 = org.autotest.StackAr.repOkFunction(100, objArray10);
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray10);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray10);
        boolean boolean16 = org.autotest.StackAr.repOkFunction(100, objArray10);
        boolean boolean17 = org.autotest.StackAr.repOkFunction(0, objArray10);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr8.isEmpty();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean13 = stackAr8.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '#');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (byte) 1);
        boolean boolean18 = stackAr15.isFull();
        stackAr15.push((java.lang.Object) '4');
        stackAr8.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean23 = stackAr8.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = stackAr5.isFull();
        java.lang.Object obj9 = new java.lang.Object();
        stackAr5.push(obj9);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.String str12 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean19 = stackAr12.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr0.equals((java.lang.Object) boolean19);
        boolean boolean21 = stackAr0.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr23.isEmpty();
        int int25 = stackAr23.size();
        stackAr23.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass29 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean14 = stackAr1.isEmpty();
        java.lang.Object obj15 = stackAr1.pop();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[[]]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        int int8 = stackAr1.size();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr4.equals((java.lang.Object) (byte) 1);
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isFull();
        boolean boolean9 = stackAr4.isFull();
        int int10 = stackAr4.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean18 = stackAr4.equals(obj16);
        boolean boolean19 = stackAr1.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[]]" + "'", str7, "[[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[]]" + "'", str8, "[[]]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        boolean boolean2 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackAr8.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr(0);
        int int5 = stackAr4.size();
        stackAr1.push((java.lang.Object) stackAr4);
        int int7 = stackAr4.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        int int5 = stackAr1.size();
        java.lang.String str6 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj12 = stackAr1.top();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '#');
        boolean boolean15 = stackAr14.isEmpty();
        int int16 = stackAr14.size();
        boolean boolean17 = stackAr14.isEmpty();
        boolean boolean19 = stackAr14.equals((java.lang.Object) (short) -1);
        stackAr1.push((java.lang.Object) stackAr14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (short) 100, objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction(0, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction(1, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray8);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = new java.lang.Object();
        stackAr6.push(obj10);
        boolean boolean12 = stackAr6.isFull();
        java.lang.String str13 = stackAr6.toString();
        stackAr6.push((java.lang.Object) (byte) 0);
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean17 = stackAr6.isFull();
        java.lang.String str18 = stackAr6.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr6.isEmpty();
        int int8 = stackAr6.size();
        boolean boolean9 = stackAr6.isEmpty();
        boolean boolean11 = stackAr6.equals((java.lang.Object) (short) -1);
        stackAr1.push((java.lang.Object) (short) -1);
        java.lang.Object obj13 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (byte) 0);
        boolean boolean11 = stackAr1.isEmpty();
        boolean boolean13 = stackAr1.equals((java.lang.Object) 1L);
        int int14 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = stackAr3.isFull();
        java.lang.Object obj7 = new java.lang.Object();
        stackAr3.push(obj7);
        boolean boolean9 = stackAr3.isFull();
        java.lang.String str10 = stackAr3.toString();
        java.lang.Object obj11 = stackAr3.top();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '#');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr3.equals((java.lang.Object) str14);
        stackAr0.push((java.lang.Object) stackAr3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.String str2 = stackAr0.toString();
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr((int) '#');
        boolean boolean4 = stackAr2.equals((java.lang.Object) (byte) 1);
        boolean boolean5 = stackAr2.isFull();
        java.lang.String str6 = stackAr2.toString();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) 'a', objArray14);
        boolean boolean16 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray14);
        boolean boolean17 = org.autotest.StackAr.repOkFunction(100, objArray14);
        boolean boolean18 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray14);
        stackAr2.push((java.lang.Object) objArray14);
        boolean boolean20 = org.autotest.StackAr.repOkFunction(10, objArray14);
        java.lang.Class<?> wildcardClass21 = objArray14.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj12 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.String str16 = stackAr1.toString();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr(0);
        int int19 = stackAr18.size();
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr18);
        java.lang.String str21 = stackAr18.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[4]]" + "'", str16, "[[4]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj15 = stackAr1.pop();
        boolean boolean16 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean7 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean7 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Class<?> wildcardClass9 = stackAr6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Object obj13 = stackAr1.top();
        java.lang.String str14 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[]]" + "'", str14, "[[]]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction(0, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction(1, objArray6);
        java.lang.Class<?> wildcardClass10 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = stackAr5.isEmpty();
        boolean boolean9 = stackAr5.isFull();
        boolean boolean10 = stackAr1.equals((java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.String str12 = stackAr5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr((int) '#');
        boolean boolean4 = stackAr2.equals((java.lang.Object) (byte) 1);
        boolean boolean5 = stackAr2.isFull();
        java.lang.String str6 = stackAr2.toString();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) 'a', objArray14);
        boolean boolean16 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray14);
        boolean boolean17 = org.autotest.StackAr.repOkFunction(100, objArray14);
        boolean boolean18 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray14);
        stackAr2.push((java.lang.Object) objArray14);
        boolean boolean20 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.String str16 = stackAr1.toString();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr(0);
        int int19 = stackAr18.size();
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr18);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        boolean boolean23 = stackAr22.isEmpty();
        int int24 = stackAr22.size();
        boolean boolean25 = stackAr22.isEmpty();
        boolean boolean26 = stackAr22.isEmpty();
        boolean boolean27 = stackAr22.isFull();
        int int28 = stackAr22.size();
        boolean boolean29 = stackAr1.equals((java.lang.Object) stackAr22);
        java.lang.Object obj30 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[4]]" + "'", str16, "[[4]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[4]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr17.isEmpty();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        stackAr1.push((java.lang.Object) int23);
        int int25 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 100);
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean13 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = new java.lang.Object();
        stackAr6.push(obj10);
        boolean boolean12 = stackAr6.isFull();
        java.lang.String str13 = stackAr6.toString();
        stackAr6.push((java.lang.Object) (byte) 0);
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean17 = stackAr6.isFull();
        java.lang.Class<?> wildcardClass18 = stackAr6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction(100, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (short) -1, objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        stackAr7.push((java.lang.Object) '4');
        java.lang.Object obj13 = null;
        boolean boolean14 = stackAr7.equals(obj13);
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Object obj16 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[4]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = new java.lang.Object();
        stackAr6.push(obj10);
        boolean boolean12 = stackAr6.isFull();
        java.lang.String str13 = stackAr6.toString();
        stackAr6.push((java.lang.Object) (byte) 0);
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj17 = stackAr6.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.String str16 = stackAr1.toString();
        int int17 = stackAr1.size();
        boolean boolean18 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[4]]" + "'", str16, "[[4]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        int int14 = stackAr10.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) stackAr10);
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr(0);
        int int5 = stackAr4.size();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean7 = stackAr4.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction(0, objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 1);
        java.lang.Object obj6 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr8.equals((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass18 = stackAr8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '#');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) str4);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr7.isEmpty();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean12 = stackAr7.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '#');
        boolean boolean16 = stackAr14.equals((java.lang.Object) (byte) 1);
        boolean boolean17 = stackAr14.isFull();
        stackAr14.push((java.lang.Object) '4');
        stackAr7.push((java.lang.Object) stackAr14);
        boolean boolean21 = stackAr7.isEmpty();
        java.lang.String str22 = stackAr7.toString();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr(0);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr7.equals((java.lang.Object) stackAr24);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '#');
        boolean boolean29 = stackAr28.isEmpty();
        int int30 = stackAr28.size();
        boolean boolean31 = stackAr28.isEmpty();
        boolean boolean32 = stackAr28.isEmpty();
        boolean boolean33 = stackAr28.isFull();
        int int34 = stackAr28.size();
        boolean boolean35 = stackAr7.equals((java.lang.Object) stackAr28);
        stackAr1.push((java.lang.Object) boolean35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[[4]]" + "'", str22, "[[4]]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.String str16 = stackAr1.toString();
        int int17 = stackAr1.size();
        java.lang.Class<?> wildcardClass18 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[4]]" + "'", str16, "[[4]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '#');
        boolean boolean22 = stackAr20.equals((java.lang.Object) (byte) 1);
        boolean boolean23 = stackAr20.isFull();
        java.lang.String str24 = stackAr20.toString();
        java.lang.Object[] objArray32 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean33 = org.autotest.StackAr.repOkFunction((int) 'a', objArray32);
        boolean boolean34 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray32);
        boolean boolean35 = org.autotest.StackAr.repOkFunction(100, objArray32);
        boolean boolean36 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray32);
        stackAr20.push((java.lang.Object) objArray32);
        boolean boolean38 = org.autotest.StackAr.repOkFunction(10, objArray32);
        boolean boolean39 = org.autotest.StackAr.repOkFunction(0, objArray32);
        boolean boolean40 = org.autotest.StackAr.repOkFunction((int) ' ', objArray32);
        stackAr1.push((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction(0, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) -1, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) '4', objArray8);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) (short) 0, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((-1), objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction(0, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        int int8 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "[]" + "'", obj6, "[]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "[]" + "'", obj7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        boolean boolean8 = stackAr1.equals((java.lang.Object) 'a');
        int int9 = stackAr1.size();
        int int10 = stackAr1.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        boolean boolean16 = stackAr12.isFull();
        boolean boolean17 = stackAr12.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str20 = stackAr19.toString();
        boolean boolean21 = stackAr19.isFull();
        stackAr19.push((java.lang.Object) 1);
        boolean boolean24 = stackAr19.isEmpty();
        boolean boolean25 = stackAr12.equals((java.lang.Object) stackAr19);
        java.lang.Object obj26 = stackAr19.top();
        boolean boolean27 = stackAr19.isFull();
        boolean boolean28 = stackAr1.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean6 = stackAr1.equals((java.lang.Object) "hi!");
        boolean boolean7 = stackAr1.isFull();
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction(0, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) -1, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray8);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        java.lang.String str7 = stackAr1.toString();
        int int8 = stackAr1.size();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[4]" + "'", str7, "[4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isEmpty();
        int int8 = stackAr1.size();
        int int9 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (byte) 1);
        boolean boolean13 = stackAr10.isFull();
        java.lang.Object obj14 = new java.lang.Object();
        stackAr10.push(obj14);
        boolean boolean16 = stackAr10.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr18.equals((java.lang.Object) (byte) 1);
        boolean boolean21 = stackAr18.isFull();
        java.lang.Object obj22 = new java.lang.Object();
        stackAr18.push(obj22);
        boolean boolean24 = stackAr18.isFull();
        java.lang.String str25 = stackAr18.toString();
        boolean boolean26 = stackAr10.equals((java.lang.Object) str25);
        stackAr1.push((java.lang.Object) stackAr10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean5 = stackAr1.equals((java.lang.Object) 100L);
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        stackAr9.push((java.lang.Object) "[]");
        int int14 = stackAr9.size();
        boolean boolean16 = stackAr9.equals((java.lang.Object) 'a');
        boolean boolean17 = stackAr1.equals((java.lang.Object) boolean16);
        boolean boolean19 = stackAr1.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj15 = stackAr1.pop();
        java.lang.String str16 = stackAr1.toString();
        boolean boolean17 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) 'a', objArray13);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray13);
        boolean boolean16 = org.autotest.StackAr.repOkFunction(100, objArray13);
        boolean boolean17 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray13);
        stackAr1.push((java.lang.Object) objArray13);
        java.lang.Class<?> wildcardClass19 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.Object[] objArray1 = null;
        boolean boolean2 = org.autotest.StackAr.repOkFunction(0, objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isEmpty();
        int int22 = stackAr19.size();
        int int23 = stackAr19.size();
        boolean boolean24 = stackAr16.equals((java.lang.Object) stackAr19);
        boolean boolean25 = stackAr8.equals((java.lang.Object) boolean24);
        java.lang.Class<?> wildcardClass26 = stackAr8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) 'a', objArray10);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray10);
        boolean boolean13 = org.autotest.StackAr.repOkFunction(100, objArray10);
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray10);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray10);
        boolean boolean16 = org.autotest.StackAr.repOkFunction((int) 'a', objArray10);
        boolean boolean17 = org.autotest.StackAr.repOkFunction((int) (byte) 1, objArray10);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 0.0f);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isEmpty();
        int int22 = stackAr19.size();
        int int23 = stackAr19.size();
        boolean boolean24 = stackAr16.equals((java.lang.Object) stackAr19);
        boolean boolean25 = stackAr8.equals((java.lang.Object) boolean24);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '#');
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isEmpty();
        int int30 = stackAr27.size();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean33 = stackAr32.isEmpty();
        stackAr27.push((java.lang.Object) stackAr32);
        stackAr8.push((java.lang.Object) stackAr32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr9.isFull();
        java.lang.String str16 = stackAr9.toString();
        boolean boolean17 = stackAr1.equals((java.lang.Object) str16);
        boolean boolean18 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean19 = stackAr12.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr0.equals((java.lang.Object) boolean19);
        java.lang.String str21 = stackAr0.toString();
        boolean boolean22 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        boolean boolean8 = stackAr1.equals((java.lang.Object) 'a');
        int int9 = stackAr1.size();
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "[]" + "'", obj10, "[]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isFull();
        int int10 = stackAr5.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        stackAr12.push((java.lang.Object) "[]");
        stackAr5.push((java.lang.Object) stackAr12);
        java.lang.Object obj18 = stackAr12.pop();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean21 = stackAr20.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        int int26 = stackAr23.size();
        int int27 = stackAr23.size();
        boolean boolean28 = stackAr20.equals((java.lang.Object) stackAr23);
        boolean boolean29 = stackAr12.equals((java.lang.Object) boolean28);
        boolean boolean30 = stackAr1.equals((java.lang.Object) stackAr12);
        boolean boolean31 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "[]" + "'", obj18, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean19 = stackAr12.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr0.equals((java.lang.Object) boolean19);
        boolean boolean21 = stackAr0.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr23.isEmpty();
        int int25 = stackAr23.size();
        stackAr23.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) (byte) 100);
        java.lang.String str29 = stackAr0.toString();
        boolean boolean30 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[100]" + "'", str29, "[100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 'a');
        boolean boolean7 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (short) 0, objArray7);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) (byte) 1, objArray7);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (short) 0, objArray7);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean6 = stackAr1.equals((java.lang.Object) "hi!");
        boolean boolean7 = stackAr1.isFull();
        int int8 = stackAr1.size();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr1.isEmpty();
        boolean boolean14 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        int int6 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean6 = stackAr1.equals((java.lang.Object) "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        int int9 = stackAr1.size();
        java.lang.String str10 = stackAr1.toString();
        int int11 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 0);
        java.lang.Object obj2 = null;
        boolean boolean3 = stackAr1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Object obj13 = stackAr1.top();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '#');
        java.lang.String str16 = stackAr15.toString();
        stackAr1.push((java.lang.Object) stackAr15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (short) 0);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        stackAr8.push((java.lang.Object) stackAr12);
        int int19 = stackAr8.size();
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj21 = stackAr1.pop();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean25 = stackAr23.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = stackAr23.isFull();
        boolean boolean27 = stackAr23.isFull();
        boolean boolean28 = stackAr23.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str31 = stackAr30.toString();
        boolean boolean32 = stackAr30.isFull();
        stackAr30.push((java.lang.Object) 1);
        boolean boolean35 = stackAr30.isEmpty();
        boolean boolean36 = stackAr23.equals((java.lang.Object) stackAr30);
        java.lang.Object obj37 = stackAr30.top();
        java.lang.Object obj38 = stackAr30.pop();
        stackAr1.push(obj38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) (byte) -1, objArray7);
        boolean boolean11 = org.autotest.StackAr.repOkFunction(100, objArray7);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        boolean boolean9 = stackAr1.isEmpty();
        int int10 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (byte) 0);
        boolean boolean11 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean boolean8 = stackAr1.equals(obj7);
        java.lang.Object obj9 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr8.isEmpty();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean13 = stackAr8.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '#');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (byte) 1);
        boolean boolean18 = stackAr15.isFull();
        stackAr15.push((java.lang.Object) '4');
        stackAr8.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '#');
        boolean boolean25 = stackAr24.isEmpty();
        int int26 = stackAr24.size();
        boolean boolean27 = stackAr24.isEmpty();
        boolean boolean29 = stackAr24.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr(0);
        stackAr24.push((java.lang.Object) 0);
        stackAr8.push((java.lang.Object) 0);
        java.lang.Object obj34 = stackAr8.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr9.isEmpty();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean14 = stackAr1.isFull();
        boolean boolean15 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr9.isFull();
        java.lang.String str16 = stackAr9.toString();
        boolean boolean17 = stackAr1.equals((java.lang.Object) str16);
        boolean boolean18 = stackAr1.isEmpty();
        boolean boolean19 = stackAr1.isFull();
        java.lang.String str20 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = stackAr6.isFull();
        stackAr6.push((java.lang.Object) '4');
        java.lang.String str12 = stackAr6.toString();
        java.lang.Object obj13 = stackAr6.top();
        boolean boolean14 = stackAr6.isEmpty();
        boolean boolean15 = stackAr1.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[4]" + "'", str12, "[4]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean6 = stackAr1.equals((java.lang.Object) "hi!");
        boolean boolean7 = stackAr1.isFull();
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        int int2 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        java.lang.String str7 = stackAr1.toString();
        java.lang.Object obj8 = stackAr1.pop();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[4]" + "'", str7, "[4]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '4' + "'", obj8, '4');
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr9.isEmpty();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean14 = stackAr1.isFull();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '#');
        boolean boolean17 = stackAr16.isEmpty();
        boolean boolean19 = stackAr16.equals((java.lang.Object) '#');
        int int20 = stackAr16.size();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        boolean boolean23 = stackAr22.isEmpty();
        int int24 = stackAr22.size();
        boolean boolean25 = stackAr22.isEmpty();
        boolean boolean26 = stackAr22.isEmpty();
        boolean boolean27 = stackAr22.isFull();
        int int28 = stackAr22.size();
        boolean boolean29 = stackAr16.equals((java.lang.Object) int28);
        boolean boolean30 = stackAr1.equals((java.lang.Object) stackAr16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        java.lang.String str7 = stackAr1.toString();
        java.lang.Object obj8 = stackAr1.pop();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[]]" + "'", str7, "[[]]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "[]" + "'", obj8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (short) 0);
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.String str9 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0]" + "'", str9, "[0]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.Object[] objArray9 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) 'a', objArray9);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray9);
        boolean boolean12 = org.autotest.StackAr.repOkFunction(100, objArray9);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray9);
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) '#', objArray9);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (short) 100, objArray9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj7 = null;
        boolean boolean8 = stackAr1.equals(obj7);
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (byte) 0);
        boolean boolean11 = stackAr1.isEmpty();
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.String str8 = stackAr1.toString();
        java.lang.String str9 = stackAr1.toString();
        int int10 = stackAr1.size();
        java.lang.String str11 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "[]" + "'", obj6, "[]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "[]" + "'", obj7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[]]" + "'", str8, "[[]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[]]" + "'", str9, "[[]]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[]]" + "'", str11, "[[]]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '#');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (byte) 1);
        boolean boolean28 = stackAr25.isFull();
        java.lang.Object obj29 = new java.lang.Object();
        stackAr25.push(obj29);
        boolean boolean31 = stackAr17.equals(obj29);
        stackAr1.push((java.lang.Object) stackAr17);
        boolean boolean33 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Class<?> wildcardClass11 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        boolean boolean6 = stackAr1.equals((java.lang.Object) "hi!");
        boolean boolean7 = stackAr1.isFull();
        int int8 = stackAr1.size();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr10.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        boolean boolean15 = stackAr8.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackAr8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        boolean boolean16 = stackAr1.isFull();
        boolean boolean17 = stackAr1.isEmpty();
        java.lang.Object obj18 = stackAr1.pop();
        boolean boolean20 = stackAr1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '#');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (byte) 1);
        boolean boolean28 = stackAr25.isFull();
        java.lang.Object obj29 = new java.lang.Object();
        stackAr25.push(obj29);
        boolean boolean31 = stackAr17.equals(obj29);
        stackAr1.push((java.lang.Object) stackAr17);
        boolean boolean33 = stackAr17.isEmpty();
        boolean boolean34 = stackAr17.isEmpty();
        int int35 = stackAr17.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.Object[] objArray9 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) 'a', objArray9);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray9);
        boolean boolean12 = org.autotest.StackAr.repOkFunction(100, objArray9);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray9);
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) 'a', objArray9);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (byte) 1, objArray9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isFull();
        boolean boolean16 = stackAr1.isEmpty();
        boolean boolean17 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) 'a', objArray6);
        boolean boolean8 = org.autotest.StackAr.repOkFunction(100, objArray6);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((-1), objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr(0);
        stackAr1.push((java.lang.Object) 0);
        boolean boolean10 = stackAr1.isFull();
        java.lang.String str11 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0]" + "'", str11, "[0]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        int int8 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.pop();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr13.isEmpty();
        boolean boolean15 = stackAr13.isEmpty();
        int int16 = stackAr13.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean19 = stackAr18.isEmpty();
        stackAr13.push((java.lang.Object) stackAr18);
        boolean boolean21 = stackAr1.equals((java.lang.Object) stackAr18);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean25 = stackAr23.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = stackAr23.isFull();
        boolean boolean27 = stackAr23.isFull();
        int int28 = stackAr23.size();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '#');
        boolean boolean32 = stackAr30.equals((java.lang.Object) (byte) 1);
        stackAr30.push((java.lang.Object) "[]");
        stackAr23.push((java.lang.Object) stackAr30);
        java.lang.Object obj36 = stackAr30.pop();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean39 = stackAr30.equals((java.lang.Object) (short) 1);
        int int40 = stackAr30.size();
        java.lang.Object[] objArray49 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean50 = org.autotest.StackAr.repOkFunction((int) 'a', objArray49);
        boolean boolean51 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray49);
        boolean boolean52 = org.autotest.StackAr.repOkFunction(100, objArray49);
        boolean boolean53 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray49);
        boolean boolean54 = org.autotest.StackAr.repOkFunction((int) '#', objArray49);
        stackAr30.push((java.lang.Object) '#');
        boolean boolean56 = stackAr1.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "[]" + "'", obj36, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean14 = stackAr1.isEmpty();
        int int15 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) 'a');
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        int int13 = stackAr12.size();
        stackAr10.push((java.lang.Object) int13);
        boolean boolean15 = stackAr1.equals((java.lang.Object) int13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 100);
        boolean boolean20 = stackAr17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackAr17.getClass();
        stackAr1.push((java.lang.Object) stackAr17);
        int int23 = stackAr17.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        int int9 = stackAr1.size();
        java.lang.String str10 = stackAr1.toString();
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = null;
        stackAr1.push(obj8);
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        java.lang.String str2 = stackAr0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = stackAr5.isEmpty();
        boolean boolean9 = stackAr5.isFull();
        boolean boolean10 = stackAr1.equals((java.lang.Object) boolean9);
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        java.lang.Object obj7 = stackAr1.top();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr9.isEmpty();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        int int13 = stackAr9.size();
        boolean boolean14 = stackAr9.isFull();
        stackAr1.push((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean7 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr10.isFull();
        stackAr10.push((java.lang.Object) 1);
        boolean boolean15 = stackAr10.isEmpty();
        stackAr6.push((java.lang.Object) boolean15);
        java.lang.Object obj17 = stackAr6.top();
        java.lang.Object obj18 = stackAr6.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (byte) 1);
        boolean boolean25 = stackAr22.isFull();
        java.lang.Object obj26 = new java.lang.Object();
        stackAr22.push(obj26);
        boolean boolean28 = stackAr22.isFull();
        java.lang.String str29 = stackAr22.toString();
        stackAr22.push((java.lang.Object) (byte) 0);
        stackAr17.push((java.lang.Object) stackAr22);
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr(0);
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr22.equals((java.lang.Object) stackAr35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.top();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '#');
        java.lang.String str12 = stackAr11.toString();
        boolean boolean13 = stackAr1.equals((java.lang.Object) str12);
        boolean boolean14 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = new java.lang.Object();
        stackAr6.push(obj10);
        boolean boolean12 = stackAr6.isFull();
        java.lang.String str13 = stackAr6.toString();
        stackAr6.push((java.lang.Object) (byte) 0);
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean17 = stackAr6.isFull();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean24 = org.autotest.StackAr.repOkFunction((int) 'a', objArray23);
        boolean boolean25 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray23);
        stackAr6.push((java.lang.Object) boolean25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '#');
        boolean boolean30 = stackAr28.equals((java.lang.Object) (byte) 100);
        boolean boolean31 = stackAr28.isEmpty();
        stackAr28.push((java.lang.Object) (short) 0);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '#');
        boolean boolean37 = stackAr35.equals((java.lang.Object) (byte) 1);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '#');
        boolean boolean41 = stackAr39.equals((java.lang.Object) (byte) 1);
        boolean boolean42 = stackAr39.isFull();
        java.lang.Object obj43 = new java.lang.Object();
        stackAr39.push(obj43);
        stackAr35.push((java.lang.Object) stackAr39);
        int int46 = stackAr35.size();
        stackAr28.push((java.lang.Object) stackAr35);
        boolean boolean48 = stackAr6.equals((java.lang.Object) stackAr28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (byte) 1);
        boolean boolean6 = stackAr3.isFull();
        boolean boolean7 = stackAr3.isFull();
        boolean boolean8 = stackAr3.isFull();
        int int9 = stackAr3.size();
        boolean boolean11 = stackAr3.equals((java.lang.Object) 'a');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        int int15 = stackAr14.size();
        stackAr12.push((java.lang.Object) int15);
        boolean boolean17 = stackAr3.equals((java.lang.Object) int15);
        stackAr1.push((java.lang.Object) boolean17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 1);
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean13 = stackAr12.isEmpty();
        int int14 = stackAr12.size();
        boolean boolean16 = stackAr12.equals((java.lang.Object) 100L);
        boolean boolean17 = stackAr12.isFull();
        stackAr8.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr8.isFull();
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr8);
        java.lang.Object obj21 = stackAr1.top();
        java.lang.Class<?> wildcardClass22 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean6 = org.autotest.StackAr.repOkFunction((int) 'a', objArray5);
        boolean boolean7 = org.autotest.StackAr.repOkFunction((int) (byte) 1, objArray5);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction(0, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) -1, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (short) -1, objArray8);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = stackAr5.isFull();
        java.lang.Object obj9 = new java.lang.Object();
        stackAr5.push(obj9);
        stackAr1.push((java.lang.Object) stackAr5);
        int int12 = stackAr1.size();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '#');
        boolean boolean16 = stackAr14.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr18.isEmpty();
        int int20 = stackAr18.size();
        boolean boolean22 = stackAr18.equals((java.lang.Object) 100L);
        boolean boolean23 = stackAr18.isFull();
        stackAr14.push((java.lang.Object) stackAr18);
        boolean boolean25 = stackAr14.isEmpty();
        boolean boolean26 = stackAr1.equals((java.lang.Object) stackAr14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '#');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (byte) 1);
        boolean boolean28 = stackAr25.isFull();
        java.lang.Object obj29 = new java.lang.Object();
        stackAr25.push(obj29);
        boolean boolean31 = stackAr17.equals(obj29);
        stackAr1.push((java.lang.Object) stackAr17);
        boolean boolean33 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        boolean boolean5 = org.autotest.StackAr.repOkFunction((int) (short) -1, objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        boolean boolean7 = stackAr0.equals((java.lang.Object) objArray4);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr13.isEmpty();
        int int15 = stackAr13.size();
        boolean boolean17 = stackAr13.equals((java.lang.Object) 100L);
        boolean boolean18 = stackAr13.isFull();
        stackAr9.push((java.lang.Object) stackAr13);
        boolean boolean20 = stackAr9.isEmpty();
        java.lang.Object obj21 = stackAr9.top();
        stackAr0.push((java.lang.Object) stackAr9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        boolean boolean16 = stackAr1.isFull();
        boolean boolean17 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isEmpty();
        int int22 = stackAr19.size();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean25 = stackAr24.isEmpty();
        stackAr19.push((java.lang.Object) stackAr24);
        boolean boolean27 = stackAr1.equals((java.lang.Object) stackAr19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isEmpty();
        int int11 = stackAr8.size();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '#');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (byte) 1);
        stackAr13.push((java.lang.Object) "[]");
        java.lang.Object obj18 = stackAr13.pop();
        boolean boolean19 = stackAr8.equals((java.lang.Object) stackAr13);
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "[]" + "'", obj18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        int int14 = stackAr10.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) stackAr10);
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        java.lang.String str17 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        boolean boolean4 = org.autotest.StackAr.repOkFunction((int) (short) -1, objArray3);
        boolean boolean5 = org.autotest.StackAr.repOkFunction((int) '4', objArray3);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.String str8 = stackAr1.toString();
        stackAr1.push((java.lang.Object) "[4]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) 'a');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '#');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '#');
        boolean boolean16 = stackAr15.isEmpty();
        int int17 = stackAr15.size();
        boolean boolean19 = stackAr15.equals((java.lang.Object) 100L);
        boolean boolean20 = stackAr15.isFull();
        stackAr11.push((java.lang.Object) stackAr15);
        boolean boolean22 = stackAr11.isEmpty();
        java.lang.Object obj23 = stackAr11.top();
        int int24 = stackAr11.size();
        boolean boolean25 = stackAr1.equals((java.lang.Object) int24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj15 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[4]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str15 = stackAr1.toString();
        java.lang.Object obj16 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[4]]" + "'", str15, "[[4]]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[4]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean5 = stackAr1.equals((java.lang.Object) 100L);
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        java.lang.String str15 = stackAr9.toString();
        boolean boolean16 = stackAr9.isEmpty();
        boolean boolean17 = stackAr9.isFull();
        java.lang.Object obj18 = stackAr9.top();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 100);
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.String str2 = stackAr0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) 1);
        boolean boolean13 = stackAr8.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr8);
        java.lang.Object obj15 = stackAr8.top();
        java.lang.Object obj16 = stackAr8.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1 + "'", obj16, 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = stackAr5.isFull();
        java.lang.Object obj9 = new java.lang.Object();
        stackAr5.push(obj9);
        stackAr1.push((java.lang.Object) stackAr5);
        int int12 = stackAr1.size();
        java.lang.Object obj13 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr8.isEmpty();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean13 = stackAr8.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '#');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (byte) 1);
        boolean boolean18 = stackAr15.isFull();
        stackAr15.push((java.lang.Object) '4');
        stackAr8.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '#');
        boolean boolean26 = stackAr24.equals((java.lang.Object) (byte) 1);
        boolean boolean27 = stackAr24.isFull();
        java.lang.Object obj28 = new java.lang.Object();
        stackAr24.push(obj28);
        boolean boolean30 = stackAr24.isFull();
        java.lang.String str31 = stackAr24.toString();
        java.lang.Object obj32 = stackAr24.top();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '#');
        java.lang.String str35 = stackAr34.toString();
        boolean boolean36 = stackAr24.equals((java.lang.Object) str35);
        stackAr8.push((java.lang.Object) str35);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        int int39 = stackAr38.size();
        java.lang.Object[] objArray45 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean46 = org.autotest.StackAr.repOkFunction((int) 'a', objArray45);
        boolean boolean47 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray45);
        boolean boolean48 = stackAr38.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) '#');
        boolean boolean52 = stackAr50.equals((java.lang.Object) (byte) 1);
        boolean boolean53 = stackAr50.isFull();
        java.lang.Object obj54 = new java.lang.Object();
        stackAr50.push(obj54);
        boolean boolean57 = stackAr50.equals((java.lang.Object) (byte) -1);
        boolean boolean58 = stackAr38.equals((java.lang.Object) boolean57);
        boolean boolean59 = stackAr38.isFull();
        boolean boolean60 = stackAr8.equals((java.lang.Object) boolean59);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str14 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[[]]]" + "'", str14, "[[[]]]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        java.lang.String str11 = stackAr7.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean20 = org.autotest.StackAr.repOkFunction((int) 'a', objArray19);
        boolean boolean21 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray19);
        boolean boolean22 = org.autotest.StackAr.repOkFunction(100, objArray19);
        boolean boolean23 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray19);
        stackAr7.push((java.lang.Object) objArray19);
        boolean boolean25 = stackAr1.equals((java.lang.Object) objArray19);
        java.lang.String str26 = stackAr1.toString();
        int int27 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[[]]" + "'", str26, "[[]]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) 1);
        boolean boolean13 = stackAr8.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '#');
        boolean boolean17 = stackAr16.isEmpty();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isEmpty();
        stackAr1.push((java.lang.Object) boolean19);
        int int21 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr17.isEmpty();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        stackAr1.push((java.lang.Object) int23);
        java.lang.String str25 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[[4],0]" + "'", str25, "[[4],0]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean8 = stackAr1.equals((java.lang.Object) (byte) -1);
        java.lang.String str9 = stackAr1.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '#');
        boolean boolean12 = stackAr11.isEmpty();
        int int13 = stackAr11.size();
        boolean boolean14 = stackAr11.isEmpty();
        boolean boolean16 = stackAr11.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr18.equals((java.lang.Object) (byte) 1);
        boolean boolean21 = stackAr18.isFull();
        stackAr18.push((java.lang.Object) '4');
        stackAr11.push((java.lang.Object) stackAr18);
        boolean boolean25 = stackAr11.isFull();
        boolean boolean26 = stackAr1.equals((java.lang.Object) stackAr11);
        boolean boolean27 = stackAr11.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (short) 10, objArray7);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((-1), objArray7);
        boolean boolean11 = org.autotest.StackAr.repOkFunction(2, objArray7);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr9.isEmpty();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr1.equals((java.lang.Object) stackAr9);
        java.lang.String str14 = stackAr9.toString();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str17 = stackAr16.toString();
        stackAr9.push((java.lang.Object) stackAr16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) (short) 0, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 1, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction(10, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction(10, objArray8);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[4]" + "'", str7, "[4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[4]" + "'", str8, "[4]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str15 = stackAr8.toString();
        java.lang.Object obj16 = stackAr8.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[4]" + "'", str15, "[4]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) (short) -1, objArray7);
        java.lang.Class<?> wildcardClass9 = objArray7.getClass();
        boolean boolean10 = stackAr1.equals((java.lang.Object) wildcardClass9);
        boolean boolean11 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr4.isEmpty();
        boolean boolean7 = stackAr4.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        int int5 = stackAr4.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr13.isEmpty();
        int int15 = stackAr13.size();
        boolean boolean16 = stackAr13.isEmpty();
        boolean boolean18 = stackAr13.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '#');
        boolean boolean22 = stackAr20.equals((java.lang.Object) (byte) 1);
        boolean boolean23 = stackAr20.isFull();
        stackAr20.push((java.lang.Object) '4');
        stackAr13.push((java.lang.Object) stackAr20);
        java.lang.String str27 = stackAr20.toString();
        java.lang.Class<?> wildcardClass28 = stackAr20.getClass();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '#');
        boolean boolean32 = stackAr30.equals((java.lang.Object) (byte) 1);
        boolean boolean33 = stackAr30.isFull();
        java.lang.Object obj34 = new java.lang.Object();
        stackAr30.push(obj34);
        boolean boolean37 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass38 = stackAr30.getClass();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, stackAr4, boolean11, stackAr20, wildcardClass38 };
        boolean boolean40 = org.autotest.StackAr.repOkFunction((int) 'a', objArray39);
        boolean boolean41 = org.autotest.StackAr.repOkFunction(0, objArray39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[4]" + "'", str27, "[4]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, [], false, [4], class org.autotest.StackAr]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, [], false, [4], class org.autotest.StackAr]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean12 = stackAr1.isFull();
        java.lang.Object obj13 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = stackAr5.isFull();
        java.lang.String str9 = stackAr5.toString();
        java.lang.Object[] objArray17 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean18 = org.autotest.StackAr.repOkFunction((int) 'a', objArray17);
        boolean boolean19 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray17);
        boolean boolean20 = org.autotest.StackAr.repOkFunction(100, objArray17);
        boolean boolean21 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray17);
        stackAr5.push((java.lang.Object) objArray17);
        boolean boolean23 = org.autotest.StackAr.repOkFunction(10, objArray17);
        boolean boolean24 = org.autotest.StackAr.repOkFunction(0, objArray17);
        boolean boolean25 = org.autotest.StackAr.repOkFunction((int) ' ', objArray17);
        boolean boolean26 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
        int int2 = stackAr1.size();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr4.isEmpty();
        int int6 = stackAr4.size();
        boolean boolean7 = stackAr4.isEmpty();
        boolean boolean9 = stackAr4.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '#');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (byte) 1);
        boolean boolean14 = stackAr11.isFull();
        stackAr11.push((java.lang.Object) '4');
        stackAr4.push((java.lang.Object) stackAr11);
        boolean boolean18 = stackAr4.isFull();
        boolean boolean20 = stackAr4.equals((java.lang.Object) 100.0d);
        boolean boolean21 = stackAr1.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (byte) 0);
        int int11 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) ' ');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '#');
        boolean boolean4 = stackAr3.isEmpty();
        boolean boolean5 = stackAr3.isEmpty();
        int int6 = stackAr3.size();
        boolean boolean7 = stackAr3.isFull();
        boolean boolean8 = stackAr3.isEmpty();
        int int9 = stackAr3.size();
        stackAr1.push((java.lang.Object) int9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr1.equals(obj13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '#');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (byte) 1);
        boolean boolean28 = stackAr25.isFull();
        java.lang.Object obj29 = new java.lang.Object();
        stackAr25.push(obj29);
        boolean boolean31 = stackAr17.equals(obj29);
        stackAr1.push((java.lang.Object) stackAr17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = stackAr17.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean5 = stackAr1.equals((java.lang.Object) 100L);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        java.lang.String str11 = stackAr7.toString();
        boolean boolean12 = stackAr1.equals((java.lang.Object) str11);
        java.lang.String str13 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = stackAr17.isFull();
        java.lang.Object obj21 = new java.lang.Object();
        stackAr17.push(obj21);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean19 = stackAr12.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr0.equals((java.lang.Object) boolean19);
        boolean boolean21 = stackAr0.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr23.isEmpty();
        int int25 = stackAr23.size();
        stackAr23.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) (byte) 100);
        boolean boolean29 = stackAr0.isEmpty();
        boolean boolean30 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) '#');
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 100);
        boolean boolean10 = stackAr7.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackAr7.getClass();
        boolean boolean12 = stackAr1.equals((java.lang.Object) wildcardClass11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean20 = org.autotest.StackAr.repOkFunction((int) 'a', objArray19);
        boolean boolean21 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray19);
        boolean boolean22 = org.autotest.StackAr.repOkFunction((int) (byte) -1, objArray19);
        boolean boolean23 = stackAr1.equals((java.lang.Object) objArray19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isEmpty();
        int int22 = stackAr19.size();
        int int23 = stackAr19.size();
        boolean boolean24 = stackAr16.equals((java.lang.Object) stackAr19);
        boolean boolean25 = stackAr8.equals((java.lang.Object) boolean24);
        boolean boolean26 = stackAr8.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isFull();
        boolean boolean17 = stackAr1.equals((java.lang.Object) 100.0d);
        java.lang.String str18 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[4]]" + "'", str18, "[[4]]");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr17.isEmpty();
        boolean boolean22 = stackAr17.isFull();
        int int23 = stackAr17.size();
        stackAr1.push((java.lang.Object) int23);
        boolean boolean25 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isFull();
        int int13 = stackAr7.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) 'a');
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        java.lang.String str17 = stackAr1.toString();
        boolean boolean18 = stackAr1.isEmpty();
        boolean boolean19 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr4.isEmpty();
        boolean boolean6 = stackAr4.isEmpty();
        int int7 = stackAr4.size();
        int int8 = stackAr4.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 'a');
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[a]" + "'", str8, "[a]");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        int int14 = stackAr10.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) stackAr10);
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        java.lang.String str17 = stackAr1.toString();
        boolean boolean18 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '#');
        boolean boolean15 = stackAr14.isEmpty();
        int int16 = stackAr14.size();
        boolean boolean18 = stackAr14.equals((java.lang.Object) 100L);
        boolean boolean19 = stackAr14.isFull();
        stackAr10.push((java.lang.Object) stackAr14);
        boolean boolean21 = stackAr1.equals((java.lang.Object) stackAr10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        java.lang.String str11 = stackAr7.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean20 = org.autotest.StackAr.repOkFunction((int) 'a', objArray19);
        boolean boolean21 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray19);
        boolean boolean22 = org.autotest.StackAr.repOkFunction(100, objArray19);
        boolean boolean23 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray19);
        stackAr7.push((java.lang.Object) objArray19);
        boolean boolean25 = stackAr1.equals((java.lang.Object) objArray19);
        java.lang.String str26 = stackAr1.toString();
        boolean boolean27 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[[]]" + "'", str26, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        java.lang.String str9 = stackAr8.toString();
        boolean boolean11 = stackAr8.equals((java.lang.Object) 10L);
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        boolean boolean8 = stackAr1.equals((java.lang.Object) 'a');
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = new java.lang.Object();
        stackAr6.push(obj10);
        boolean boolean12 = stackAr6.isFull();
        java.lang.String str13 = stackAr6.toString();
        stackAr6.push((java.lang.Object) (byte) 0);
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean17 = stackAr6.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '#');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (byte) 1);
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = new java.lang.Object();
        stackAr19.push(obj23);
        java.lang.String str25 = stackAr19.toString();
        boolean boolean26 = stackAr19.isEmpty();
        boolean boolean27 = stackAr19.isFull();
        stackAr6.push((java.lang.Object) boolean27);
        boolean boolean29 = stackAr6.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        boolean boolean16 = stackAr12.isFull();
        boolean boolean17 = stackAr12.isFull();
        int int18 = stackAr12.size();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '#');
        boolean boolean21 = stackAr20.isEmpty();
        int int22 = stackAr20.size();
        boolean boolean23 = stackAr20.isEmpty();
        boolean boolean24 = stackAr12.equals((java.lang.Object) stackAr20);
        boolean boolean25 = stackAr0.equals((java.lang.Object) boolean24);
        java.lang.Class<?> wildcardClass26 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean13 = stackAr12.isEmpty();
        int int14 = stackAr12.size();
        boolean boolean16 = stackAr12.equals((java.lang.Object) 100L);
        boolean boolean17 = stackAr12.isFull();
        stackAr8.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr8.isFull();
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr8);
        java.lang.String str21 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        boolean boolean8 = stackAr1.equals((java.lang.Object) 'a');
        int int9 = stackAr1.size();
        int int10 = stackAr1.size();
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) 'a');
        java.lang.String str10 = stackAr1.toString();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean15 = stackAr12.equals((java.lang.Object) 10L);
        stackAr1.push((java.lang.Object) boolean15);
        java.lang.Object obj17 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '#');
        boolean boolean5 = stackAr4.isEmpty();
        boolean boolean6 = stackAr4.isEmpty();
        int int7 = stackAr4.size();
        int int8 = stackAr4.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr4);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '#');
        boolean boolean12 = stackAr11.isEmpty();
        boolean boolean13 = stackAr11.isEmpty();
        int int14 = stackAr11.size();
        boolean boolean15 = stackAr11.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackAr11.getClass();
        stackAr1.push((java.lang.Object) stackAr11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean12 = stackAr5.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean6 = stackAr5.isEmpty();
        int int7 = stackAr5.size();
        boolean boolean9 = stackAr5.equals((java.lang.Object) 100L);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Object obj13 = stackAr1.top();
        java.lang.Object obj14 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.Object[] objArray9 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) 'a', objArray9);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray9);
        boolean boolean12 = org.autotest.StackAr.repOkFunction(100, objArray9);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) (byte) 0, objArray9);
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray9);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) ' ', objArray9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        java.lang.Object obj6 = null;
        boolean boolean7 = stackAr1.equals(obj6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        stackAr1.push((java.lang.Object) (byte) 100);
        java.lang.Object obj6 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 100 + "'", obj6, (byte) 100);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        int int3 = stackAr2.size();
        stackAr0.push((java.lang.Object) int3);
        java.lang.String str5 = stackAr0.toString();
        java.lang.Object obj6 = stackAr0.top();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr0.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str15 = stackAr8.toString();
        int int16 = stackAr8.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (byte) 0);
        boolean boolean19 = stackAr8.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[4]" + "'", str15, "[4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean19 = stackAr12.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr0.equals((java.lang.Object) boolean19);
        boolean boolean21 = stackAr0.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr23.isEmpty();
        int int25 = stackAr23.size();
        stackAr23.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) (byte) 100);
        java.lang.String str29 = stackAr0.toString();
        int int30 = stackAr0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[100]" + "'", str29, "[100]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        int int9 = stackAr1.size();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '#');
        boolean boolean16 = stackAr14.equals((java.lang.Object) (byte) 1);
        boolean boolean17 = stackAr14.isFull();
        java.lang.String str18 = stackAr14.toString();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean27 = org.autotest.StackAr.repOkFunction((int) 'a', objArray26);
        boolean boolean28 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray26);
        boolean boolean29 = org.autotest.StackAr.repOkFunction(100, objArray26);
        boolean boolean30 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray26);
        stackAr14.push((java.lang.Object) objArray26);
        boolean boolean32 = org.autotest.StackAr.repOkFunction(10, objArray26);
        boolean boolean33 = org.autotest.StackAr.repOkFunction(0, objArray26);
        boolean boolean34 = org.autotest.StackAr.repOkFunction((int) ' ', objArray26);
        boolean boolean35 = stackAr1.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isEmpty();
        int int22 = stackAr19.size();
        int int23 = stackAr19.size();
        boolean boolean24 = stackAr16.equals((java.lang.Object) stackAr19);
        boolean boolean25 = stackAr8.equals((java.lang.Object) boolean24);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '#');
        boolean boolean29 = stackAr27.equals((java.lang.Object) (byte) 100);
        boolean boolean30 = stackAr27.isEmpty();
        boolean boolean31 = stackAr27.isEmpty();
        java.lang.String str32 = stackAr27.toString();
        boolean boolean33 = stackAr27.isEmpty();
        int int34 = stackAr27.size();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '#');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (byte) 100);
        boolean boolean39 = stackAr36.isEmpty();
        boolean boolean40 = stackAr36.isEmpty();
        boolean boolean41 = stackAr27.equals((java.lang.Object) stackAr36);
        stackAr8.push((java.lang.Object) stackAr36);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '#');
        boolean boolean45 = stackAr44.isEmpty();
        int int46 = stackAr44.size();
        boolean boolean47 = stackAr44.isEmpty();
        int int48 = stackAr44.size();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean51 = stackAr50.isFull();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) '#');
        boolean boolean54 = stackAr53.isEmpty();
        boolean boolean55 = stackAr53.isEmpty();
        int int56 = stackAr53.size();
        int int57 = stackAr53.size();
        boolean boolean58 = stackAr50.equals((java.lang.Object) stackAr53);
        boolean boolean59 = stackAr44.equals((java.lang.Object) boolean58);
        int int60 = stackAr44.size();
        stackAr36.push((java.lang.Object) int60);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) 'a', objArray8);
        boolean boolean10 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray8);
        boolean boolean11 = org.autotest.StackAr.repOkFunction(100, objArray8);
        boolean boolean12 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray8);
        boolean boolean13 = org.autotest.StackAr.repOkFunction((int) ' ', objArray8);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction(0, objArray7);
        boolean boolean10 = org.autotest.StackAr.repOkFunction(1, objArray7);
        boolean boolean11 = org.autotest.StackAr.repOkFunction((-1), objArray7);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = new java.lang.Object();
        stackAr12.push(obj16);
        boolean boolean19 = stackAr12.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr0.equals((java.lang.Object) boolean19);
        boolean boolean21 = stackAr0.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr23.isEmpty();
        int int25 = stackAr23.size();
        stackAr23.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) 10.0f);
        java.lang.Object obj31 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0f + "'", obj31, 10.0f);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean15 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '#');
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (byte) 1);
        boolean boolean25 = stackAr22.isFull();
        java.lang.Object obj26 = new java.lang.Object();
        stackAr22.push(obj26);
        boolean boolean28 = stackAr22.isFull();
        java.lang.String str29 = stackAr22.toString();
        stackAr22.push((java.lang.Object) (byte) 0);
        stackAr17.push((java.lang.Object) stackAr22);
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr22);
        java.lang.Object obj34 = stackAr1.pop();
        boolean boolean35 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[4]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[4]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '#');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = stackAr5.isFull();
        java.lang.Object obj9 = new java.lang.Object();
        stackAr5.push(obj9);
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean12 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr9.isFull();
        java.lang.String str16 = stackAr9.toString();
        boolean boolean17 = stackAr1.equals((java.lang.Object) str16);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '#');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (byte) 1);
        boolean boolean22 = stackAr19.isFull();
        boolean boolean23 = stackAr19.isFull();
        int int24 = stackAr19.size();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '#');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (byte) 1);
        stackAr26.push((java.lang.Object) "[]");
        stackAr19.push((java.lang.Object) stackAr26);
        boolean boolean32 = stackAr19.isEmpty();
        java.lang.Object obj33 = stackAr19.pop();
        stackAr1.push(obj33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "[[]]");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean14 = org.autotest.StackAr.repOkFunction((int) 'a', objArray13);
        boolean boolean15 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray13);
        boolean boolean16 = org.autotest.StackAr.repOkFunction(100, objArray13);
        boolean boolean17 = org.autotest.StackAr.repOkFunction((int) (byte) 100, objArray13);
        stackAr1.push((java.lang.Object) objArray13);
        boolean boolean19 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr(0);
        stackAr1.push((java.lang.Object) 0);
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isFull();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '#');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (byte) 1);
        boolean boolean16 = stackAr13.isFull();
        stackAr13.push((java.lang.Object) '4');
        boolean boolean20 = stackAr13.equals((java.lang.Object) 100);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (byte) 1);
        boolean boolean25 = stackAr22.isFull();
        boolean boolean26 = stackAr22.isFull();
        int int27 = stackAr22.size();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '#');
        boolean boolean31 = stackAr29.equals((java.lang.Object) (byte) 1);
        stackAr29.push((java.lang.Object) "[]");
        stackAr22.push((java.lang.Object) stackAr29);
        boolean boolean35 = stackAr13.equals((java.lang.Object) stackAr29);
        java.lang.Class<?> wildcardClass36 = stackAr29.getClass();
        boolean boolean37 = stackAr1.equals((java.lang.Object) wildcardClass36);
        boolean boolean38 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isFull();
        int int13 = stackAr7.size();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '#');
        boolean boolean16 = stackAr15.isEmpty();
        int int17 = stackAr15.size();
        boolean boolean18 = stackAr15.isEmpty();
        boolean boolean19 = stackAr7.equals((java.lang.Object) stackAr15);
        java.lang.String str20 = stackAr15.toString();
        boolean boolean21 = stackAr1.equals((java.lang.Object) str20);
        java.lang.String str22 = stackAr1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isFull();
        int int13 = stackAr7.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) 'a');
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        java.lang.String str17 = stackAr1.toString();
        int int18 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr9.isFull();
        java.lang.String str16 = stackAr9.toString();
        boolean boolean17 = stackAr1.equals((java.lang.Object) str16);
        boolean boolean18 = stackAr1.isEmpty();
        boolean boolean19 = stackAr1.isEmpty();
        boolean boolean20 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        int int14 = stackAr10.size();
        boolean boolean15 = stackAr7.equals((java.lang.Object) stackAr10);
        boolean boolean16 = stackAr1.equals((java.lang.Object) boolean15);
        int int17 = stackAr1.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        int int19 = stackAr18.size();
        java.lang.Object[] objArray25 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean26 = org.autotest.StackAr.repOkFunction((int) 'a', objArray25);
        boolean boolean27 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray25);
        boolean boolean28 = stackAr18.equals((java.lang.Object) (byte) 10);
        java.lang.String str29 = stackAr18.toString();
        java.lang.String str30 = stackAr18.toString();
        java.lang.String str31 = stackAr18.toString();
        stackAr1.push((java.lang.Object) str31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean8 = org.autotest.StackAr.repOkFunction((int) 'a', objArray7);
        boolean boolean9 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray7);
        boolean boolean10 = stackAr0.equals((java.lang.Object) (byte) 10);
        java.lang.String str11 = stackAr0.toString();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr(0);
        boolean boolean14 = stackAr0.equals((java.lang.Object) 0);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '#');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (byte) 1);
        boolean boolean19 = stackAr16.isFull();
        boolean boolean20 = stackAr16.isFull();
        int int21 = stackAr16.size();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '#');
        boolean boolean25 = stackAr23.equals((java.lang.Object) (byte) 1);
        stackAr23.push((java.lang.Object) "[]");
        stackAr16.push((java.lang.Object) stackAr23);
        java.lang.Object obj29 = stackAr23.pop();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean32 = stackAr31.isFull();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '#');
        boolean boolean35 = stackAr34.isEmpty();
        boolean boolean36 = stackAr34.isEmpty();
        int int37 = stackAr34.size();
        int int38 = stackAr34.size();
        boolean boolean39 = stackAr31.equals((java.lang.Object) stackAr34);
        boolean boolean40 = stackAr23.equals((java.lang.Object) boolean39);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '#');
        boolean boolean44 = stackAr42.equals((java.lang.Object) (byte) 100);
        boolean boolean45 = stackAr42.isEmpty();
        boolean boolean46 = stackAr42.isEmpty();
        java.lang.String str47 = stackAr42.toString();
        boolean boolean48 = stackAr42.isEmpty();
        int int49 = stackAr42.size();
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '#');
        boolean boolean53 = stackAr51.equals((java.lang.Object) (byte) 100);
        boolean boolean54 = stackAr51.isEmpty();
        boolean boolean55 = stackAr51.isEmpty();
        boolean boolean56 = stackAr42.equals((java.lang.Object) stackAr51);
        stackAr23.push((java.lang.Object) stackAr51);
        stackAr0.push((java.lang.Object) stackAr51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "[]" + "'", obj29, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 0.0f);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean8 = stackAr1.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '#');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (byte) 1);
        boolean boolean13 = stackAr10.isFull();
        boolean boolean14 = stackAr10.isFull();
        boolean boolean15 = stackAr10.isFull();
        int int16 = stackAr10.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '#');
        boolean boolean20 = stackAr18.equals((java.lang.Object) (byte) 1);
        boolean boolean21 = stackAr18.isFull();
        java.lang.Object obj22 = new java.lang.Object();
        stackAr18.push(obj22);
        boolean boolean24 = stackAr10.equals(obj22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '#');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (byte) 1);
        boolean boolean29 = stackAr26.isFull();
        boolean boolean30 = stackAr26.isFull();
        boolean boolean31 = stackAr26.isFull();
        int int32 = stackAr26.size();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '#');
        boolean boolean36 = stackAr34.equals((java.lang.Object) (byte) 1);
        boolean boolean37 = stackAr34.isFull();
        java.lang.Object obj38 = new java.lang.Object();
        stackAr34.push(obj38);
        boolean boolean40 = stackAr26.equals(obj38);
        stackAr10.push((java.lang.Object) stackAr26);
        boolean boolean42 = stackAr26.isEmpty();
        boolean boolean43 = stackAr26.isEmpty();
        stackAr1.push((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '4');
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[4]" + "'", str7, "[4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[4]" + "'", str8, "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        boolean boolean8 = stackAr1.equals((java.lang.Object) 'a');
        int int9 = stackAr1.size();
        int int10 = stackAr1.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (byte) 1);
        java.lang.String str15 = stackAr12.toString();
        boolean boolean16 = stackAr12.isEmpty();
        int int17 = stackAr12.size();
        boolean boolean18 = stackAr1.equals((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr12.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 1);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '#');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 1);
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr14.isFull();
        stackAr14.push((java.lang.Object) 1);
        boolean boolean19 = stackAr14.isEmpty();
        boolean boolean20 = stackAr7.equals((java.lang.Object) stackAr14);
        java.lang.String str21 = stackAr7.toString();
        boolean boolean22 = stackAr1.equals((java.lang.Object) str21);
        java.lang.Object obj23 = null;
        boolean boolean24 = stackAr1.equals(obj23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        int int6 = stackAr1.size();
        java.lang.String str7 = stackAr1.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.String str13 = stackAr9.toString();
        int int14 = stackAr9.size();
        stackAr1.push((java.lang.Object) stackAr9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[]]" + "'", str7, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 100);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        boolean boolean13 = stackAr12.isEmpty();
        int int14 = stackAr12.size();
        boolean boolean16 = stackAr12.equals((java.lang.Object) 100L);
        boolean boolean17 = stackAr12.isFull();
        stackAr8.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr8.isFull();
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (byte) 1);
        stackAr22.push((java.lang.Object) "[]");
        java.lang.Object obj27 = stackAr22.top();
        boolean boolean28 = stackAr8.equals((java.lang.Object) stackAr22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "[]" + "'", obj27, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '#');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = new java.lang.Object();
        stackAr9.push(obj13);
        boolean boolean15 = stackAr9.isFull();
        java.lang.String str16 = stackAr9.toString();
        boolean boolean17 = stackAr1.equals((java.lang.Object) str16);
        boolean boolean18 = stackAr1.isEmpty();
        boolean boolean19 = stackAr1.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '#');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (byte) 1);
        boolean boolean24 = stackAr21.isFull();
        boolean boolean25 = stackAr21.isFull();
        stackAr1.push((java.lang.Object) boolean25);
        boolean boolean27 = stackAr1.isFull();
        boolean boolean28 = stackAr1.isEmpty();
        java.lang.Object obj29 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr(0);
        stackAr1.push((java.lang.Object) 0);
        int int10 = stackAr1.size();
        boolean boolean11 = stackAr1.isFull();
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        stackAr8.push((java.lang.Object) "[]");
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj14 = stackAr8.pop();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr8.equals((java.lang.Object) (short) 1);
        int int18 = stackAr8.size();
        java.lang.Object[] objArray27 = new java.lang.Object[] { "[]", 0, (byte) 1 };
        boolean boolean28 = org.autotest.StackAr.repOkFunction((int) 'a', objArray27);
        boolean boolean29 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray27);
        boolean boolean30 = org.autotest.StackAr.repOkFunction(100, objArray27);
        boolean boolean31 = org.autotest.StackAr.repOkFunction((int) (byte) 10, objArray27);
        boolean boolean32 = org.autotest.StackAr.repOkFunction((int) '#', objArray27);
        stackAr8.push((java.lang.Object) '#');
        boolean boolean34 = stackAr8.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "[]" + "'", obj14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[], 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[[], 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (short) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '#');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) '4');
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str15 = stackAr1.toString();
        boolean boolean16 = stackAr1.isEmpty();
        boolean boolean17 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[4]]" + "'", str15, "[[4]]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) "[]");
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.String str8 = stackAr1.toString();
        int int9 = stackAr1.size();
        int int10 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "[]" + "'", obj6, "[]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "[]" + "'", obj7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[]]" + "'", str8, "[[]]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        int int6 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = new java.lang.Object();
        stackAr1.push(obj5);
        boolean boolean8 = stackAr1.equals((java.lang.Object) (byte) -1);
        int int9 = stackAr1.size();
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
    }
}

