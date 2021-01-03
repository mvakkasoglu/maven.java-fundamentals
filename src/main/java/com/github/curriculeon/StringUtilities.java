 package com.github.curriculeon;

/**
 * Created by Leon Hunter on 6/14/17. Editing to trigger build jenkins.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
    	String str = "Hello World";
        return str;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
    	String str = firstSegment + secondSegment;
        return str;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
    	String str = firstSegment + secondSegment;
        return str;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
    	String str = input.substring(0, 3);
        return str;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
    	String str = input.substring(input.length()-3);
        return str;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){ 
        return inputValue == comparableValue;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
    	Character ch = 'a';
    	if(inputValue.length() %2 != 0) {
    		ch = inputValue.charAt(inputValue.length()/2);
    	}
    	else 
    		ch = inputValue.charAt((inputValue.length()/2)-1);
        return ch;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
    	String [] listOfWords = spaceDelimitedString.split(" ");
    	String str = listOfWords[0];
        return str;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
    	String [] listOfWords = spaceDelimitedString.split(" ");
    	String str = listOfWords[1];
        return str;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
    	StringBuilder sb = new StringBuilder(stringToReverse);
    	String str = (sb.reverse()).toString();
        return str;
    }
}
