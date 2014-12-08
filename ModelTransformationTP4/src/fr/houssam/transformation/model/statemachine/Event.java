/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Event#getEventtrigger <em>Eventtrigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Eventtrigger</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventtrigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventtrigger</em>' reference.
	 * @see #setEventtrigger(Trigger)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getEvent_Eventtrigger()
	 * @see fr.houssam.transformation.model.statemachine.Trigger#getEvent
	 * @model opposite="event"
	 * @generated
	 */
	Trigger getEventtrigger();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Event#getEventtrigger <em>Eventtrigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventtrigger</em>' reference.
	 * @see #getEventtrigger()
	 * @generated
	 */
	void setEventtrigger(Trigger value);

} // Event
