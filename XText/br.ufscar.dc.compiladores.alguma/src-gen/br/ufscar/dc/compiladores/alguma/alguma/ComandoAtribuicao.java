/**
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma.alguma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comando Atribuicao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoAtribuicao#getExp <em>Exp</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoAtribuicao#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getComandoAtribuicao()
 * @model
 * @generated
 */
public interface ComandoAtribuicao extends Comando
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ExpressaoAritmetica)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getComandoAtribuicao_Exp()
   * @model containment="true"
   * @generated
   */
  ExpressaoAritmetica getExp();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoAtribuicao#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ExpressaoAritmetica value);

  /**
   * Returns the value of the '<em><b>Variavel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavel</em>' reference.
   * @see #setVariavel(Declaracao)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getComandoAtribuicao_Variavel()
   * @model
   * @generated
   */
  Declaracao getVariavel();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoAtribuicao#getVariavel <em>Variavel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavel</em>' reference.
   * @see #getVariavel()
   * @generated
   */
  void setVariavel(Declaracao value);

} // ComandoAtribuicao