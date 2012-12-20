/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.content;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Lib Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentPackage#getDataLibOption()
 * @model instanceClass="fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption"
 * @generated
 */
public enum DataLibOption implements Enumerator {
	/**
	 * The '<em><b>No Option</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_OPTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_OPTION(0, "noOption", "noOption"),

	/**
	 * The '<em><b>Conserve Cookie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSERVE_COOKIE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSERVE_COOKIE(1, "conserveCookie", "conserveCookie"),

	/**
	 * The '<em><b>Send With Parcelable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_WITH_PARCELABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SEND_WITH_PARCELABLE(2, "sendWithParcelable", "sendWithParcelable"),

	/**
	 * The '<em><b>Data Base Cache Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_BASE_CACHE_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_BASE_CACHE_DISABLED(3, "dataBaseCacheDisabled", "dataBaseCacheDisabled"),

	/**
	 * The '<em><b>Host Verifier Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_VERIFIER_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_VERIFIER_DISABLED(4, "hostVerifierDisabled", "hostVerifierDisabled"),

	/**
	 * The '<em><b>Helper Cache Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELPER_CACHE_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	HELPER_CACHE_DISABLED(5, "helperCacheDisabled", "helperCacheDisabled");

	/**
	 * The '<em><b>No Option</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Option</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_OPTION
	 * @model name="noOption"
	 * @generated
	 * @ordered
	 */
	public static final int NO_OPTION_VALUE = 0;

	/**
	 * The '<em><b>Conserve Cookie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conserve Cookie</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSERVE_COOKIE
	 * @model name="conserveCookie"
	 * @generated
	 * @ordered
	 */
	public static final int CONSERVE_COOKIE_VALUE = 1;

	/**
	 * The '<em><b>Send With Parcelable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Send With Parcelable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND_WITH_PARCELABLE
	 * @model name="sendWithParcelable"
	 * @generated
	 * @ordered
	 */
	public static final int SEND_WITH_PARCELABLE_VALUE = 2;

	/**
	 * The '<em><b>Data Base Cache Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Base Cache Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_BASE_CACHE_DISABLED
	 * @model name="dataBaseCacheDisabled"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_BASE_CACHE_DISABLED_VALUE = 3;

	/**
	 * The '<em><b>Host Verifier Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Host Verifier Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOST_VERIFIER_DISABLED
	 * @model name="hostVerifierDisabled"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_VERIFIER_DISABLED_VALUE = 4;

	/**
	 * The '<em><b>Helper Cache Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Helper Cache Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELPER_CACHE_DISABLED
	 * @model name="helperCacheDisabled"
	 * @generated
	 * @ordered
	 */
	public static final int HELPER_CACHE_DISABLED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Data Lib Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataLibOption[] VALUES_ARRAY =
		new DataLibOption[] {
			NO_OPTION,
			CONSERVE_COOKIE,
			SEND_WITH_PARCELABLE,
			DATA_BASE_CACHE_DISABLED,
			HOST_VERIFIER_DISABLED,
			HELPER_CACHE_DISABLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Lib Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataLibOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Lib Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataLibOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataLibOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Lib Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataLibOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataLibOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Lib Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataLibOption get(int value) {
		switch (value) {
			case NO_OPTION_VALUE: return NO_OPTION;
			case CONSERVE_COOKIE_VALUE: return CONSERVE_COOKIE;
			case SEND_WITH_PARCELABLE_VALUE: return SEND_WITH_PARCELABLE;
			case DATA_BASE_CACHE_DISABLED_VALUE: return DATA_BASE_CACHE_DISABLED;
			case HOST_VERIFIER_DISABLED_VALUE: return HOST_VERIFIER_DISABLED;
			case HELPER_CACHE_DISABLED_VALUE: return HELPER_CACHE_DISABLED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataLibOption(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataLibOption
