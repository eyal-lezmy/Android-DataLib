/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject#getXmlContentFields <em>Xml Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject#getXmlAttributes <em>Xml Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getResponseBusinessObject()
 * @model
 * @generated
 */
public interface ResponseBusinessObject extends BusinessObject {

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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getResponseBusinessObject_XmlContentFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getXmlContentFields();

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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getResponseBusinessObject_XmlAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getXmlAttributes();
} // ResponseBusinessObject
