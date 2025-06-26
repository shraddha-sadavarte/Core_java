package excercise;

import java.util.Scanner;

//Write a function that calculates the Greatest Common Divisor of 2 numbers.

//Example:
//Let's say a = 24 and b = 18
//
//24 % 18 = 6 → set a = 18, b = 6
//
//18 % 6 = 0 → set a = 6, b = 0
//
//Loop stops. GCD = 6
public class que9 {
	 public static int findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter first number:");
	        int num1 = sc.nextInt();
	        
	        System.out.println("Enter second number:");
	        int num2 = sc.nextInt();
	        
	        int result = findGCD(num1, num2);
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
	        
	        sc.close();
	    }
}
