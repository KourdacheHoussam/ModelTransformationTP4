/**
 */
package fr.houssam.transformation.model.statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.houssam.transformation.model.statemachine.PseudoState#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getPseudoState()
 * @model
 * @generated
 */
public interface PseudoState extends Vertex {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.houssam.transformation.model.statemachine.PseudoStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.houssam.transformation.model.statemachine.PseudoStateKind
	 * @see #setKind(PseudoStateKind)
	 * @see fr.houssam.transformation.model.statemachine.StatemachinePackage#getPseudoState_Kind()
	 * @model
	 * @generated
	 */
	PseudoStateKind getKind();

	/**
	 * Sets the value of the '{@link fr.houssam.transformation.model.statemachine.PseudoState#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.houssam.transformation.model.statemachine.PseudoStateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudoStateKind value);

} // PseudoState
