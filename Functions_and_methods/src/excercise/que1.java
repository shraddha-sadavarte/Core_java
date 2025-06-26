package excercise;

import java.util.Scanner;

public class que1 {
	//Enter 3 numbers from the user & make a function to print their average.
	public static int printAvg(int a, int b, int c) {
		int avg = (a+b+c)/3;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int no1=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int no2=sc.nextInt();
		
		System.out.println("Enter third number: ");
		int no3=sc.nextInt();
		
		int avg=printAvg(no1,no2,no3);
		System.out.println("Average of three numbers is: "+avg);
		
		
	}

}
