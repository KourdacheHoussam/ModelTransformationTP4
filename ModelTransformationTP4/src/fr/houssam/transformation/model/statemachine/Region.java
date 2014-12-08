/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Region#getMachine <em>Machine</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Region#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' container reference.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getRegion_Machine()
	 * @see fr.houssam.transformation.model.statemachine.StateMachine#getRegion
	 * @model opposite="region" changeable="false"
	 * @generated
	 */
	StateMachine getMachine();

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link fr.houssam.transformation.model.statemachine.Vertex}.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Vertex#getRegionvertex <em>Regionvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getRegion_Subvertex()
	 * @see fr.houssam.transformation.model.statemachine.Vertex#getRegionvertex
	 * @model opposite="regionvertex" containment="true"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.houssam.transformation.model.statemachine.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Transition#getTransitionregion <em>Transitionregion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getRegion_Transition()
	 * @see fr.houssam.transformation.model.statemachine.Transition#getTransitionregion
	 * @model opposite="transitionregion" containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Region
