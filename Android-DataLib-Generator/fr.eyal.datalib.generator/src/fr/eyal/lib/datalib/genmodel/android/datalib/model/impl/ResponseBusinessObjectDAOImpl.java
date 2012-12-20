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
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObjectDAO;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Business Object DAO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectDAOImpl#getXmlContentFields <em>Xml Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectDAOImpl#getXmlAttributes <em>Xml Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseBusinessObjectDAOImpl extends BusinessObjectDAOImpl implements ResponseBusinessObjectDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseBusinessObjectDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESPONSE_BUSINESS_OBJECT_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getXmlContentFields() {
		return (EList<Field>)eDynamicGet(ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS, ModelPackage.Literals.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getXmlAttributes() {
		return (EList<Field>)eDynamicGet(ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES, ModelPackage.Literals.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS:
				return ((InternalEList<?>)getXmlContentFields()).basicRemove(otherEnd, msgs);
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES:
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS:
				return getXmlContentFields();
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES:
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				getXmlContentFields().addAll((Collection<? extends Field>)newValue);
				return;
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES:
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				return;
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES:
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS:
				return !getXmlContentFields().isEmpty();
			case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES:
				return !getXmlAttributes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResponseBusinessObject.class) {
			switch (derivedFeatureID) {
				case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS: return ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS;
				case ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES: return ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResponseBusinessObject.class) {
			switch (baseFeatureID) {
				case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS: return ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS;
				case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES: return ModelPackage.RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ResponseBusinessObjectDAOImpl
