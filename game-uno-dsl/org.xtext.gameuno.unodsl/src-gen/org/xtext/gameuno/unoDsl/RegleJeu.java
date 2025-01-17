/**
 * generated by Xtext 2.23.0
 */
package org.xtext.gameuno.unoDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regle Jeu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.gameuno.unoDsl.RegleJeu#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.gameuno.unoDsl.RegleJeu#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.gameuno.unoDsl.RegleJeu#getExigence <em>Exigence</em>}</li>
 * </ul>
 *
 * @see org.xtext.gameuno.unoDsl.UnoDslPackage#getRegleJeu()
 * @model
 * @generated
 */
public interface RegleJeu extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.gameuno.unoDsl.UnoDslPackage#getRegleJeu_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.gameuno.unoDsl.RegleJeu#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.gameuno.unoDsl.UnoDslPackage#getRegleJeu_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.gameuno.unoDsl.RegleJeu#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Exigence</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.gameuno.unoDsl.Exigence}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exigence</em>' containment reference list.
   * @see org.xtext.gameuno.unoDsl.UnoDslPackage#getRegleJeu_Exigence()
   * @model containment="true"
   * @generated
   */
  EList<Exigence> getExigence();

} // RegleJeu
