package excercise;

import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.

public class que2 {
	public static void printSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers from 1 to "+n+" is: "+sum);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		printSum(no);
	}
}

