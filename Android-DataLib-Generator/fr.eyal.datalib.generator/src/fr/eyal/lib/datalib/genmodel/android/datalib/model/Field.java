/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlName <em>Xml Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlAttributes <em>Xml Attributes</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getBusinessObject <em>Business Object</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlContentFields <em>Xml Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getParseId <em>Parse Id</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlParent <em>Xml Parent</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getRelatedField <em>Related Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Parameter {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_XmlName()
	 * @model required="true"
	 * @generated
	 */
	String getXmlName();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlName <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Name</em>' attribute.
	 * @see #getXmlName()
	 * @generated
	 */
	void setXmlName(String value);

	/**
	 * Returns the value of the '<em><b>Xml Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Attributes</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_XmlAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getXmlAttributes();

	/**
	 * Returns the value of the '<em><b>Business Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Object</em>' reference.
	 * @see #setBusinessObject(BusinessObject)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_BusinessObject()
	 * @model required="true"
	 * @generated
	 */
	BusinessObject getBusinessObject();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getBusinessObject <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Object</em>' reference.
	 * @see #getBusinessObject()
	 * @generated
	 */
	void setBusinessObject(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>Xml Content Fields</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Content Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Content Fields</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_XmlContentFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getXmlContentFields();

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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_ParseId()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	BigInteger getParseId();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getParseId <em>Parse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parse Id</em>' attribute.
	 * @see #getParseId()
	 * @generated
	 */
	void setParseId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Xml Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Parent</em>' reference.
	 * @see #setXmlParent(Field)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_XmlParent()
	 * @model required="true"
	 * @generated
	 */
	Field getXmlParent();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlParent <em>Xml Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Parent</em>' reference.
	 * @see #getXmlParent()
	 * @generated
	 */
	void setXmlParent(Field value);

	/**
	 * Returns the value of the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Field</em>' reference.
	 * @see #setRelatedField(Field)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getField_RelatedField()
	 * @model required="true"
	 * @generated
	 */
	Field getRelatedField();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getRelatedField <em>Related Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Field</em>' reference.
	 * @see #getRelatedField()
	 * @generated
	 */
	void setRelatedField(Field value);

} // Field
