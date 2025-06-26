package excercise;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

public class que7 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String ch="yes";
		
		int positive=0, negative=0, zeros=0;
		
		while(ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("y")) {
			System.out.println("Enter number");
			int num=sc.nextInt();
			
			if(num>0) {
				positive++;
			}
			else if(num<0) {
				negative++;
			}
			else {
				zeros++;
			}
			
			System.out.println("Type yes to countinue and no to stop!");
			ch=sc.next();
		}
		
		
		System.out.println("Positive numbers: "+positive);
		System.out.println("Negative numbers: "+negative);
		System.out.println("Zero's count: "+zeros);
	}

}
