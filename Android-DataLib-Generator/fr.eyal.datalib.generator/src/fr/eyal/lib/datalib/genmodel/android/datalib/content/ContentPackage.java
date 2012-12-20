/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.content;

import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentFactory
 * @model kind="package"
 * @generated
 */
public interface ContentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "content";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eyal.fr/android/datalib/content";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "content";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentPackage eINSTANCE = fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType <em>Parse Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getParseType()
	 * @generated
	 */
	int PARSE_TYPE = 0;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 1;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption <em>Data Lib Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getDataLibOption()
	 * @generated
	 */
	int DATA_LIB_OPTION = 2;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 3;


	/**
	 * Returns the meta object for enum '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType <em>Parse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parse Type</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType
	 * @generated
	 */
	EEnum getParseType();

	/**
	 * Returns the meta object for enum '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for enum '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption <em>Data Lib Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Lib Option</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption
	 * @generated
	 */
	EEnum getDataLibOption();

	/**
	 * Returns the meta object for enum '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentFactory getContentFactory();

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
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType <em>Parse Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getParseType()
		 * @generated
		 */
		EEnum PARSE_TYPE = eINSTANCE.getParseType();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption <em>Data Lib Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getDataLibOption()
		 * @generated
		 */
		EEnum DATA_LIB_OPTION = eINSTANCE.getDataLibOption();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

	}

} //ContentPackage
