/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fr.eyal.lib.datalib.genmodel.android.AndroidFactory
 * @model kind="package"
 * @generated
 */
public interface AndroidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "android";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eyal.fr/android";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "android";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndroidPackage eINSTANCE = fr.eyal.lib.datalib.genmodel.android.impl.AndroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.impl.DummyClassImpl <em>Dummy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.impl.DummyClassImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.impl.AndroidPackageImpl#getDummyClass()
	 * @generated
	 */
	int DUMMY_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Dummy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.DummyClass <em>Dummy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Class</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.DummyClass
	 * @generated
	 */
	EClass getDummyClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AndroidFactory getAndroidFactory();

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
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.impl.DummyClassImpl <em>Dummy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.impl.DummyClassImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.impl.AndroidPackageImpl#getDummyClass()
		 * @generated
		 */
		EClass DUMMY_CLASS = eINSTANCE.getDummyClass();

	}

} //AndroidPackage
