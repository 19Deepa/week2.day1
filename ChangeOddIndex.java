package week2.day1practice;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme"; 
		char[] res = new char[8];
		char arr[] =test.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				res[i]= Character.toUpperCase(arr[i]);	
			} else res[i] = arr[i]; 
		
		System.out.print(res[i]);
					}
	}
	}


