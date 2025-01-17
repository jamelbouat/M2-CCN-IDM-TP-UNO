/**
 * generated by Xtext 2.23.0
 */
package org.xtext.gameuno.unoDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.gameuno.unoDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.gameuno.unoDsl.UnoDslPackage
 * @generated
 */
public class UnoDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UnoDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnoDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UnoDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UnoDslPackage.UNO_DSL:
      {
        UnoDsl unoDsl = (UnoDsl)theEObject;
        T result = caseUnoDsl(unoDsl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UnoDslPackage.REGLE_JEU:
      {
        RegleJeu regleJeu = (RegleJeu)theEObject;
        T result = caseRegleJeu(regleJeu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UnoDslPackage.EXIGENCE:
      {
        Exigence exigence = (Exigence)theEObject;
        T result = caseExigence(exigence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UnoDslPackage.CARTE:
      {
        Carte carte = (Carte)theEObject;
        T result = caseCarte(carte);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UnoDslPackage.CARTE_CLASSIQUE:
      {
        CarteClassique carteClassique = (CarteClassique)theEObject;
        T result = caseCarteClassique(carteClassique);
        if (result == null) result = caseCarte(carteClassique);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UnoDslPackage.CARTE_ACTIVE:
      {
        CarteActive carteActive = (CarteActive)theEObject;
        T result = caseCarteActive(carteActive);
        if (result == null) result = caseCarte(carteActive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uno Dsl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uno Dsl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnoDsl(UnoDsl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regle Jeu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regle Jeu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegleJeu(RegleJeu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exigence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exigence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExigence(Exigence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Carte</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Carte</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCarte(Carte object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Carte Classique</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Carte Classique</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCarteClassique(CarteClassique object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Carte Active</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Carte Active</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCarteActive(CarteActive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UnoDslSwitch
