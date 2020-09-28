package dataflow.abs;

public enum ZeroAbstractValue {

  NOT_ZERO("not-zero"), ZERO("zero"), MAYBE_ZERO("maybe-zero");

  private String name;

  @Override
  public String toString() {
    return this.name;
  }

  ZeroAbstractValue(String name) {
    this.name = name;
  }

  public ZeroAbstractValue add(ZeroAbstractValue another) {

    throw new UnsupportedOperationException();
  }
  

  public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
    throw new UnsupportedOperationException();
  }
  

  public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
    throw new UnsupportedOperationException();
  }
  

  public ZeroAbstractValue substract(ZeroAbstractValue another) {
    throw new UnsupportedOperationException();
  }
  

  public ZeroAbstractValue merge(ZeroAbstractValue another) {
    throw new UnsupportedOperationException();
  }
  
}
