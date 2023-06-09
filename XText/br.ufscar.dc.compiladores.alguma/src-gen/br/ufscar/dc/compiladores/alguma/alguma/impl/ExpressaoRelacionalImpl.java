/**
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma.alguma.impl;

import br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage;
import br.ufscar.dc.compiladores.alguma.alguma.ExpressaoRelacional;
import br.ufscar.dc.compiladores.alguma.alguma.OutroTermoRelacional;
import br.ufscar.dc.compiladores.alguma.alguma.TermoRelacional;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expressao Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.impl.ExpressaoRelacionalImpl#getTermo1 <em>Termo1</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.impl.ExpressaoRelacionalImpl#getOutrosTermos <em>Outros Termos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressaoRelacionalImpl extends MinimalEObjectImpl.Container implements ExpressaoRelacional
{
  /**
   * The cached value of the '{@link #getTermo1() <em>Termo1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermo1()
   * @generated
   * @ordered
   */
  protected TermoRelacional termo1;

  /**
   * The cached value of the '{@link #getOutrosTermos() <em>Outros Termos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutrosTermos()
   * @generated
   * @ordered
   */
  protected EList<OutroTermoRelacional> outrosTermos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressaoRelacionalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlgumaPackage.Literals.EXPRESSAO_RELACIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TermoRelacional getTermo1()
  {
    return termo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTermo1(TermoRelacional newTermo1, NotificationChain msgs)
  {
    TermoRelacional oldTermo1 = termo1;
    termo1 = newTermo1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1, oldTermo1, newTermo1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTermo1(TermoRelacional newTermo1)
  {
    if (newTermo1 != termo1)
    {
      NotificationChain msgs = null;
      if (termo1 != null)
        msgs = ((InternalEObject)termo1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1, null, msgs);
      if (newTermo1 != null)
        msgs = ((InternalEObject)newTermo1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1, null, msgs);
      msgs = basicSetTermo1(newTermo1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1, newTermo1, newTermo1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OutroTermoRelacional> getOutrosTermos()
  {
    if (outrosTermos == null)
    {
      outrosTermos = new EObjectContainmentEList<OutroTermoRelacional>(OutroTermoRelacional.class, this, AlgumaPackage.EXPRESSAO_RELACIONAL__OUTROS_TERMOS);
    }
    return outrosTermos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1:
        return basicSetTermo1(null, msgs);
      case AlgumaPackage.EXPRESSAO_RELACIONAL__OUTROS_TERMOS:
        return ((InternalEList<?>)getOutrosTermos()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1:
        return getTermo1();
      case AlgumaPackage.EXPRESSAO_RELACIONAL__OUTROS_TERMOS:
        return getOutrosTermos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1:
        setTermo1((TermoRelacional)newValue);
        return;
      case AlgumaPackage.EXPRESSAO_RELACIONAL__OUTROS_TERMOS:
        getOutrosTermos().clear();
        getOutrosTermos().addAll((Collection<? extends OutroTermoRelacional>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1:
        setTermo1((TermoRelacional)null);
        return;
      case AlgumaPackage.EXPRESSAO_RELACIONAL__OUTROS_TERMOS:
        getOutrosTermos().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlgumaPackage.EXPRESSAO_RELACIONAL__TERMO1:
        return termo1 != null;
      case AlgumaPackage.EXPRESSAO_RELACIONAL__OUTROS_TERMOS:
        return outrosTermos != null && !outrosTermos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressaoRelacionalImpl
