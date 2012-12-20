/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.impl;

import fr.eyal.lib.datalib.genmodel.android.AndroidFactory;
import fr.eyal.lib.datalib.genmodel.android.AndroidPackage;
import fr.eyal.lib.datalib.genmodel.android.DummyClass;

import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidPackageImpl extends EPackageImpl implements AndroidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyClassEClass = null;

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
	 * @see fr.eyal.lib.datalib.genmodel.android.AndroidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AndroidPackageImpl() {
		super(eNS_URI, AndroidFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AndroidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AndroidPackage init() {
		if (isInited) return (AndroidPackage)EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI);

		// Obtain or create and register package
		AndroidPackageImpl theAndroidPackage = (AndroidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AndroidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AndroidPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatalibPackageImpl theDatalibPackage = (DatalibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI) instanceof DatalibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI) : DatalibPackage.eINSTANCE);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI) instanceof ContentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI) : ContentPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);

		// Create package meta-data objects
		theAndroidPackage.createPackageContents();
		theDatalibPackage.createPackageContents();
		theContentPackage.createPackageContents();
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theAndroidPackage.initializePackageContents();
		theDatalibPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAndroidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AndroidPackage.eNS_URI, theAndroidPackage);
		return theAndroidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyClass() {
		return dummyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidFactory getAndroidFactory() {
		return (AndroidFactory)getEFactoryInstance();
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
		dummyClassEClass = createEClass(DUMMY_CLASS);
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
		DatalibPackage theDatalibPackage = (DatalibPackage)EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatalibPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dummyClassEClass, DummyClass.class, "DummyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AndroidPackageImpl
