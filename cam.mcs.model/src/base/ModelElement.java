/**
 */
package base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link base.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link base.ModelElement#getImplementationConstraint <em>Implementation Constraint</em>}</li>
 *   <li>{@link base.ModelElement#getNote <em>Note</em>}</li>
 *   <li>{@link base.ModelElement#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link base.ModelElement#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 *
 * @see base.BasePackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see base.BasePackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link base.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see base.BasePackage#getModelElement_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link base.ModelElement#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link base.ImplementationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Constraint</em>' containment reference list.
	 * @see base.BasePackage#getModelElement_ImplementationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationConstraint> getImplementationConstraint();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link base.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see base.BasePackage#getModelElement_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNote();

	/**
	 * Returns the value of the '<em><b>Tagged Value</b></em>' containment reference list.
	 * The list contents are of type {@link base.TaggedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Value</em>' containment reference list.
	 * @see base.BasePackage#getModelElement_TaggedValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaggedValue> getTaggedValue();

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference.
	 * @see #setExternalReference(ExternalReference)
	 * @see base.BasePackage#getModelElement_ExternalReference()
	 * @model containment="true"
	 * @generated
	 */
	ExternalReference getExternalReference();

	/**
	 * Sets the value of the '{@link base.ModelElement#getExternalReference <em>External Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' containment reference.
	 * @see #getExternalReference()
	 * @generated
	 */
	void setExternalReference(ExternalReference value);

} // ModelElement
