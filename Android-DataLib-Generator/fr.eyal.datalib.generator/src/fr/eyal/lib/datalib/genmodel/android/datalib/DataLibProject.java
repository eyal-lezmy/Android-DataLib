/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Lib Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getName <em>Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getPackage <em>Package</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseVersion <em>Database Version</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getWebservices <em>Webservices</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getDataLibProject()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DataLibProject extends CDOObject {
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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getDataLibProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getName <em>Name</em>}' attribute.
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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getDataLibProject_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' attribute.
	 * @see #setAuthority(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getDataLibProject_Authority()
	 * @model required="true"
	 * @generated
	 */
	String getAuthority();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getAuthority <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' attribute.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getDataLibProject_DatabaseName()
	 * @model required="true"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Database Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Version</em>' attribute.
	 * @see #setDatabaseVersion(String)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getDataLibProject_DatabaseVersion()
	 * @model required="true"
	 * @generated
	 */
	String getDatabaseVersion();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseVersion <em>Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Version</em>' attribute.
	 * @see #getDatabaseVersion()
	 * @generated
	 */
	void setDatabaseVersion(String value);

	/**
	 * Returns the value of the '<em><b>Webservices</b></em>' containment reference list.
	 * The list contents are of type {@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webservices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webservices</em>' containment reference list.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#getDataLibProject_Webservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebService> getWebservices();

} // DataLibProject
