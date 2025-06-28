package arrays_pkg;

import java.util.Scanner;

//array is a list of items with same data types
public class arr {
	public static void main(String args[]) {
		//defining an array
//		int[] marks=new int[5];
//		
//		//2nd method
//		//int marks[]=new int[3];
//		
//		//3rd method
//		//int marks= {10,20,30};
//		
//		
//		//adding elements to the array
//		marks[0]=90;
//		marks[1]=87;
//		marks[2]=67;
//		marks[3]=97;
//		marks[4]=80;
//		
//		//printing array
//		System.out.println("Array elements:");
//		for(int i=0;i<marks.length;i++) {
//			System.out.println(marks[i]);
//		}
		
		//By taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int marks1[]=new int[size];
		
		//inputting array elements
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+" element:");
			marks1[i]=sc.nextInt();
		}
		
		//printing the array elements
		System.out.println("You have entered: ");
		for(int i=0;i<size;i++) {
			System.out.println(marks1[i]);
		}
	}
}
