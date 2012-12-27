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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
public class DataLibProjectImpl extends EObjectImpl implements DataLibProject {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected String authority = AUTHORITY_EDEFAULT;

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
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getDatabaseVersion() <em>Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseVersion()
	 * @generated
	 * @ordered
	 */
	protected String databaseVersion = DATABASE_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWebservices() <em>Webservices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebservices()
	 * @generated
	 * @ordered
	 */
	protected EList<WebService> webservices;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.DATA_LIB_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.DATA_LIB_PROJECT__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(String newAuthority) {
		String oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.DATA_LIB_PROJECT__AUTHORITY, oldAuthority, authority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseVersion() {
		return databaseVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseVersion(String newDatabaseVersion) {
		String oldDatabaseVersion = databaseVersion;
		databaseVersion = newDatabaseVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION, oldDatabaseVersion, databaseVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebService> getWebservices() {
		if (webservices == null) {
			webservices = new EObjectContainmentEList<WebService>(WebService.class, this, DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES);
		}
		return webservices;
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
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatalibPackage.DATA_LIB_PROJECT__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case DatalibPackage.DATA_LIB_PROJECT__AUTHORITY:
				return AUTHORITY_EDEFAULT == null ? authority != null : !AUTHORITY_EDEFAULT.equals(authority);
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case DatalibPackage.DATA_LIB_PROJECT__DATABASE_VERSION:
				return DATABASE_VERSION_EDEFAULT == null ? databaseVersion != null : !DATABASE_VERSION_EDEFAULT.equals(databaseVersion);
			case DatalibPackage.DATA_LIB_PROJECT__WEBSERVICES:
				return webservices != null && !webservices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", package: ");
		result.append(package_);
		result.append(", authority: ");
		result.append(authority);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", databaseVersion: ");
		result.append(databaseVersion);
		result.append(')');
		return result.toString();
	}

} //DataLibProjectImpl
