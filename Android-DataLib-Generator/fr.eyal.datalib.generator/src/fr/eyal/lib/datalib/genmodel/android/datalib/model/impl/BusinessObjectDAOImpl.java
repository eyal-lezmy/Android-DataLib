/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object DAO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectDAOImpl#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectDAOImpl extends BusinessObjectImpl implements BusinessObjectDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessObjectDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BUSINESS_OBJECT_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLibProject getProject() {
		return (DataLibProject)eDynamicGet(ModelPackage.BUSINESS_OBJECT_DAO__PROJECT, ModelPackage.Literals.BUSINESS_OBJECT_DAO__PROJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLibProject basicGetProject() {
		return (DataLibProject)eDynamicGet(ModelPackage.BUSINESS_OBJECT_DAO__PROJECT, ModelPackage.Literals.BUSINESS_OBJECT_DAO__PROJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(DataLibProject newProject) {
		eDynamicSet(ModelPackage.BUSINESS_OBJECT_DAO__PROJECT, ModelPackage.Literals.BUSINESS_OBJECT_DAO__PROJECT, newProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BUSINESS_OBJECT_DAO__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BUSINESS_OBJECT_DAO__PROJECT:
				setProject((DataLibProject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BUSINESS_OBJECT_DAO__PROJECT:
				setProject((DataLibProject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BUSINESS_OBJECT_DAO__PROJECT:
				return basicGetProject() != null;
		}
		return super.eIsSet(featureID);
	}

} //BusinessObjectDAOImpl
