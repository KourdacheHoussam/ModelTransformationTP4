/**
 */
package fr.houssam.transformation.model.statemachine.impl;

import fr.houssam.transformation.model.statemachine.Behavior;
import fr.houssam.transformation.model.statemachine.BehavioralFeature;
import fr.houssam.transformation.model.statemachine.BehavioredClassifier;
import fr.houssam.transformation.model.statemachine.CallEvent;
import fr.houssam.transformation.model.statemachine.Constraint;
import fr.houssam.transformation.model.statemachine.Event;
import fr.houssam.transformation.model.statemachine.FinalState;
import fr.houssam.transformation.model.statemachine.MessageEvent;
import fr.houssam.transformation.model.statemachine.NamedElement;
import fr.houssam.transformation.model.statemachine.OpaqueBehavior;
import fr.houssam.transformation.model.statemachine.Operation;
import fr.houssam.transformation.model.statemachine.PseudoState;
import fr.houssam.transformation.model.statemachine.PseudoStateKind;
import fr.houssam.transformation.model.statemachine.Region;
import fr.houssam.transformation.model.statemachine.State;
import fr.houssam.transformation.model.statemachine.StateMachine;
import fr.houssam.transformation.model.statemachine.StatemachineFactory;
import fr.houssam.transformation.model.statemachine.StatemachinePackage;
import fr.houssam.transformation.model.statemachine.Transition;
import fr.houssam.transformation.model.statemachine.Trigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachineFactoryImpl extends EFactoryImpl implements StatemachineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatemachineFactory init() {
		try {
			StatemachineFactory theStatemachineFactory = (StatemachineFactory)EPackage.Registry.INSTANCE.getEFactory(StatemachinePackage.eNS_URI);
			if (theStatemachineFactory != null) {
				return theStatemachineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatemachineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatemachinePackage.CLASS: return createClass();
			case StatemachinePackage.STATE_MACHINE: return createStateMachine();
			case StatemachinePackage.NAMED_ELEMENT: return createNamedElement();
			case StatemachinePackage.BEHAVIORED_CLASSIFIER: return createBehavioredClassifier();
			case StatemachinePackage.REGION: return createRegion();
			case StatemachinePackage.BEHAVIOR: return createBehavior();
			case StatemachinePackage.OPAQUE_BEHAVIOR: return createOpaqueBehavior();
			case StatemachinePackage.TRANSITION: return createTransition();
			case StatemachinePackage.PSEUDO_STATE: return createPseudoState();
			case StatemachinePackage.STATE: return createState();
			case StatemachinePackage.FINAL_STATE: return createFinalState();
			case StatemachinePackage.EVENT: return createEvent();
			case StatemachinePackage.MESSAGE_EVENT: return createMessageEvent();
			case StatemachinePackage.CALL_EVENT: return createCallEvent();
			case StatemachinePackage.OPERATION: return createOperation();
			case StatemachinePackage.BEHAVIORAL_FEATURE: return createBehavioralFeature();
			case StatemachinePackage.TRIGGER: return createTrigger();
			case StatemachinePackage.CONSTRAINT: return createConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StatemachinePackage.PSEUDO_STATE_KIND:
				return createPseudoStateKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StatemachinePackage.PSEUDO_STATE_KIND:
				return convertPseudoStateKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.houssam.transformation.model.statemachine.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier createBehavioredClassifier() {
		BehavioredClassifierImpl behavioredClassifier = new BehavioredClassifierImpl();
		return behavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior createOpaqueBehavior() {
		OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
		return opaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoState createPseudoState() {
		PseudoStateImpl pseudoState = new PseudoStateImpl();
		return pseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent createMessageEvent() {
		MessageEventImpl messageEvent = new MessageEventImpl();
		return messageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEvent createCallEvent() {
		CallEventImpl callEvent = new CallEventImpl();
		return callEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature createBehavioralFeature() {
		BehavioralFeatureImpl behavioralFeature = new BehavioralFeatureImpl();
		return behavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoStateKind createPseudoStateKindFromString(EDataType eDataType, String initialValue) {
		PseudoStateKind result = PseudoStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudoStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachinePackage getStatemachinePackage() {
		return (StatemachinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatemachinePackage getPackage() {
		return StatemachinePackage.eINSTANCE;
	}

} //StatemachineFactoryImpl
