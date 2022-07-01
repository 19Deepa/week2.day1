package week2.day1practice;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
        String[] split =test.split(" ");  //[I,am,a,software,tester]
        String temp=" ";  
		for(int i=0;i<split.length;i++) {
			String revstr=" ";
			if(i%2==1) {
			char[] CharArray=split[i].toCharArray();  //[a,m]
			for(int j=CharArray.length-1;j>=0;j--) {
				revstr=revstr +CharArray[j];
			}
					temp =temp +revstr+" ";
					}	
			else 
				temp =temp+split[i]+" ";
			}
		System.out.println(temp);					
		}
}


