package dataflow.abs;

/**
* Lattice used in the DivisionByZeroAnalysis.
*/
public enum ZeroLattice {
  
  BOTTOM("bottom"), NOT_ZERO("not-zero"), ZERO("zero"), MAYBE_ZERO("maybe-zero");
  
  private String name;
  
  @Override
  public String toString() {
    return this.name;
  }
  
  ZeroLattice(String name) {
    this.name = name;
  }
  /**
  * Los unicos casos en los que podemos saber en la suma si el resultado es o no cero es cuando tenemos certezas de ambos operandos,
  * cualquier otro caso nos da un MAYBE_ZERO
  * @author Guido Tripodi
  */
  public ZeroLattice add(ZeroLattice another) {
    ZeroLattice result = MAYBE_ZERO;
    if(this == NOT_ZERO && another == ZERO){
      result = NOT_ZERO;
    }
    if(this == ZERO && another == NOT_ZERO){
      result = NOT_ZERO;
    }
    if(this == ZERO && another == ZERO){
      result = ZERO;
    }
    return result;
  }
  
  /**
  * La unica forma de que una division de cero es que el dividendo sea cero y el divisor distinto a cero. Asi como la unica forma
  * de estar seguros de que no es cero es que ambos operandos no sean ceros
  * @author Guido Tripodi
  */
  public ZeroLattice divideBy(ZeroLattice another) {
    ZeroLattice result = MAYBE_ZERO;
    if(this == ZERO && another == NOT_ZERO){
      result = ZERO;
    }
    if(this == NOT_ZERO && another == NOT_ZERO){
      result = NOT_ZERO;
    }
    return result;
  }
  
  /**
  * Si alguno de los operandos es cero => da cero, si ninguno lo es => el resultado tampoco. Todo otro caso no se puede determinar
  * @author Guido Tripodi
  */
  public ZeroLattice multiplyBy(ZeroLattice another) {
    ZeroLattice result = MAYBE_ZERO;
    if(another == ZERO || this == ZERO){
      result = ZERO;
    }
    if(another == NOT_ZERO || this == NOT_ZERO){
      result = NOT_ZERO;
    }
    return result;
  }
  
    /**
  * Solo puedo asegurar que da cero la resta entre ceros. Asi como solo puedo saber que no es cero cuando uno de los operandos lo es y el otro no
  * @author Guido Tripodi
  */
  public ZeroLattice substract(ZeroLattice another) {
    ZeroLattice result = MAYBE_ZERO;
    if(this == NOT_ZERO && another == ZERO){
      result = NOT_ZERO;
    }
    if(this == ZERO && another == NOT_ZERO){
      result = NOT_ZERO;
    }
    if(this == ZERO && another == ZERO){
      result = ZERO;
    }
    
    return result;
  }
  
 /**
  * Entre los valores definidos y los no definidos (bottom), en un merge va a ganar el valor definido. Entre un valor definido y un valor en duda (maybe) siempre gana el valor en duda
  ya que en caso contrario estariamos arriesgandonos a efectuar un falso positivo (es decir, decir que no hay division por cero cuando la puede haber)
  * @author Guido Tripodi
  */
  public ZeroLattice supreme(ZeroLattice another) {
    ZeroLattice result = MAYBE_ZERO;
    
    if(this!=MAYBE_ZERO && another!=MAYBE_ZERO){
      if(this==ZERO && another == NOT_ZERO || this==NOT_ZERO && another == ZERO){
        result = MAYBE_ZERO;
      }else{
        if(this==BOTTOM){
          result = another;
        }else{
          result = this;
        }
      }
    }else{
      result = MAYBE_ZERO;
    }
    return result;
  }
  
}
