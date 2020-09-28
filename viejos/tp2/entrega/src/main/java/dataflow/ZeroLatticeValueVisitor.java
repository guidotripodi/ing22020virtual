package dataflow;

import static dataflow.abs.ZeroLattice.MAYBE_ZERO;
import static dataflow.abs.ZeroLattice.NOT_ZERO;
import static dataflow.abs.ZeroLattice.ZERO;

import java.util.Map;

import dataflow.abs.ZeroLattice;
import dataflow.utils.AbstractValueVisitor;
import dataflow.utils.ValueVisitor;
import soot.Local;

public class ZeroLatticeValueVisitor extends AbstractValueVisitor<ZeroLattice> {

  private final Map<String, ZeroLattice> variables;
  private ZeroLattice resolvedValue = ZeroLattice.BOTTOM;
  private Boolean possibleDivisionByZero;

  public ZeroLatticeValueVisitor(Map<String, ZeroLattice> variables) {
    this.variables = variables;
    this.possibleDivisionByZero = false;
  }

  @Override
  public void visitLocal(Local variable) {
    resolvedValue = variables.get(variable.getName());
  }
 /**
 * Se analiza la division con el metodo del ZeroLattice correspondiente a la division. Se informa una posible division por cero si el divisor es cualquier cosa menos NOT_ZERO:
 * De ser MAYBE_ZERO, hay chance de que el operando sea cero, al igual que BOTTOM y trivialmente ZERO
 * @author Esteban Rey
 */
  @Override
  public void visitDivExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
    // Tener en cuenta que this.possibleDivisionByZero indica que hay una posible division.
    resolvedValue = leftOperand.divideBy(rightOperand);
    this.possibleDivisionByZero = rightOperand!=NOT_ZERO;
  }
  

  @Override
  public void visitMulExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
    resolvedValue = leftOperand.multiplyBy(rightOperand);
  }

  @Override
  public void visitSubExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
    resolvedValue = leftOperand.substract(rightOperand);
  }

  @Override
  public void visitAddExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
    resolvedValue = leftOperand.add(rightOperand);
  }
 /**
 * Como se recibe un int, es decir una variable primitiva de Java distinta a un puntero, el tipo abstracto nunca va a poder ser BOTTOM, y dado 
 * que podemos saber si efectivamente es cero o no, nos decidimos por alguna de las dos ZeroLattice
 * 
 * @author Guido Tripodi
 */
  @Override
  public void visitIntegerConstant(int value) {
    // Tener en cuenta que this.resolvedValue contiene el valor abstracto que se quiere devolver.
    this.resolvedValue = value==0?ZERO:NOT_ZERO;
  }

  @Override
  public ZeroLattice done() {
    return resolvedValue;
  }

  @Override
  public ValueVisitor cloneVisitor() {
    return new ZeroLatticeValueVisitor(variables);
  }

  public Boolean getPossibleDivisionByZero() {
    return possibleDivisionByZero;
  }
}
