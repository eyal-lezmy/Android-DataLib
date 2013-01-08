/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getName <em>Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getPackage <em>Package</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getMethod <em>Method</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getParseType <em>Parse Type</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getOptions <em>Options</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getContentResponse <em>Content Response</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#isCached <em>Cached</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getUrlParameters <em>Url Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService()
 * @model
 * @generated
 */
public interface WebService extends EObject {
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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getName <em>Name</em>}' attribute.
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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod
	 * @see #setMethod(HttpMethod)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_Method()
	 * @model dataType="fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod" required="true"
	 * @generated
	 */
	HttpMethod getMethod();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Parse Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parse Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse Type</em>' attribute.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType
	 * @see #setParseType(ParseType)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_ParseType()
	 * @model dataType="fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType" required="true"
	 * @generated
	 */
	ParseType getParseType();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getParseType <em>Parse Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parse Type</em>' attribute.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType
	 * @see #getParseType()
	 * @generated
	 */
	void setParseType(ParseType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption}.
	 * The literals are from the enumeration {@link fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_Options()
	 * @model dataType="fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption"
	 * @generated
	 */
	EList<DataLibOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Response</em>' containment reference.
	 * @see #setContentResponse(ResponseBusinessObject)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_ContentResponse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResponseBusinessObject getContentResponse();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getContentResponse <em>Content Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Response</em>' containment reference.
	 * @see #getContentResponse()
	 * @generated
	 */
	void setContentResponse(ResponseBusinessObject value);

	/**
	 * Returns the value of the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached</em>' attribute.
	 * @see #setCached(boolean)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_Cached()
	 * @model required="true"
	 * @generated
	 */
	boolean isCached();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#isCached <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached</em>' attribute.
	 * @see #isCached()
	 * @generated
	 */
	void setCached(boolean value);

	/**
	 * Returns the value of the '<em><b>Url Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Parameters</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getWebService_UrlParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getUrlParameters();

} // WebService
