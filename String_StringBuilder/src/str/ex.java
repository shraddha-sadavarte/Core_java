package str;

import java.util.Scanner;

public class ex {
	
	public static void main(String[] args) {
		String name="Shraddha"; //declaration
		
		//taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String nm=sc.next();
		
		//concatenation
		String first="Shraddha";
		String second="Sadavarte";
		
		String fullname=first+" "+second;
		System.out.println(fullname);
		
		//prints a length of string
		System.out.println(fullname.length());
		
		//access characters of a string
		for(int i=0;i<fullname.length();i++) {
			System.out.println(fullname.charAt(i));
		}
		
		//to check equality of strings use .equals() method
		String s1="Shraddha";
		String s2="Shraddha";
		
		if(s1.equals(s2)) {
			System.out.println("Both strings are same");
		} else {
			System.out.println("Both strings are different");
		}
		
		//substring - subpart of string
		System.out.println(s1.substring(0,4));
		
		//parseInt method of integer class
		String str="123";
		int number = Integer.parseInt(str);
		System.out.println(number);
		
		//toString method of string class
		int num=123;
		String str1=Integer.toString(num);
		System.out.println(str1.length());
		
		//IN JAVA, STRINGS ARE IMMUTABLE
	}

}
