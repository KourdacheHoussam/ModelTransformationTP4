/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.houssam.transformation.model.statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public interface StatemachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/state/machine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.state.machine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachinePackage eINSTANCE = fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.BehavioredClassifierImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getBehavioredClassifier()
	 * @generated
	 */
	int BEHAVIORED_CLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.ClassImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_BEHAVIOR = BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = BEHAVIORED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.BehaviorImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 5;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Behaviortransition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIORTRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.StateMachineImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SPECIFICATION = BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CONTEXT = BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Behaviortransition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__BEHAVIORTRANSITION = BEHAVIOR__BEHAVIORTRANSITION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REGION = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.NamedElementImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.RegionImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUBVERTEX = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.OpaqueBehaviorImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getOpaqueBehavior()
	 * @generated
	 */
	int OPAQUE_BEHAVIOR = 6;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SPECIFICATION = BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CONTEXT = BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Behaviortransition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__BEHAVIORTRANSITION = BEHAVIOR__BEHAVIORTRANSITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__BODY = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__LANGUAGE = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.TransitionImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitionregion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITIONREGION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.VertexImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 8;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regionvertex</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__REGIONVERTEX = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.PseudoStateImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getPseudoState()
	 * @generated
	 */
	int PSEUDO_STATE = 9;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__INCOMING = VERTEX__INCOMING;

	/**
	 * The feature id for the '<em><b>Regionvertex</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__REGIONVERTEX = VERTEX__REGIONVERTEX;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__KIND = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.StateImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 10;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = VERTEX__INCOMING;

	/**
	 * The feature id for the '<em><b>Regionvertex</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REGIONVERTEX = VERTEX__REGIONVERTEX;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.FinalStateImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 11;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Regionvertex</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__REGIONVERTEX = STATE__REGIONVERTEX;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.EventImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The feature id for the '<em><b>Eventtrigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENTTRIGGER = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.MessageEventImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Eventtrigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__EVENTTRIGGER = EVENT__EVENTTRIGGER;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.CallEventImpl <em>Call Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.CallEventImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getCallEvent()
	 * @generated
	 */
	int CALL_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Eventtrigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__EVENTTRIGGER = MESSAGE_EVENT__EVENTTRIGGER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OPERATION = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.BehavioralFeatureImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getBehavioralFeature()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE = 16;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.OperationImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BEHAVIOR = BEHAVIORAL_FEATURE__BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = BEHAVIORAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.TriggerImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 17;

	/**
	 * The feature id for the '<em><b>Triggertransition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TRIGGERTRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.impl.ConstraintImpl
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Constrainttransition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINTTRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.houssam.transformation.model.statemachine.PseudoStateKind <em>Pseudo State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.houssam.transformation.model.statemachine.PseudoStateKind
	 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getPseudoStateKind()
	 * @generated
	 */
	int PSEUDO_STATE_KIND = 19;


	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see fr.houssam.transformation.model.statemachine.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.houssam.transformation.model.statemachine.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see fr.houssam.transformation.model.statemachine.StateMachine#getRegion()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Region();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.houssam.transformation.model.statemachine.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviored Classifier</em>'.
	 * @see fr.houssam.transformation.model.statemachine.BehavioredClassifier
	 * @generated
	 */
	EClass getBehavioredClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.houssam.transformation.model.statemachine.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Behavior</em>'.
	 * @see fr.houssam.transformation.model.statemachine.BehavioredClassifier#getOwnedBehavior()
	 * @see #getBehavioredClassifier()
	 * @generated
	 */
	EReference getBehavioredClassifier_OwnedBehavior();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the container reference '{@link fr.houssam.transformation.model.statemachine.Region#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Machine</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Region#getMachine()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Machine();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.houssam.transformation.model.statemachine.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Region#getSubvertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.houssam.transformation.model.statemachine.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Region#getTransition()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transition();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Behavior#getSpecification()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Specification();

	/**
	 * Returns the meta object for the container reference '{@link fr.houssam.transformation.model.statemachine.Behavior#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Behavior#getContext()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Context();

	/**
	 * Returns the meta object for the container reference '{@link fr.houssam.transformation.model.statemachine.Behavior#getBehaviortransition <em>Behaviortransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Behaviortransition</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Behavior#getBehaviortransition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Behaviortransition();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.OpaqueBehavior <em>Opaque Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior</em>'.
	 * @see fr.houssam.transformation.model.statemachine.OpaqueBehavior
	 * @generated
	 */
	EClass getOpaqueBehavior();

	/**
	 * Returns the meta object for the attribute list '{@link fr.houssam.transformation.model.statemachine.OpaqueBehavior#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Body</em>'.
	 * @see fr.houssam.transformation.model.statemachine.OpaqueBehavior#getBody()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_Body();

	/**
	 * Returns the meta object for the attribute list '{@link fr.houssam.transformation.model.statemachine.OpaqueBehavior#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see fr.houssam.transformation.model.statemachine.OpaqueBehavior#getLanguage()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_Language();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.houssam.transformation.model.statemachine.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the container reference '{@link fr.houssam.transformation.model.statemachine.Transition#getTransitionregion <em>Transitionregion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transitionregion</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Transition#getTransitionregion()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Transitionregion();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.houssam.transformation.model.statemachine.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link fr.houssam.transformation.model.statemachine.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link fr.houssam.transformation.model.statemachine.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Vertex#getOutgoing()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link fr.houssam.transformation.model.statemachine.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Vertex#getIncoming()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link fr.houssam.transformation.model.statemachine.Vertex#getRegionvertex <em>Regionvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Regionvertex</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Vertex#getRegionvertex()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Regionvertex();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.PseudoState <em>Pseudo State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo State</em>'.
	 * @see fr.houssam.transformation.model.statemachine.PseudoState
	 * @generated
	 */
	EClass getPseudoState();

	/**
	 * Returns the meta object for the attribute '{@link fr.houssam.transformation.model.statemachine.PseudoState#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.houssam.transformation.model.statemachine.PseudoState#getKind()
	 * @see #getPseudoState()
	 * @generated
	 */
	EAttribute getPseudoState_Kind();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.houssam.transformation.model.statemachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see fr.houssam.transformation.model.statemachine.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.Event#getEventtrigger <em>Eventtrigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eventtrigger</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Event#getEventtrigger()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Eventtrigger();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see fr.houssam.transformation.model.statemachine.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.CallEvent <em>Call Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Event</em>'.
	 * @see fr.houssam.transformation.model.statemachine.CallEvent
	 * @generated
	 */
	EClass getCallEvent();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.CallEvent#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see fr.houssam.transformation.model.statemachine.CallEvent#getOperation()
	 * @see #getCallEvent()
	 * @generated
	 */
	EReference getCallEvent_Operation();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature</em>'.
	 * @see fr.houssam.transformation.model.statemachine.BehavioralFeature
	 * @generated
	 */
	EClass getBehavioralFeature();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.BehavioralFeature#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see fr.houssam.transformation.model.statemachine.BehavioralFeature#getBehavior()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_Behavior();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.Trigger#getTriggertransition <em>Triggertransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggertransition</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Trigger#getTriggertransition()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Triggertransition();

	/**
	 * Returns the meta object for the reference '{@link fr.houssam.transformation.model.statemachine.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Trigger#getEvent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Event();

	/**
	 * Returns the meta object for class '{@link fr.houssam.transformation.model.statemachine.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the container reference '{@link fr.houssam.transformation.model.statemachine.Constraint#getConstrainttransition <em>Constrainttransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constrainttransition</em>'.
	 * @see fr.houssam.transformation.model.statemachine.Constraint#getConstrainttransition()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Constrainttransition();

	/**
	 * Returns the meta object for enum '{@link fr.houssam.transformation.model.statemachine.PseudoStateKind <em>Pseudo State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pseudo State Kind</em>'.
	 * @see fr.houssam.transformation.model.statemachine.PseudoStateKind
	 * @generated
	 */
	EEnum getPseudoStateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatemachineFactory getStatemachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.ClassImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.StateMachineImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REGION = eINSTANCE.getStateMachine_Region();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.NamedElementImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.BehavioredClassifierImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getBehavioredClassifier()
		 * @generated
		 */
		EClass BEHAVIORED_CLASSIFIER = eINSTANCE.getBehavioredClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR = eINSTANCE.getBehavioredClassifier_OwnedBehavior();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.RegionImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__MACHINE = eINSTANCE.getRegion_Machine();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__SUBVERTEX = eINSTANCE.getRegion_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSITION = eINSTANCE.getRegion_Transition();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.BehaviorImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__SPECIFICATION = eINSTANCE.getBehavior_Specification();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__CONTEXT = eINSTANCE.getBehavior_Context();

		/**
		 * The meta object literal for the '<em><b>Behaviortransition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__BEHAVIORTRANSITION = eINSTANCE.getBehavior_Behaviortransition();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.OpaqueBehaviorImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getOpaqueBehavior()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR = eINSTANCE.getOpaqueBehavior();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__BODY = eINSTANCE.getOpaqueBehavior_Body();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__LANGUAGE = eINSTANCE.getOpaqueBehavior_Language();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.TransitionImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Transitionregion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITIONREGION = eINSTANCE.getTransition_Transitionregion();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.VertexImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING = eINSTANCE.getVertex_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING = eINSTANCE.getVertex_Incoming();

		/**
		 * The meta object literal for the '<em><b>Regionvertex</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__REGIONVERTEX = eINSTANCE.getVertex_Regionvertex();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.PseudoStateImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getPseudoState()
		 * @generated
		 */
		EClass PSEUDO_STATE = eINSTANCE.getPseudoState();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDO_STATE__KIND = eINSTANCE.getPseudoState_Kind();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.StateImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.FinalStateImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.EventImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Eventtrigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__EVENTTRIGGER = eINSTANCE.getEvent_Eventtrigger();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.MessageEventImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.CallEventImpl <em>Call Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.CallEventImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getCallEvent()
		 * @generated
		 */
		EClass CALL_EVENT = eINSTANCE.getCallEvent();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EVENT__OPERATION = eINSTANCE.getCallEvent_Operation();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.OperationImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.BehavioralFeatureImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getBehavioralFeature()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__BEHAVIOR = eINSTANCE.getBehavioralFeature_Behavior();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.TriggerImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Triggertransition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TRIGGERTRANSITION = eINSTANCE.getTrigger_Triggertransition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.impl.ConstraintImpl
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrainttransition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINTTRANSITION = eINSTANCE.getConstraint_Constrainttransition();

		/**
		 * The meta object literal for the '{@link fr.houssam.transformation.model.statemachine.PseudoStateKind <em>Pseudo State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.houssam.transformation.model.statemachine.PseudoStateKind
		 * @see fr.houssam.transformation.model.statemachine.impl.StatemachinePackageImpl#getPseudoStateKind()
		 * @generated
		 */
		EEnum PSEUDO_STATE_KIND = eINSTANCE.getPseudoStateKind();

	}

} //StatemachinePackage
