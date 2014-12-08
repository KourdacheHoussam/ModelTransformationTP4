/**
 */
package fr.houssam.transformation.model.statemachine.impl;

import fr.houssam.transformation.model.statemachine.Behavior;
import fr.houssam.transformation.model.statemachine.BehavioralFeature;
import fr.houssam.transformation.model.statemachine.BehavioredClassifier;
import fr.houssam.transformation.model.statemachine.StatemachinePackage;
import fr.houssam.transformation.model.statemachine.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.impl.BehaviorImpl#getBehaviortransition <em>Behaviortransition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends MinimalEObjectImpl.Container implements Behavior {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature specification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (BehavioralFeature)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.BEHAVIOR__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BehavioralFeature newSpecification, NotificationChain msgs) {
		BehavioralFeature oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.BEHAVIOR__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(BehavioralFeature newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, StatemachinePackage.BEHAVIORAL_FEATURE__BEHAVIOR, BehavioralFeature.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, StatemachinePackage.BEHAVIORAL_FEATURE__BEHAVIOR, BehavioralFeature.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.BEHAVIOR__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getContext() {
		if (eContainerFeatureID() != StatemachinePackage.BEHAVIOR__CONTEXT) return null;
		return (BehavioredClassifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(BehavioredClassifier newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, StatemachinePackage.BEHAVIOR__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(BehavioredClassifier newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.BEHAVIOR__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, StatemachinePackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.BEHAVIOR__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getBehaviortransition() {
		if (eContainerFeatureID() != StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION) return null;
		return (Transition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviortransition(Transition newBehaviortransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBehaviortransition, StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviortransition(Transition newBehaviortransition) {
		if (newBehaviortransition != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION && newBehaviortransition != null)) {
			if (EcoreUtil.isAncestor(this, newBehaviortransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBehaviortransition != null)
				msgs = ((InternalEObject)newBehaviortransition).eInverseAdd(this, StatemachinePackage.TRANSITION__EFFECT, Transition.class, msgs);
			msgs = basicSetBehaviortransition(newBehaviortransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION, newBehaviortransition, newBehaviortransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.BEHAVIOR__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, StatemachinePackage.BEHAVIORAL_FEATURE__BEHAVIOR, BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
			case StatemachinePackage.BEHAVIOR__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((BehavioredClassifier)otherEnd, msgs);
			case StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBehaviortransition((Transition)otherEnd, msgs);
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
			case StatemachinePackage.BEHAVIOR__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case StatemachinePackage.BEHAVIOR__CONTEXT:
				return basicSetContext(null, msgs);
			case StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION:
				return basicSetBehaviortransition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatemachinePackage.BEHAVIOR__CONTEXT:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
			case StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.TRANSITION__EFFECT, Transition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatemachinePackage.BEHAVIOR__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case StatemachinePackage.BEHAVIOR__CONTEXT:
				return getContext();
			case StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION:
				return getBehaviortransition();
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
			case StatemachinePackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case StatemachinePackage.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION:
				setBehaviortransition((Transition)newValue);
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
			case StatemachinePackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case StatemachinePackage.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)null);
				return;
			case StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION:
				setBehaviortransition((Transition)null);
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
			case StatemachinePackage.BEHAVIOR__SPECIFICATION:
				return specification != null;
			case StatemachinePackage.BEHAVIOR__CONTEXT:
				return getContext() != null;
			case StatemachinePackage.BEHAVIOR__BEHAVIORTRANSITION:
				return getBehaviortransition() != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorImpl
