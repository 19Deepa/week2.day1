package week2.Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String text1 = "secure" , text2 = "rescue";

//if (text1.length() == text2.length())
//{
	char[] text1char = text1.toCharArray();
	char[] text2char = text2.toCharArray();
	
	Arrays.sort(text1char);
	Arrays.sort(text2char);

	boolean tel = Arrays.equals(text1char, text2char);
	System.out.println("text1: " + text1 + " text2: " + text2 );
	System.out.println("Equal status: " + tel );
//} 
	}

}
