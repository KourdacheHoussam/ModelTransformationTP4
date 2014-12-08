/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Constraint#getConstrainttransition <em>Constrainttransition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constrainttransition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrainttransition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrainttransition</em>' container reference.
	 * @see #setConstrainttransition(Transition)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getConstraint_Constrainttransition()
	 * @see fr.houssam.transformation.model.statemachine.Transition#getGuard
	 * @model opposite="guard" transient="false"
	 * @generated
	 */
	Transition getConstrainttransition();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Constraint#getConstrainttransition <em>Constrainttransition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrainttransition</em>' container reference.
	 * @see #getConstrainttransition()
	 * @generated
	 */
	void setConstrainttransition(Transition value);

} // Constraint
