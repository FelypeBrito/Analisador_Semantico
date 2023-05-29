/**
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma.alguma;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outro Fator Aritmetico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.OutroFatorAritmetico#getOperador <em>Operador</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.OutroFatorAritmetico#getFator <em>Fator</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getOutroFatorAritmetico()
 * @model
 * @generated
 */
public interface OutroFatorAritmetico extends EObject
{
  /**
   * Returns the value of the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador</em>' attribute.
   * @see #setOperador(String)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getOutroFatorAritmetico_Operador()
   * @model
   * @generated
   */
  String getOperador();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.OutroFatorAritmetico#getOperador <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador</em>' attribute.
   * @see #getOperador()
   * @generated
   */
  void setOperador(String value);

  /**
   * Returns the value of the '<em><b>Fator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fator</em>' containment reference.
   * @see #setFator(FatorAritmetico)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getOutroFatorAritmetico_Fator()
   * @model containment="true"
   * @generated
   */
  FatorAritmetico getFator();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.OutroFatorAritmetico#getFator <em>Fator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fator</em>' containment reference.
   * @see #getFator()
   * @generated
   */
  void setFator(FatorAritmetico value);

} // OutroFatorAritmetico
