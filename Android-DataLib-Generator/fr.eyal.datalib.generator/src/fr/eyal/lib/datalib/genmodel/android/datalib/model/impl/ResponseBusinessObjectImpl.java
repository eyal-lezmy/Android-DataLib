/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.Field;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl#getXmlContentFields <em>Xml Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl#getXmlAttributes <em>Xml Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseBusinessObjectImpl extends BusinessObjectImpl implements ResponseBusinessObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseBusinessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESPONSE_BUSINESS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getXmlContentFields() {
		return (EList<Field>)eDynamicGet(ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS, ModelPackage.Literals.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getXmlAttributes() {
		return (EList<Field>)eDynamicGet(ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES, ModelPackage.Literals.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				return ((InternalEList<?>)getXmlContentFields()).basicRemove(otherEnd, msgs);
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				return ((InternalEList<?>)getXmlAttributes()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				return getXmlContentFields();
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				return getXmlAttributes();
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				getXmlContentFields().addAll((Collection<? extends Field>)newValue);
				return;
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				getXmlAttributes().clear();
				getXmlAttributes().addAll((Collection<? extends Field>)newValue);
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				return;
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				getXmlAttributes().clear();
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				return !getXmlContentFields().isEmpty();
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				return !getXmlAttributes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResponseBusinessObjectImpl
