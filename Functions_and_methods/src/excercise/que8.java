package excercise;

import java.util.Scanner;

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n
public class que8 {

	public static void raisedToNum(int x, int n) {
		int power = 1;
		for(int i=1;i<=n;i++) {
			power=power*x;
		}
		System.out.println(x+" to the power "+n+" is: "+power);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number x");
		int x = sc.nextInt();
		
		System.out.println("Enter number n");
		int n = sc.nextInt();
		
		raisedToNum(x,n);
	}

}
