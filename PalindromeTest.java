package week2.day1practice;

public class PalindromeTest {

	public static void main(String[] args) {
		
		String str ="madam" ,rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev + str.charAt(i);}
			if(str.equals(rev)) {
				System.out.println("The given string is palindrome  "+str);
				}
			else System.out.println("Not Palindrome "+str);
		}
		
		
	}


