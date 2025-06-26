package excercise;

import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.
public class que4 {

	public static float circumferenceOfCircle(int radius) {
		float circumference;
		circumference=(float) (2*3.14*radius);
		return circumference;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius=sc.nextInt();
		
		float result = circumferenceOfCircle(radius);
		System.out.println("Circumference of a circle with radius "+radius+" is: "+result);
	}
}
