/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getUrlParameter <em>Url Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType
	 * @see #setType(ParameterType)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getParameter_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Url Parameter</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Parameter</em>' attribute.
	 * @see #setUrlParameter(int)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getParameter_UrlParameter()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getUrlParameter();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getUrlParameter <em>Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Parameter</em>' attribute.
	 * @see #getUrlParameter()
	 * @generated
	 */
	void setUrlParameter(int value);

} // Parameter
