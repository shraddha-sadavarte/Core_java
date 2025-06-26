package functions;

import java.util.Scanner;

public class func {
	
    //function
//	public static void printName(String name) {
//		System.out.println(name);
//		return;
//	}
//	
//	//function to add two numbers and return the sum
//	public static int calculateSum(int a,int b) {
//		int sum=a+b;
//		return sum;
//	}
	
	//factorial of a number
	public static void printFact(int n) {
		int fact=1;
		if(n<0) {
			System.out.println("Invalid number");
			return;
		}
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=sc.next();
//		
//		printName("Hello, "+name);
//		
//		System.out.println("Enter first number to calculate: ");
//		int a=sc.nextInt();
//		
//		System.out.println("Enter second number to calculate: ");
//		int b=sc.nextInt();
//		
//		//call the function
//		int sum = calculateSum(a,b);
//		System.out.println("Sum of two numbers is: "+sum);
		
	    System.out.println("Enter the number you want to print factorial for: ");
	    int n = sc.nextInt();
	    printFact(n);
	    
	}

}
