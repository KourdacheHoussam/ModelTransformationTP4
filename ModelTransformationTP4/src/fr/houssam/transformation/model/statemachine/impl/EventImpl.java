/**
 */
package fr.houssam.transformation.model.statemachine.impl;

import fr.houssam.transformation.model.statemachine.Event;
import fr.houssam.transformation.model.statemachine.StatemachinePackage;
import fr.houssam.transformation.model.statemachine.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.impl.EventImpl#getEventtrigger <em>Eventtrigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The cached value of the '{@link #getEventtrigger() <em>Eventtrigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventtrigger()
	 * @generated
	 * @ordered
	 */
	protected Trigger eventtrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getEventtrigger() {
		if (eventtrigger != null && eventtrigger.eIsProxy()) {
			InternalEObject oldEventtrigger = (InternalEObject)eventtrigger;
			eventtrigger = (Trigger)eResolveProxy(oldEventtrigger);
			if (eventtrigger != oldEventtrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.EVENT__EVENTTRIGGER, oldEventtrigger, eventtrigger));
			}
		}
		return eventtrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetEventtrigger() {
		return eventtrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventtrigger(Trigger newEventtrigger, NotificationChain msgs) {
		Trigger oldEventtrigger = eventtrigger;
		eventtrigger = newEventtrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.EVENT__EVENTTRIGGER, oldEventtrigger, newEventtrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventtrigger(Trigger newEventtrigger) {
		if (newEventtrigger != eventtrigger) {
			NotificationChain msgs = null;
			if (eventtrigger != null)
				msgs = ((InternalEObject)eventtrigger).eInverseRemove(this, StatemachinePackage.TRIGGER__EVENT, Trigger.class, msgs);
			if (newEventtrigger != null)
				msgs = ((InternalEObject)newEventtrigger).eInverseAdd(this, StatemachinePackage.TRIGGER__EVENT, Trigger.class, msgs);
			msgs = basicSetEventtrigger(newEventtrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.EVENT__EVENTTRIGGER, newEventtrigger, newEventtrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.EVENT__EVENTTRIGGER:
				if (eventtrigger != null)
					msgs = ((InternalEObject)eventtrigger).eInverseRemove(this, StatemachinePackage.TRIGGER__EVENT, Trigger.class, msgs);
				return basicSetEventtrigger((Trigger)otherEnd, msgs);
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
			case StatemachinePackage.EVENT__EVENTTRIGGER:
				return basicSetEventtrigger(null, msgs);
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
			case StatemachinePackage.EVENT__EVENTTRIGGER:
				if (resolve) return getEventtrigger();
				return basicGetEventtrigger();
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
			case StatemachinePackage.EVENT__EVENTTRIGGER:
				setEventtrigger((Trigger)newValue);
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
			case StatemachinePackage.EVENT__EVENTTRIGGER:
				setEventtrigger((Trigger)null);
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
			case StatemachinePackage.EVENT__EVENTTRIGGER:
				return eventtrigger != null;
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
