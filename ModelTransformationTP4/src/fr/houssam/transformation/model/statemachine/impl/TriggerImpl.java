/**
 */
package fr.houssam.transformation.model.statemachine.impl;

import fr.houssam.transformation.model.statemachine.Event;
import fr.houssam.transformation.model.statemachine.StatemachinePackage;
import fr.houssam.transformation.model.statemachine.Transition;
import fr.houssam.transformation.model.statemachine.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.impl.TriggerImpl#getTriggertransition <em>Triggertransition</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.impl.TriggerImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The cached value of the '{@link #getTriggertransition() <em>Triggertransition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggertransition()
	 * @generated
	 * @ordered
	 */
	protected Transition triggertransition;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * This is true if the Event reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTriggertransition() {
		if (triggertransition != null && triggertransition.eIsProxy()) {
			InternalEObject oldTriggertransition = (InternalEObject)triggertransition;
			triggertransition = (Transition)eResolveProxy(oldTriggertransition);
			if (triggertransition != oldTriggertransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRIGGER__TRIGGERTRANSITION, oldTriggertransition, triggertransition));
			}
		}
		return triggertransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTriggertransition() {
		return triggertransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggertransition(Transition newTriggertransition) {
		Transition oldTriggertransition = triggertransition;
		triggertransition = newTriggertransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRIGGER__TRIGGERTRANSITION, oldTriggertransition, triggertransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (Event)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRIGGER__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
		Event oldEvent = event;
		event = newEvent;
		boolean oldEventESet = eventESet;
		eventESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRIGGER__EVENT, oldEvent, newEvent, !oldEventESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, StatemachinePackage.EVENT__EVENTTRIGGER, Event.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, StatemachinePackage.EVENT__EVENTTRIGGER, Event.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventESet = eventESet;
			eventESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRIGGER__EVENT, newEvent, newEvent, !oldEventESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEvent(NotificationChain msgs) {
		Event oldEvent = event;
		event = null;
		boolean oldEventESet = eventESet;
		eventESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, StatemachinePackage.TRIGGER__EVENT, oldEvent, null, oldEventESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvent() {
		if (event != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)event).eInverseRemove(this, StatemachinePackage.EVENT__EVENTTRIGGER, Event.class, msgs);
			msgs = basicUnsetEvent(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEventESet = eventESet;
			eventESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, StatemachinePackage.TRIGGER__EVENT, null, null, oldEventESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvent() {
		return eventESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.TRIGGER__EVENT:
				if (event != null)
					msgs = ((InternalEObject)event).eInverseRemove(this, StatemachinePackage.EVENT__EVENTTRIGGER, Event.class, msgs);
				return basicSetEvent((Event)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.TRIGGER__EVENT:
				return basicUnsetEvent(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatemachinePackage.TRIGGER__TRIGGERTRANSITION:
				if (resolve) return getTriggertransition();
				return basicGetTriggertransition();
			case StatemachinePackage.TRIGGER__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatemachinePackage.TRIGGER__TRIGGERTRANSITION:
				setTriggertransition((Transition)newValue);
				return;
			case StatemachinePackage.TRIGGER__EVENT:
				setEvent((Event)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatemachinePackage.TRIGGER__TRIGGERTRANSITION:
				setTriggertransition((Transition)null);
				return;
			case StatemachinePackage.TRIGGER__EVENT:
				unsetEvent();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatemachinePackage.TRIGGER__TRIGGERTRANSITION:
				return triggertransition != null;
			case StatemachinePackage.TRIGGER__EVENT:
				return isSetEvent();
		}
		return super.eIsSet(featureID);
	}

} //TriggerImpl
