/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage
 * @generated
 */
public interface DatalibFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatalibFactory eINSTANCE = fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Service</em>'.
	 * @generated
	 */
	WebService createWebService();

	/**
	 * Returns a new object of class '<em>Data Lib Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Lib Project</em>'.
	 * @generated
	 */
	DataLibProject createDataLibProject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatalibPackage getDatalibPackage();

} //DatalibFactory
