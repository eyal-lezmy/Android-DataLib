package fr.eyal.datalib.sample.netflix;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Random;
import java.util.SortedSet;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import fr.eyal.lib.data.communication.rest.ParameterMap;

public class NetflixUtils {
	
	public static final String HMACSHA1_NAME_WEB = "HMAC-SHA1";
	public static final String HMACSHA1_NAME = "HmacSHA1";
	public static final String RSA_SHA1 = "SHA1withRSA";
	public static final String ENCODING_UTF8 = "UTF-8";
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static final int MAX_NONCE_SIZE = 20;
	public static final int MIN_NONCE_SIZE = 5;

	
	public static String getNonce(){
		Random random = new Random();
		return getNonce(MIN_NONCE_SIZE+random.nextInt(MAX_NONCE_SIZE-MIN_NONCE_SIZE+1));
	}
	
	public static String getNonce(int size){
		StringBuilder builder = new StringBuilder(size);
		Random random = new Random();
		
		for (int i = 0; i < size; i++) {
			builder.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
		}

		return builder.toString();
	}

	public static String byteToHex(final byte[] hash)
	{
	    Formatter formatter = new Formatter();
	    for (byte b : hash)
	    {
	        formatter.format("%02x", b);
	    }
	    String result = formatter.toString();
	    formatter.close();
	    return result;
	}
	
	/**
	 * Generate an OAuth signature depending on the request content
	 * 
	 * @param restAction the rest action to execute GET, POST, PUT, DELETE, HEAD
	 * @param url the scheme + authority + path of the request
	 * @param params the parameters of the request
	 * 
	 * @return returns the OAuth signature to add to the request
	 * 
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String getOAuthSignature(String restAction, String url, ParameterMap params) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException{
		

		String parameters = getParametersString(params);
		String signature;
		
		signature = restAction+"&"+URLEncoder.encode(url, NetflixUtils.ENCODING_UTF8)+"&"+URLEncoder.encode(parameters, NetflixUtils.ENCODING_UTF8);

		String keyString = NetflixConfig.CONSUMER_SECRET + '&';
		byte[] keyBytes = keyString.getBytes(NetflixUtils.ENCODING_UTF8);

		SecretKey key = new SecretKeySpec(keyBytes, HMACSHA1_NAME);
		Mac mac = Mac.getInstance(HMACSHA1_NAME);
		mac.init(key);

		byte[] text = signature.getBytes(NetflixUtils.ENCODING_UTF8);

		byte[] result = mac.doFinal(text);
		String sign = new String(Base64.encodeBase64(result));

		//we don't URL encode the signature because it is encoded by the Datalib process
		signature = sign; //URLEncoder.encode(sign, NetflixUtils.ENCODING_UTF8);

		return signature;
	}

	public static String getParametersString(ParameterMap params) {
		
		StringBuilder builder = new StringBuilder();
		SortedSet<String> keys = params.keySet(true);
		
		for (String key : keys) {
			builder.append(key);
			builder.append('=');
			builder.append(params.get(key));
			builder.append('&');
		}
		//we remove the last & character 
		builder.deleteCharAt(builder.length()-1);
		
		return builder.toString();
	}
}
