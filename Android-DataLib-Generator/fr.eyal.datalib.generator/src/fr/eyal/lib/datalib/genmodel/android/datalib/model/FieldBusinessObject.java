/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getFieldBusinessObject()
 * @model
 * @generated
 */
public interface FieldBusinessObject extends Field {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(BusinessObject)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getFieldBusinessObject_Content()
	 * @model required="true"
	 * @generated
	 */
	BusinessObject getContent();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(BusinessObject value);

} // FieldBusinessObject
