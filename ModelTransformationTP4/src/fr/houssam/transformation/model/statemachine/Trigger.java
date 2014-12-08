/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Trigger#getTriggertransition <em>Triggertransition</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Trigger#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Triggertransition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggertransition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggertransition</em>' reference.
	 * @see #setTriggertransition(Transition)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTrigger_Triggertransition()
	 * @model
	 * @generated
	 */
	Transition getTriggertransition();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Trigger#getTriggertransition <em>Triggertransition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggertransition</em>' reference.
	 * @see #getTriggertransition()
	 * @generated
	 */
	void setTriggertransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Event#getEventtrigger <em>Eventtrigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #isSetEvent()
	 * @see #unsetEvent()
	 * @see #setEvent(Event)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getTrigger_Event()
	 * @see fr.houssam.transformation.model.statemachine.Event#getEventtrigger
	 * @model opposite="eventtrigger" unsettable="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Trigger#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #isSetEvent()
	 * @see #unsetEvent()
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Unsets the value of the '{@link fr.houssam.transformation.model.statemachine.Trigger#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvent()
	 * @see #getEvent()
	 * @see #setEvent(Event)
	 * @generated
	 */
	void unsetEvent();

	/**
	 * Returns whether the value of the '{@link fr.houssam.transformation.model.statemachine.Trigger#getEvent <em>Event</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event</em>' reference is set.
	 * @see #unsetEvent()
	 * @see #getEvent()
	 * @see #setEvent(Event)
	 * @generated
	 */
	boolean isSetEvent();

} // Trigger
