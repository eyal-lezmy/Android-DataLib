/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.content.impl;

import fr.eyal.lib.datalib.genmodel.android.AndroidPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentFactory;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType;

import fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.impl.AndroidPackageImpl;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentPackageImpl extends EPackageImpl implements ContentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataLibOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

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
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentPackageImpl() {
		super(eNS_URI, ContentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentPackage init() {
		if (isInited) return (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Obtain or create and register package
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContentPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AndroidPackageImpl theAndroidPackage = (AndroidPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI) instanceof AndroidPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI) : AndroidPackage.eINSTANCE);
		DatalibPackageImpl theDatalibPackage = (DatalibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI) instanceof DatalibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI) : DatalibPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);

		// Create package meta-data objects
		theContentPackage.createPackageContents();
		theAndroidPackage.createPackageContents();
		theDatalibPackage.createPackageContents();
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theContentPackage.initializePackageContents();
		theAndroidPackage.initializePackageContents();
		theDatalibPackage.initializePackageContents();
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentPackage.eNS_URI, theContentPackage);
		return theContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParseType() {
		return parseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataLibOption() {
		return dataLibOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFactory getContentFactory() {
		return (ContentFactory)getEFactoryInstance();
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

		// Create enums
		parseTypeEEnum = createEEnum(PARSE_TYPE);
		httpMethodEEnum = createEEnum(HTTP_METHOD);
		dataLibOptionEEnum = createEEnum(DATA_LIB_OPTION);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
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

		// Initialize enums and add enum literals
		initEEnum(parseTypeEEnum, ParseType.class, "ParseType");
		addEEnumLiteral(parseTypeEEnum, ParseType.SAX);
		addEEnumLiteral(parseTypeEEnum, ParseType.JSON);
		addEEnumLiteral(parseTypeEEnum, ParseType.IMAGE);
		addEEnumLiteral(parseTypeEEnum, ParseType.CUSTOM);

		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PUT);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.HEAD);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.SOAP);

		initEEnum(dataLibOptionEEnum, DataLibOption.class, "DataLibOption");
		addEEnumLiteral(dataLibOptionEEnum, DataLibOption.NO_OPTION);
		addEEnumLiteral(dataLibOptionEEnum, DataLibOption.CONSERVE_COOKIE);
		addEEnumLiteral(dataLibOptionEEnum, DataLibOption.SEND_WITH_PARCELABLE);
		addEEnumLiteral(dataLibOptionEEnum, DataLibOption.DATA_BASE_CACHE_DISABLED);
		addEEnumLiteral(dataLibOptionEEnum, DataLibOption.HOST_VERIFIER_DISABLED);
		addEEnumLiteral(dataLibOptionEEnum, DataLibOption.HELPER_CACHE_DISABLED);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.INT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.FLOAT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BOOLEAN);
	}

} //ContentPackageImpl
