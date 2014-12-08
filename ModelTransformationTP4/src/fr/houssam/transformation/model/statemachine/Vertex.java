/**
 */
package fr.houssam.transformation.model.statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Vertex#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link fr.houssam.transformation.model.statemachine.Vertex#getRegionvertex <em>Regionvertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link fr.houssam.transformation.model.statemachine.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getVertex_Outgoing()
	 * @see fr.houssam.transformation.model.statemachine.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link fr.houssam.transformation.model.statemachine.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getVertex_Incoming()
	 * @see fr.houssam.transformation.model.statemachine.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Regionvertex</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.houssam.transformation.model.statemachine.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regionvertex</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regionvertex</em>' container reference.
	 * @see #setRegionvertex(Region)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getVertex_Regionvertex()
	 * @see fr.houssam.transformation.model.statemachine.Region#getSubvertex
	 * @model opposite="subvertex" transient="false"
	 * @generated
	 */
	Region getRegionvertex();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.Vertex#getRegionvertex <em>Regionvertex</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionvertex</em>' container reference.
	 * @see #getRegionvertex()
	 * @generated
	 */
	void setRegionvertex(Region value);

} // Vertex
