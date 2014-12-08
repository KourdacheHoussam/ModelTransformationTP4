/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Transition#getTransitionregion <em>Transitionregion</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Transition#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Constraint#getConstrainttransition <em>Constrainttransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Constraint)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTransition_Guard()
	 * @see fr.houssam.transformation.model.statemachine.Constraint#getConstrainttransition
	 * @model opposite="constrainttransition" containment="true"
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Constraint value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTransition_Source()
	 * @see fr.houssam.transformation.model.statemachine.Vertex#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTransition_Target()
	 * @see fr.houssam.transformation.model.statemachine.Vertex#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Transitionregion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitionregion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitionregion</em>' container reference.
	 * @see #setTransitionregion(Region)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTransition_Transitionregion()
	 * @see fr.houssam.transformation.model.statemachine.Region#getTransition
	 * @model opposite="transition" required="true" transient="false"
	 * @generated
	 */
	Region getTransitionregion();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Transition#getTransitionregion <em>Transitionregion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitionregion</em>' container reference.
	 * @see #getTransitionregion()
	 * @generated
	 */
	void setTransitionregion(Region value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link fr.houssam.transformation.model.statemachine.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTransition_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Behavior#getBehaviortransition <em>Behaviortransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(Behavior)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTransition_Effect()
	 * @see fr.houssam.transformation.model.statemachine.Behavior#getBehaviortransition
	 * @model opposite="behaviortransition" containment="true"
	 * @generated
	 */
	Behavior getEffect();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Transition#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Behavior value);

} // Transition
