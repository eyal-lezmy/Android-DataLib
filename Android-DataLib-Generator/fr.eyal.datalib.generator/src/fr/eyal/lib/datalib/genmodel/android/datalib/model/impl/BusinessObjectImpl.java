/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.Field;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getContentFields <em>Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getXmlName <em>Xml Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getParseId <em>Parse Id</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getRelatedField <em>Related Field</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getJavaName <em>Java Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl#getJavaTag <em>Java Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectImpl extends EObjectImpl implements BusinessObject {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> attributes;

	/**
	 * The cached value of the '{@link #getContentFields() <em>Content Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> contentFields;

	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObject> childs;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected BusinessObject parent;

	/**
	 * The default value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected String xmlName = XML_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParseId() <em>Parse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PARSE_ID_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getParseId() <em>Parse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger parseId = PARSE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedField() <em>Related Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedField()
	 * @generated
	 * @ordered
	 */
	protected FieldBusinessObject relatedField;

	/**
	 * The default value of the '{@link #getJavaName() <em>Java Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaName()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaName() <em>Java Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaName()
	 * @generated
	 * @ordered
	 */
	protected String javaName = JAVA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaTag() <em>Java Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaTag()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaTag() <em>Java Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaTag()
	 * @generated
	 * @ordered
	 */
	protected String javaTag = JAVA_TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BUSINESS_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Field>(Field.class, this, ModelPackage.BUSINESS_OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getContentFields() {
		if (contentFields == null) {
			contentFields = new EObjectContainmentEList<Field>(Field.class, this, ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS);
		}
		return contentFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObject> getChilds() {
		if (childs == null) {
			childs = new EObjectContainmentEList<BusinessObject>(BusinessObject.class, this, ModelPackage.BUSINESS_OBJECT__CHILDS);
		}
		return childs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (BusinessObject)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BUSINESS_OBJECT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BusinessObject newParent) {
		BusinessObject oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlName() {
		return xmlName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlName(String newXmlName) {
		String oldXmlName = xmlName;
		xmlName = newXmlName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__XML_NAME, oldXmlName, xmlName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getParseId() {
		return parseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseId(BigInteger newParseId) {
		BigInteger oldParseId = parseId;
		parseId = newParseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__PARSE_ID, oldParseId, parseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldBusinessObject getRelatedField() {
		if (relatedField != null && relatedField.eIsProxy()) {
			InternalEObject oldRelatedField = (InternalEObject)relatedField;
			relatedField = (FieldBusinessObject)eResolveProxy(oldRelatedField);
			if (relatedField != oldRelatedField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BUSINESS_OBJECT__RELATED_FIELD, oldRelatedField, relatedField));
			}
		}
		return relatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldBusinessObject basicGetRelatedField() {
		return relatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedField(FieldBusinessObject newRelatedField) {
		FieldBusinessObject oldRelatedField = relatedField;
		relatedField = newRelatedField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__RELATED_FIELD, oldRelatedField, relatedField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaName() {
		return javaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaName(String newJavaName) {
		String oldJavaName = javaName;
		javaName = newJavaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__JAVA_NAME, oldJavaName, javaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaTag() {
		return javaTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaTag(String newJavaTag) {
		String oldJavaTag = javaTag;
		javaTag = newJavaTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUSINESS_OBJECT__JAVA_TAG, oldJavaTag, javaTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BUSINESS_OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS:
				return ((InternalEList<?>)getContentFields()).basicRemove(otherEnd, msgs);
			case ModelPackage.BUSINESS_OBJECT__CHILDS:
				return ((InternalEList<?>)getChilds()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.BUSINESS_OBJECT__NAME:
				return getName();
			case ModelPackage.BUSINESS_OBJECT__PACKAGE:
				return getPackage();
			case ModelPackage.BUSINESS_OBJECT__ATTRIBUTES:
				return getAttributes();
			case ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS:
				return getContentFields();
			case ModelPackage.BUSINESS_OBJECT__CHILDS:
				return getChilds();
			case ModelPackage.BUSINESS_OBJECT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ModelPackage.BUSINESS_OBJECT__XML_NAME:
				return getXmlName();
			case ModelPackage.BUSINESS_OBJECT__PARSE_ID:
				return getParseId();
			case ModelPackage.BUSINESS_OBJECT__RELATED_FIELD:
				if (resolve) return getRelatedField();
				return basicGetRelatedField();
			case ModelPackage.BUSINESS_OBJECT__JAVA_NAME:
				return getJavaName();
			case ModelPackage.BUSINESS_OBJECT__JAVA_TAG:
				return getJavaTag();
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
			case ModelPackage.BUSINESS_OBJECT__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__PACKAGE:
				setPackage((String)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Field>)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS:
				getContentFields().clear();
				getContentFields().addAll((Collection<? extends Field>)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection<? extends BusinessObject>)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__PARENT:
				setParent((BusinessObject)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__XML_NAME:
				setXmlName((String)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__PARSE_ID:
				setParseId((BigInteger)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__RELATED_FIELD:
				setRelatedField((FieldBusinessObject)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__JAVA_NAME:
				setJavaName((String)newValue);
				return;
			case ModelPackage.BUSINESS_OBJECT__JAVA_TAG:
				setJavaTag((String)newValue);
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
			case ModelPackage.BUSINESS_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.BUSINESS_OBJECT__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case ModelPackage.BUSINESS_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS:
				getContentFields().clear();
				return;
			case ModelPackage.BUSINESS_OBJECT__CHILDS:
				getChilds().clear();
				return;
			case ModelPackage.BUSINESS_OBJECT__PARENT:
				setParent((BusinessObject)null);
				return;
			case ModelPackage.BUSINESS_OBJECT__XML_NAME:
				setXmlName(XML_NAME_EDEFAULT);
				return;
			case ModelPackage.BUSINESS_OBJECT__PARSE_ID:
				setParseId(PARSE_ID_EDEFAULT);
				return;
			case ModelPackage.BUSINESS_OBJECT__RELATED_FIELD:
				setRelatedField((FieldBusinessObject)null);
				return;
			case ModelPackage.BUSINESS_OBJECT__JAVA_NAME:
				setJavaName(JAVA_NAME_EDEFAULT);
				return;
			case ModelPackage.BUSINESS_OBJECT__JAVA_TAG:
				setJavaTag(JAVA_TAG_EDEFAULT);
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
			case ModelPackage.BUSINESS_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.BUSINESS_OBJECT__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case ModelPackage.BUSINESS_OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS:
				return contentFields != null && !contentFields.isEmpty();
			case ModelPackage.BUSINESS_OBJECT__CHILDS:
				return childs != null && !childs.isEmpty();
			case ModelPackage.BUSINESS_OBJECT__PARENT:
				return parent != null;
			case ModelPackage.BUSINESS_OBJECT__XML_NAME:
				return XML_NAME_EDEFAULT == null ? xmlName != null : !XML_NAME_EDEFAULT.equals(xmlName);
			case ModelPackage.BUSINESS_OBJECT__PARSE_ID:
				return PARSE_ID_EDEFAULT == null ? parseId != null : !PARSE_ID_EDEFAULT.equals(parseId);
			case ModelPackage.BUSINESS_OBJECT__RELATED_FIELD:
				return relatedField != null;
			case ModelPackage.BUSINESS_OBJECT__JAVA_NAME:
				return JAVA_NAME_EDEFAULT == null ? javaName != null : !JAVA_NAME_EDEFAULT.equals(javaName);
			case ModelPackage.BUSINESS_OBJECT__JAVA_TAG:
				return JAVA_TAG_EDEFAULT == null ? javaTag != null : !JAVA_TAG_EDEFAULT.equals(javaTag);
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
		result.append(", xmlName: ");
		result.append(xmlName);
		result.append(", parseId: ");
		result.append(parseId);
		result.append(", javaName: ");
		result.append(javaName);
		result.append(", javaTag: ");
		result.append(javaTag);
		result.append(')');
		return result.toString();
	}

} //BusinessObjectImpl
