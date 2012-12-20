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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectImpl extends CDOObjectImpl implements BusinessObject {
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
	 * The default value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAME_EDEFAULT = null;

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
		return (String)eDynamicGet(ModelPackage.BUSINESS_OBJECT__NAME, ModelPackage.Literals.BUSINESS_OBJECT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ModelPackage.BUSINESS_OBJECT__NAME, ModelPackage.Literals.BUSINESS_OBJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return (String)eDynamicGet(ModelPackage.BUSINESS_OBJECT__PACKAGE, ModelPackage.Literals.BUSINESS_OBJECT__PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		eDynamicSet(ModelPackage.BUSINESS_OBJECT__PACKAGE, ModelPackage.Literals.BUSINESS_OBJECT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getAttributes() {
		return (EList<Field>)eDynamicGet(ModelPackage.BUSINESS_OBJECT__ATTRIBUTES, ModelPackage.Literals.BUSINESS_OBJECT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getContentFields() {
		return (EList<Field>)eDynamicGet(ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS, ModelPackage.Literals.BUSINESS_OBJECT__CONTENT_FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BusinessObject> getChilds() {
		return (EList<BusinessObject>)eDynamicGet(ModelPackage.BUSINESS_OBJECT__CHILDS, ModelPackage.Literals.BUSINESS_OBJECT__CHILDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getParent() {
		return (BusinessObject)eDynamicGet(ModelPackage.BUSINESS_OBJECT__PARENT, ModelPackage.Literals.BUSINESS_OBJECT__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetParent() {
		return (BusinessObject)eDynamicGet(ModelPackage.BUSINESS_OBJECT__PARENT, ModelPackage.Literals.BUSINESS_OBJECT__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BusinessObject newParent) {
		eDynamicSet(ModelPackage.BUSINESS_OBJECT__PARENT, ModelPackage.Literals.BUSINESS_OBJECT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlName() {
		return (String)eDynamicGet(ModelPackage.BUSINESS_OBJECT__XML_NAME, ModelPackage.Literals.BUSINESS_OBJECT__XML_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlName(String newXmlName) {
		eDynamicSet(ModelPackage.BUSINESS_OBJECT__XML_NAME, ModelPackage.Literals.BUSINESS_OBJECT__XML_NAME, newXmlName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getParseId() {
		return (BigInteger)eDynamicGet(ModelPackage.BUSINESS_OBJECT__PARSE_ID, ModelPackage.Literals.BUSINESS_OBJECT__PARSE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseId(BigInteger newParseId) {
		eDynamicSet(ModelPackage.BUSINESS_OBJECT__PARSE_ID, ModelPackage.Literals.BUSINESS_OBJECT__PARSE_ID, newParseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldBusinessObject getRelatedField() {
		return (FieldBusinessObject)eDynamicGet(ModelPackage.BUSINESS_OBJECT__RELATED_FIELD, ModelPackage.Literals.BUSINESS_OBJECT__RELATED_FIELD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldBusinessObject basicGetRelatedField() {
		return (FieldBusinessObject)eDynamicGet(ModelPackage.BUSINESS_OBJECT__RELATED_FIELD, ModelPackage.Literals.BUSINESS_OBJECT__RELATED_FIELD, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedField(FieldBusinessObject newRelatedField) {
		eDynamicSet(ModelPackage.BUSINESS_OBJECT__RELATED_FIELD, ModelPackage.Literals.BUSINESS_OBJECT__RELATED_FIELD, newRelatedField);
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
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ModelPackage.BUSINESS_OBJECT__PACKAGE:
				return PACKAGE_EDEFAULT == null ? getPackage() != null : !PACKAGE_EDEFAULT.equals(getPackage());
			case ModelPackage.BUSINESS_OBJECT__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case ModelPackage.BUSINESS_OBJECT__CONTENT_FIELDS:
				return !getContentFields().isEmpty();
			case ModelPackage.BUSINESS_OBJECT__CHILDS:
				return !getChilds().isEmpty();
			case ModelPackage.BUSINESS_OBJECT__PARENT:
				return basicGetParent() != null;
			case ModelPackage.BUSINESS_OBJECT__XML_NAME:
				return XML_NAME_EDEFAULT == null ? getXmlName() != null : !XML_NAME_EDEFAULT.equals(getXmlName());
			case ModelPackage.BUSINESS_OBJECT__PARSE_ID:
				return PARSE_ID_EDEFAULT == null ? getParseId() != null : !PARSE_ID_EDEFAULT.equals(getParseId());
			case ModelPackage.BUSINESS_OBJECT__RELATED_FIELD:
				return basicGetRelatedField() != null;
		}
		return super.eIsSet(featureID);
	}

} //BusinessObjectImpl
