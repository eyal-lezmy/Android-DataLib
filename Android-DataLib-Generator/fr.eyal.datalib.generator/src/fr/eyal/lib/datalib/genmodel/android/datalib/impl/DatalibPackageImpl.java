/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.impl;

import fr.eyal.lib.datalib.genmodel.android.AndroidPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject;
import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibFactory;
import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.WebService;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.impl.AndroidPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatalibPackageImpl extends EPackageImpl implements DatalibPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLibProjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatalibPackageImpl() {
		super(eNS_URI, DatalibFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatalibPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatalibPackage init() {
		if (isInited) return (DatalibPackage)EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI);

		// Obtain or create and register package
		DatalibPackageImpl theDatalibPackage = (DatalibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatalibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatalibPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AndroidPackageImpl theAndroidPackage = (AndroidPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI) instanceof AndroidPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI) : AndroidPackage.eINSTANCE);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI) instanceof ContentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI) : ContentPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);

		// Create package meta-data objects
		theDatalibPackage.createPackageContents();
		theAndroidPackage.createPackageContents();
		theContentPackage.createPackageContents();
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theDatalibPackage.initializePackageContents();
		theAndroidPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatalibPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatalibPackage.eNS_URI, theDatalibPackage);
		return theDatalibPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebService() {
		return webServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebService_Name() {
		return (EAttribute)webServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebService_Package() {
		return (EAttribute)webServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebService_Method() {
		return (EAttribute)webServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebService_ParseType() {
		return (EAttribute)webServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebService_Url() {
		return (EAttribute)webServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebService_Options() {
		return (EAttribute)webServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebService_Parameters() {
		return (EReference)webServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebService_ContentResponse() {
		return (EReference)webServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebService_Cached() {
		return (EAttribute)webServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebService_UrlParameters() {
		return (EReference)webServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLibProject() {
		return dataLibProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLibProject_Name() {
		return (EAttribute)dataLibProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLibProject_Package() {
		return (EAttribute)dataLibProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLibProject_Authority() {
		return (EAttribute)dataLibProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLibProject_DatabaseName() {
		return (EAttribute)dataLibProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLibProject_DatabaseVersion() {
		return (EAttribute)dataLibProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLibProject_Webservices() {
		return (EReference)dataLibProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatalibFactory getDatalibFactory() {
		return (DatalibFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		webServiceEClass = createEClass(WEB_SERVICE);
		createEAttribute(webServiceEClass, WEB_SERVICE__NAME);
		createEAttribute(webServiceEClass, WEB_SERVICE__PACKAGE);
		createEAttribute(webServiceEClass, WEB_SERVICE__METHOD);
		createEAttribute(webServiceEClass, WEB_SERVICE__PARSE_TYPE);
		createEAttribute(webServiceEClass, WEB_SERVICE__URL);
		createEAttribute(webServiceEClass, WEB_SERVICE__OPTIONS);
		createEReference(webServiceEClass, WEB_SERVICE__PARAMETERS);
		createEReference(webServiceEClass, WEB_SERVICE__CONTENT_RESPONSE);
		createEAttribute(webServiceEClass, WEB_SERVICE__CACHED);
		createEReference(webServiceEClass, WEB_SERVICE__URL_PARAMETERS);

		dataLibProjectEClass = createEClass(DATA_LIB_PROJECT);
		createEAttribute(dataLibProjectEClass, DATA_LIB_PROJECT__NAME);
		createEAttribute(dataLibProjectEClass, DATA_LIB_PROJECT__PACKAGE);
		createEAttribute(dataLibProjectEClass, DATA_LIB_PROJECT__AUTHORITY);
		createEAttribute(dataLibProjectEClass, DATA_LIB_PROJECT__DATABASE_NAME);
		createEAttribute(dataLibProjectEClass, DATA_LIB_PROJECT__DATABASE_VERSION);
		createEReference(dataLibProjectEClass, DATA_LIB_PROJECT__WEBSERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContentPackage);
		getESubpackages().add(theModelPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(webServiceEClass, WebService.class, "WebService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebService_Name(), ecorePackage.getEString(), "name", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebService_Package(), ecorePackage.getEString(), "package", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebService_Method(), theContentPackage.getHttpMethod(), "method", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebService_ParseType(), theContentPackage.getParseType(), "parseType", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebService_Url(), ecorePackage.getEString(), "url", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebService_Options(), theContentPackage.getDataLibOption(), "options", null, 0, -1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebService_Parameters(), theModelPackage.getParameter(), null, "parameters", null, 0, -1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebService_ContentResponse(), theModelPackage.getResponseBusinessObject(), null, "contentResponse", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebService_Cached(), ecorePackage.getEBoolean(), "cached", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebService_UrlParameters(), theModelPackage.getParameter(), null, "urlParameters", null, 0, -1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLibProjectEClass, DataLibProject.class, "DataLibProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataLibProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataLibProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLibProject_Package(), ecorePackage.getEString(), "package", null, 1, 1, DataLibProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLibProject_Authority(), ecorePackage.getEString(), "authority", null, 1, 1, DataLibProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLibProject_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 1, 1, DataLibProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLibProject_DatabaseVersion(), ecorePackage.getEString(), "databaseVersion", null, 1, 1, DataLibProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLibProject_Webservices(), this.getWebService(), null, "webservices", null, 0, -1, DataLibProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DatalibPackageImpl
