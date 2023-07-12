package application;
/*
 * Class: CMSC203 40398
 * Instructor: Professor Farnaz
 * Description: (FXMainPane is the class that manages the size of the box along with the buttons, CryptoManager is a class that contains the methods for each encrypter and decrypter)
 * Due: 7/11/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Remy Tran
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple "substitution cipher" where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * author Farnaz Eivazi
 * version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters.
	 * 
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds(String plainText) {
	    int textLength = plainText.length();
	    for (int i = 0; i < textLength; i++) {
	        char c = plainText.charAt(i);
	        if (c < LOWER_RANGE || c > UPPER_RANGE) {
	            return false;
	        }
	    }
	    return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.
	 * The parameter plainText is an uppercase string to be encrypted.
	 * The parameter key specifies the offset of each character.
	 * 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		if (isStringInBounds(plainText) == true) {
		    StringBuilder encryptedText = new StringBuilder();
		    int textLength = plainText.length();
		    for (int i = 0; i < textLength; i++) {
		        char c = plainText.charAt(i);
		        int shifted = c + key;
		        while (shifted > UPPER_RANGE) {
		            shifted -= RANGE;
		        }
		        encryptedText.append((char) shifted);
		    }
		    return encryptedText.toString();
		} else {
			return "The selected string is not in bounds, Try again.";
		}

	}
	
    /**
     * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
     * and each character in encryptedText is replaced by the character "offset" characters before it.
     * This is the inverse of the encryptCaesar method.
     * @param encryptedText an encrypted string to be decrypted.
     * @param key an integer that specifies the offset of each character
     * @return the plain text string
     */
	public static String caesarDecryption(String encryptedText, int key) {
	    StringBuilder decryptedText = new StringBuilder();
	    int textLength = encryptedText.length();
	    for (int i = 0; i < textLength; i++) {
	        char c = encryptedText.charAt(i);
	        int shifted = c - key;
	        while (shifted < LOWER_RANGE) {
	            shifted += RANGE;
	        }
	        decryptedText.append((char) shifted);
	    }
	    return decryptedText.toString();
	}


    /**
     * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
     * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
     * to correspond to the length of plainText
     * @param plainText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the encrypted string
     */
	public static String bellasoEncryption(String plainText, String bellasoStr) {
		if (isStringInBounds(plainText) == true) {
		    StringBuilder encryptedText = new StringBuilder();
		    int bellasoStrLength = bellasoStr.length();
		    int plainTextLength = plainText.length();
		    for (int i = 0; i < plainTextLength; i++) {
		        char ch = plainText.charAt(i);
		        char bellasoChar = bellasoStr.charAt(i % bellasoStrLength);
		        int offset = bellasoChar - LOWER_RANGE;
		        int encryptedChar = (ch + offset - 2 * LOWER_RANGE + RANGE) % RANGE + LOWER_RANGE;
		        encryptedText.append((char) encryptedChar);
		    }
		    return encryptedText.toString();
		} else {
			return "The selected string is not in bounds, Try again.";
		}

	}


    /**
     * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
     * the character corresponding to the character in bellasoStr, which is repeated
     * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
     * @param encryptedText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the decrypted string
     */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
	    StringBuilder decryptedText = new StringBuilder();
	    int bellasoStrLength = bellasoStr.length();
	    int encryptedTextLength = encryptedText.length();
	    for (int i = 0; i < encryptedTextLength; i++) {
	        char ch = encryptedText.charAt(i);
	        char bellasoChar = bellasoStr.charAt(i % bellasoStrLength);
	        int offset = bellasoChar - LOWER_RANGE;
	        int decryptedChar = (ch - offset + 2 * LOWER_RANGE + RANGE) % RANGE + LOWER_RANGE;
	        decryptedText.append((char) decryptedChar);
	    }
	    return decryptedText.toString();
	}
}
