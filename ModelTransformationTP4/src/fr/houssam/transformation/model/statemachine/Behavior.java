/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Behavior#getContext <em>Context</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Behavior#getBehaviortransition <em>Behaviortransition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.BehavioralFeature#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(BehavioralFeature)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavior_Specification()
	 * @see fr.houssam.transformation.model.statemachine.BehavioralFeature#getBehavior
	 * @model opposite="behavior"
	 * @generated
	 */
	BehavioralFeature getSpecification();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Behavior#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(BehavioredClassifier)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavior_Context()
	 * @see fr.houssam.transformation.model.statemachine.BehavioredClassifier#getOwnedBehavior
	 * @model opposite="ownedBehavior" transient="false"
	 * @generated
	 */
	BehavioredClassifier getContext();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Behavior#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Behaviortransition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviortransition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviortransition</em>' container reference.
	 * @see #setBehaviortransition(Transition)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavior_Behaviortransition()
	 * @see fr.houssam.transformation.model.statemachine.Transition#getEffect
	 * @model opposite="effect" transient="false"
	 * @generated
	 */
	Transition getBehaviortransition();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Behavior#getBehaviortransition <em>Behaviortransition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviortransition</em>' container reference.
	 * @see #getBehaviortransition()
	 * @generated
	 */
	void setBehaviortransition(Transition value);

} // Behavior
