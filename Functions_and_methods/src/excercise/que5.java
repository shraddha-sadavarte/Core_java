package excercise;

import java.util.Scanner;

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class que5 {
	
	public static void eligibilityForVote(int age) {
		if(age>=18) {
			System.out.println("You are eligible for voting!");
		}
		else if(age<0){
			System.out.println("Enter valid age number");
		}
		else {
			System.out.println("You are child...you can't do voting!");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		eligibilityForVote(age);
	}

}
