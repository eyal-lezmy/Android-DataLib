/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject;
import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.WebService;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Lib Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl#getDatabaseVersion <em>Database Version</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.DataLibProjectImpl#getWebservices <em>Webservices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataLibProjectImpl extends CDOObjectImpl implements DataLibProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDatabaseVersion() <em>Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_VERSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLibProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatalibPackage.Literals.DATA_LIB_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(DatalibPackage.DATA_LIB_PROJECT__NAME, DatalibPackage.Literals.DATA_LIB_PROJECT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(DatalibPackage.DATA_LIB_PROJECT__NAME, DatalibPackage.Literals.DATA_LIB_PROJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return (String)eDynamicGet(DatalibPackage.DATA_LIB_PROJECT__PACKAGE, DatalibPackage.Literals.DATA_LIB_PROJECT__PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		eDynamicSet(DatalibPackage.DATA_LIB_PROJECT__PACKAGE, DatalibPackage.Literals.DATA_LIB_PROJECT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthority() {
		return (String)eDynamicGet(DatalibPackage.DATA_LIB_PROJECT__AUTHORITY, DatalibPackage.Literals.DATA_LIB_PROJECT__AUTHORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(String newAuthority) {
		eDynamicSet(DatalibPackage.DATA_LIB_PROJECT__AUTHORITY, DatalibPackage.Literals.DATA_LIB_PROJECT__AUTHORITY, newAuthority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return (String)eDynamicGet(DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME, DatalibPackage.Literals.DATA_LIB_PROJECT__DATABASE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		eDynamicSet(DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME, DatalibPackage.Literals.DATA_LIB_PROJECT__DATABASE_NAME, newDatabaseName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseVersion() {
		return (String)eDynamicGet(DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION, DatalibPackage.Literals.DATA_LIB_PROJECT__DATABASE_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseVersion(String newDatabaseVersion) {
		eDynamicSet(DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION, DatalibPackage.Literals.DATA_LIB_PROJECT__DATABASE_VERSION, newDatabaseVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WebService> getWebservices() {
		return (EList<WebService>)eDynamicGet(DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES, DatalibPackage.Literals.DATA_LIB_PROJECT__WEBSERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES:
				return ((InternalEList<?>)getWebservices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatalibPackage.DATA_LIB_PROJECT__NAME:
				return getName();
			case DatalibPackage.DATA_LIB_PROJECT__PACKAGE:
				return getPackage();
			case DatalibPackage.DATA_LIB_PROJECT__AUTHORITY:
				return getAuthority();
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME:
				return getDatabaseName();
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION:
				return getDatabaseVersion();
			case DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES:
				return getWebservices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatalibPackage.DATA_LIB_PROJECT__NAME:
				setName((String)newValue);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__PACKAGE:
				setPackage((String)newValue);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__AUTHORITY:
				setAuthority((String)newValue);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION:
				setDatabaseVersion((String)newValue);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES:
				getWebservices().clear();
				getWebservices().addAll((Collection<? extends WebService>)newValue);
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
			case DatalibPackage.DATA_LIB_PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__AUTHORITY:
				setAuthority(AUTHORITY_EDEFAULT);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION:
				setDatabaseVersion(DATABASE_VERSION_EDEFAULT);
				return;
			case DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES:
				getWebservices().clear();
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
			case DatalibPackage.DATA_LIB_PROJECT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DatalibPackage.DATA_LIB_PROJECT__PACKAGE:
				return PACKAGE_EDEFAULT == null ? getPackage() != null : !PACKAGE_EDEFAULT.equals(getPackage());
			case DatalibPackage.DATA_LIB_PROJECT__AUTHORITY:
				return AUTHORITY_EDEFAULT == null ? getAuthority() != null : !AUTHORITY_EDEFAULT.equals(getAuthority());
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? getDatabaseName() != null : !DATABASE_NAME_EDEFAULT.equals(getDatabaseName());
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION:
				return DATABASE_VERSION_EDEFAULT == null ? getDatabaseVersion() != null : !DATABASE_VERSION_EDEFAULT.equals(getDatabaseVersion());
			case DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES:
				return !getWebservices().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataLibProjectImpl
