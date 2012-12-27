/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getPackage <em>Package</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getContentFields <em>Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getChilds <em>Childs</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getXmlName <em>Xml Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParseId <em>Parse Id</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getRelatedField <em>Related Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject()
 * @model
 * @generated
 */
public interface BusinessObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getAttributes();

	/**
	 * Returns the value of the '<em><b>Content Fields</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Fields</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_ContentFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getContentFields();

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_Childs()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessObject> getChilds();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(BusinessObject)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_Parent()
	 * @model required="true"
	 * @generated
	 */
	BusinessObject getParent();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Name</em>' attribute.
	 * @see #setXmlName(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_XmlName()
	 * @model required="true"
	 * @generated
	 */
	String getXmlName();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getXmlName <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Name</em>' attribute.
	 * @see #getXmlName()
	 * @generated
	 */
	void setXmlName(String value);

	/**
	 * Returns the value of the '<em><b>Parse Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parse Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse Id</em>' attribute.
	 * @see #setParseId(BigInteger)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_ParseId()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	BigInteger getParseId();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParseId <em>Parse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parse Id</em>' attribute.
	 * @see #getParseId()
	 * @generated
	 */
	void setParseId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Field</em>' reference.
	 * @see #setRelatedField(FieldBusinessObject)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObject_RelatedField()
	 * @model required="true"
	 * @generated
	 */
	FieldBusinessObject getRelatedField();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getRelatedField <em>Related Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Field</em>' reference.
	 * @see #getRelatedField()
	 * @generated
	 */
	void setRelatedField(FieldBusinessObject value);

} // BusinessObject
