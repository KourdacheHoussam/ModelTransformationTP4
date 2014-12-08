/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavioredClassifier()
 * @model
 * @generated
 */
public interface BehavioredClassifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link fr.houssam.transformation.model.statemachine.Behavior}.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Behavior#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavioredClassifier_OwnedBehavior()
	 * @see fr.houssam.transformation.model.statemachine.Behavior#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<Behavior> getOwnedBehavior();

} // BehavioredClassifier
