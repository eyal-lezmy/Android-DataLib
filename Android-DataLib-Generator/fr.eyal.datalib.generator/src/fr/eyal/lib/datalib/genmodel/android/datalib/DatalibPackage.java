/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibFactory
 * @model kind="package"
 * @generated
 */
public interface DatalibPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datalib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eyal.fr/android/datalib";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datalib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatalibPackage eINSTANCE = fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl <em>Web Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl#getWebService()
	 * @generated
	 */
	int WEB_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Parse Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__PARSE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__URL = 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__CONTENT_RESPONSE = 7;

	/**
	 * The feature id for the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__CACHED = 8;

	/**
	 * The number of structural features of the '<em>Web Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl <em>Data Lib Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl#getDataLibProject()
	 * @generated
	 */
	int DATA_LIB_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIB_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIB_PROJECT__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIB_PROJECT__AUTHORITY = 2;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIB_PROJECT__DATABASE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Database Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIB_PROJECT__DATABASE_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Webservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIB_PROJECT__WEBSERVICES = 5;

	/**
	 * The number of structural features of the '<em>Data Lib Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIB_PROJECT_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Service</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService
	 * @generated
	 */
	EClass getWebService();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getName()
	 * @see #getWebService()
	 * @generated
	 */
	EAttribute getWebService_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getPackage()
	 * @see #getWebService()
	 * @generated
	 */
	EAttribute getWebService_Package();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getMethod()
	 * @see #getWebService()
	 * @generated
	 */
	EAttribute getWebService_Method();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getParseType <em>Parse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parse Type</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getParseType()
	 * @see #getWebService()
	 * @generated
	 */
	EAttribute getWebService_ParseType();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getUrl()
	 * @see #getWebService()
	 * @generated
	 */
	EAttribute getWebService_Url();

	/**
	 * Returns the meta object for the attribute list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getOptions()
	 * @see #getWebService()
	 * @generated
	 */
	EAttribute getWebService_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getParameters()
	 * @see #getWebService()
	 * @generated
	 */
	EReference getWebService_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getContentResponse <em>Content Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Response</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#getContentResponse()
	 * @see #getWebService()
	 * @generated
	 */
	EReference getWebService_ContentResponse();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.WebService#isCached <em>Cached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.WebService#isCached()
	 * @see #getWebService()
	 * @generated
	 */
	EAttribute getWebService_Cached();

	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject <em>Data Lib Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Lib Project</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject
	 * @generated
	 */
	EClass getDataLibProject();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getName()
	 * @see #getDataLibProject()
	 * @generated
	 */
	EAttribute getDataLibProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getPackage()
	 * @see #getDataLibProject()
	 * @generated
	 */
	EAttribute getDataLibProject_Package();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getAuthority()
	 * @see #getDataLibProject()
	 * @generated
	 */
	EAttribute getDataLibProject_Authority();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseName()
	 * @see #getDataLibProject()
	 * @generated
	 */
	EAttribute getDataLibProject_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseVersion <em>Database Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Version</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getDatabaseVersion()
	 * @see #getDataLibProject()
	 * @generated
	 */
	EAttribute getDataLibProject_DatabaseVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getWebservices <em>Webservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Webservices</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject#getWebservices()
	 * @see #getDataLibProject()
	 * @generated
	 */
	EReference getDataLibProject_Webservices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatalibFactory getDatalibFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl <em>Web Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl#getWebService()
		 * @generated
		 */
		EClass WEB_SERVICE = eINSTANCE.getWebService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE__NAME = eINSTANCE.getWebService_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE__PACKAGE = eINSTANCE.getWebService_Package();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE__METHOD = eINSTANCE.getWebService_Method();

		/**
		 * The meta object literal for the '<em><b>Parse Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE__PARSE_TYPE = eINSTANCE.getWebService_ParseType();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE__URL = eINSTANCE.getWebService_Url();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE__OPTIONS = eINSTANCE.getWebService_Options();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE__PARAMETERS = eINSTANCE.getWebService_Parameters();

		/**
		 * The meta object literal for the '<em><b>Content Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE__CONTENT_RESPONSE = eINSTANCE.getWebService_ContentResponse();

		/**
		 * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE__CACHED = eINSTANCE.getWebService_Cached();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl <em>Data Lib Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl#getDataLibProject()
		 * @generated
		 */
		EClass DATA_LIB_PROJECT = eINSTANCE.getDataLibProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LIB_PROJECT__NAME = eINSTANCE.getDataLibProject_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LIB_PROJECT__PACKAGE = eINSTANCE.getDataLibProject_Package();

		/**
		 * The meta object literal for the '<em><b>Authority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LIB_PROJECT__AUTHORITY = eINSTANCE.getDataLibProject_Authority();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LIB_PROJECT__DATABASE_NAME = eINSTANCE.getDataLibProject_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Database Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LIB_PROJECT__DATABASE_VERSION = eINSTANCE.getDataLibProject_DatabaseVersion();

		/**
		 * The meta object literal for the '<em><b>Webservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LIB_PROJECT__WEBSERVICES = eINSTANCE.getDataLibProject_Webservices();

	}

} //DatalibPackage
