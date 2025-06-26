package excercise;

import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two.
public class que3 {
	public static void greaterNo(int a, int b) {
		if(a>b) {
			System.out.println(a+" is greater");
		}
		else {
			System.out.println(b+" is greater");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int no1=sc.nextInt();
		
		System.out.println("Enter second number");
		int no2=sc.nextInt();
		
		greaterNo(no1,no2);
	}

}
