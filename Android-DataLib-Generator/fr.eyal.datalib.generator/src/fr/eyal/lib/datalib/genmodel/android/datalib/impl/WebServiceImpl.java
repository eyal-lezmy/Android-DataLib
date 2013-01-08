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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.impl.WebServiceImpl#getUrlParameters <em>Url Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebServiceImpl extends EObjectImpl implements WebService {
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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod method;

	/**
	 * The cached value of the '{@link #getParseType() <em>Parse Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseType()
	 * @generated
	 * @ordered
	 */
	protected ParseType parseType;

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
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<DataLibOption> options;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getContentResponse() <em>Content Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentResponse()
	 * @generated
	 * @ordered
	 */
	protected ResponseBusinessObject contentResponse;

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
	 * The cached value of the '{@link #isCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCached()
	 * @generated
	 * @ordered
	 */
	protected boolean cached = CACHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUrlParameters() <em>Url Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> urlParameters;

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
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HttpMethod newMethod) {
		HttpMethod oldMethod = method;
		method = newMethod == null ? null : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseType getParseType() {
		return parseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseType(ParseType newParseType) {
		ParseType oldParseType = parseType;
		parseType = newParseType == null ? null : newParseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__PARSE_TYPE, oldParseType, parseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataLibOption> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<DataLibOption>(DataLibOption.class, this, DatalibPackage.WEB_SERVICE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DatalibPackage.WEB_SERVICE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBusinessObject getContentResponse() {
		return contentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentResponse(ResponseBusinessObject newContentResponse, NotificationChain msgs) {
		ResponseBusinessObject oldContentResponse = contentResponse;
		contentResponse = newContentResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE, oldContentResponse, newContentResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentResponse(ResponseBusinessObject newContentResponse) {
		if (newContentResponse != contentResponse) {
			NotificationChain msgs = null;
			if (contentResponse != null)
				msgs = ((InternalEObject)contentResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE, null, msgs);
			if (newContentResponse != null)
				msgs = ((InternalEObject)newContentResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE, null, msgs);
			msgs = basicSetContentResponse(newContentResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE, newContentResponse, newContentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCached() {
		return cached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCached(boolean newCached) {
		boolean oldCached = cached;
		cached = newCached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatalibPackage.WEB_SERVICE__CACHED, oldCached, cached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getUrlParameters() {
		if (urlParameters == null) {
			urlParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DatalibPackage.WEB_SERVICE__URL_PARAMETERS);
		}
		return urlParameters;
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
			case DatalibPackage.WEB_SERVICE__URL_PARAMETERS:
				return ((InternalEList<?>)getUrlParameters()).basicRemove(otherEnd, msgs);
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
			case DatalibPackage.WEB_SERVICE__URL_PARAMETERS:
				return getUrlParameters();
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
			case DatalibPackage.WEB_SERVICE__URL_PARAMETERS:
				getUrlParameters().clear();
				getUrlParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case DatalibPackage.WEB_SERVICE__URL_PARAMETERS:
				getUrlParameters().clear();
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
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatalibPackage.WEB_SERVICE__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case DatalibPackage.WEB_SERVICE__METHOD:
				return method != null;
			case DatalibPackage.WEB_SERVICE__PARSE_TYPE:
				return parseType != null;
			case DatalibPackage.WEB_SERVICE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DatalibPackage.WEB_SERVICE__OPTIONS:
				return options != null && !options.isEmpty();
			case DatalibPackage.WEB_SERVICE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DatalibPackage.WEB_SERVICE__CONTENT_RESPONSE:
				return contentResponse != null;
			case DatalibPackage.WEB_SERVICE__CACHED:
				return cached != CACHED_EDEFAULT;
			case DatalibPackage.WEB_SERVICE__URL_PARAMETERS:
				return urlParameters != null && !urlParameters.isEmpty();
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
		result.append(", method: ");
		result.append(method);
		result.append(", parseType: ");
		result.append(parseType);
		result.append(", url: ");
		result.append(url);
		result.append(", options: ");
		result.append(options);
		result.append(", cached: ");
		result.append(cached);
		result.append(')');
		return result.toString();
	}

} //WebServiceImpl
