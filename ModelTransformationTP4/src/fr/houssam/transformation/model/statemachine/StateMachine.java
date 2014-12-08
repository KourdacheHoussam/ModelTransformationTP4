/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.StateMachine#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends Behavior {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link fr.houssam.transformation.model.statemachine.Region}.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Region#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getStateMachine_Region()
	 * @see fr.houssam.transformation.model.statemachine.Region#getMachine
	 * @model opposite="machine" containment="true" required="true" transient="true"
	 * @generated
	 */
	EList<Region> getRegion();

} // StateMachine
