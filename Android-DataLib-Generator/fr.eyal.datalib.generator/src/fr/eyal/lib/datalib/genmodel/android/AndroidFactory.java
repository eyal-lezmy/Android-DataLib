/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.eyal.lib.datalib.genmodel.android.AndroidPackage
 * @generated
 */
public interface AndroidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndroidFactory eINSTANCE = fr.eyal.lib.datalib.genmodel.android.impl.AndroidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dummy Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy Class</em>'.
	 * @generated
	 */
	DummyClass createDummyClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AndroidPackage getAndroidPackage();

} //AndroidFactory
