/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.WebService;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getParseType <em>Parse Type</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getContentResponse <em>Content Response</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#isCached <em>Cached</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebServiceImpl extends CDOObjectImpl implements WebService {
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCached()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatalibPackage.Literals.WEB_SERVICE;
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
		return (String)eDynamicGet(DatalibPackage.WEB_SERVICE__NAME, DatalibPackage.Literals.WEB_SERVICE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(DatalibPackage.WEB_SERVICE__NAME, DatalibPackage.Literals.WEB_SERVICE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return (String)eDynamicGet(DatalibPackage.WEB_SERVICE__PACKAGE, DatalibPackage.Literals.WEB_SERVICE__PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		eDynamicSet(DatalibPackage.WEB_SERVICE__PACKAGE, DatalibPackage.Literals.WEB_SERVICE__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getMethod() {
		return (HttpMethod)eDynamicGet(DatalibPackage.WEB_SERVICE__METHOD, DatalibPackage.Literals.WEB_SERVICE__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HttpMethod newMethod) {
		eDynamicSet(DatalibPackage.WEB_SERVICE__METHOD, DatalibPackage.Literals.WEB_SERVICE__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseType getParseType() {
		return (ParseType)eDynamicGet(DatalibPackage.WEB_SERVICE__PARSE_TYPE, DatalibPackage.Literals.WEB_SERVICE__PARSE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseType(ParseType newParseType) {
		eDynamicSet(DatalibPackage.WEB_SERVICE__PARSE_TYPE, DatalibPackage.Literals.WEB_SERVICE__PARSE_TYPE, newParseType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)eDynamicGet(DatalibPackage.WEB_SERVICE__URL, DatalibPackage.Literals.WEB_SERVICE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eDynamicSet(DatalibPackage.WEB_SERVICE__URL, DatalibPackage.Literals.WEB_SERVICE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataLibOption> getOptions() {
		return (EList<DataLibOption>)eDynamicGet(DatalibPackage.WEB_SERVICE__OPTIONS, DatalibPackage.Literals.WEB_SERVICE__OPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(DatalibPackage.WEB_SERVICE__PARAMETERS, DatalibPackage.Literals.WEB_SERVICE__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBusinessObject getContentResponse() {
		return (ResponseBusinessObject)eDynamicGet(DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE, DatalibPackage.Literals.WEB_SERVICE__CONTENT_RESPONSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentResponse(ResponseBusinessObject newContentResponse, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContentResponse, DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentResponse(ResponseBusinessObject newContentResponse) {
		eDynamicSet(DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE, DatalibPackage.Literals.WEB_SERVICE__CONTENT_RESPONSE, newContentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCached() {
		return (Boolean)eDynamicGet(DatalibPackage.WEB_SERVICE__CACHED, DatalibPackage.Literals.WEB_SERVICE__CACHED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCached(boolean newCached) {
		eDynamicSet(DatalibPackage.WEB_SERVICE__CACHED, DatalibPackage.Literals.WEB_SERVICE__CACHED, newCached);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatalibPackage.WEB_SERVICE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE:
				return basicSetContentResponse(null, msgs);
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
			case DatalibPackage.WEB_SERVICE__NAME:
				return getName();
			case DatalibPackage.WEB_SERVICE__PACKAGE:
				return getPackage();
			case DatalibPackage.WEB_SERVICE__METHOD:
				return getMethod();
			case DatalibPackage.WEB_SERVICE__PARSE_TYPE:
				return getParseType();
			case DatalibPackage.WEB_SERVICE__URL:
				return getUrl();
			case DatalibPackage.WEB_SERVICE__OPTIONS:
				return getOptions();
			case DatalibPackage.WEB_SERVICE__PARAMETERS:
				return getParameters();
			case DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE:
				return getContentResponse();
			case DatalibPackage.WEB_SERVICE__CACHED:
				return isCached();
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
			case DatalibPackage.WEB_SERVICE__NAME:
				setName((String)newValue);
				return;
			case DatalibPackage.WEB_SERVICE__PACKAGE:
				setPackage((String)newValue);
				return;
			case DatalibPackage.WEB_SERVICE__METHOD:
				setMethod((HttpMethod) newValue);
				return;
			case DatalibPackage.WEB_SERVICE__PARSE_TYPE:
				setParseType((ParseType) newValue);
				return;
			case DatalibPackage.WEB_SERVICE__URL:
				setUrl((String)newValue);
				return;
			case DatalibPackage.WEB_SERVICE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends DataLibOption>)newValue);
				return;
			case DatalibPackage.WEB_SERVICE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE:
				setContentResponse((ResponseBusinessObject)newValue);
				return;
			case DatalibPackage.WEB_SERVICE__CACHED:
				setCached((Boolean)newValue);
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
			case DatalibPackage.WEB_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatalibPackage.WEB_SERVICE__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case DatalibPackage.WEB_SERVICE__METHOD:
				setMethod((HttpMethod)null);
				return;
			case DatalibPackage.WEB_SERVICE__PARSE_TYPE:
				setParseType((ParseType)null);
				return;
			case DatalibPackage.WEB_SERVICE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DatalibPackage.WEB_SERVICE__OPTIONS:
				getOptions().clear();
				return;
			case DatalibPackage.WEB_SERVICE__PARAMETERS:
				getParameters().clear();
				return;
			case DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE:
				setContentResponse((ResponseBusinessObject)null);
				return;
			case DatalibPackage.WEB_SERVICE__CACHED:
				setCached(CACHED_EDEFAULT);
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
			case DatalibPackage.WEB_SERVICE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DatalibPackage.WEB_SERVICE__PACKAGE:
				return PACKAGE_EDEFAULT == null ? getPackage() != null : !PACKAGE_EDEFAULT.equals(getPackage());
			case DatalibPackage.WEB_SERVICE__METHOD:
				return getMethod() != null;
			case DatalibPackage.WEB_SERVICE__PARSE_TYPE:
				return getParseType() != null;
			case DatalibPackage.WEB_SERVICE__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case DatalibPackage.WEB_SERVICE__OPTIONS:
				return !getOptions().isEmpty();
			case DatalibPackage.WEB_SERVICE__PARAMETERS:
				return !getParameters().isEmpty();
			case DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE:
				return getContentResponse() != null;
			case DatalibPackage.WEB_SERVICE__CACHED:
				return isCached() != CACHED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //WebServiceImpl
