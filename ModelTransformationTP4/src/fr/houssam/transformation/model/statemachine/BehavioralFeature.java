/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.BehavioralFeature#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavioralFeature()
 * @model
 * @generated
 */
public interface BehavioralFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getBehavioralFeature_Behavior()
	 * @see fr.houssam.transformation.model.statemachine.Behavior#getSpecification
	 * @model opposite="specification"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.BehavioralFeature#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // BehavioralFeature
