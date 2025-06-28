package arrays_pkg;

import java.util.Scanner;

public class que_arr {

	public static void main(String args[]) {
		//take an array as input from the user.search for a given number x and print the index at which it occurs.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		//get elements from user
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+" element: ");
			arr[i]=sc.nextInt();
		}
		
		//take user input for a number that user wants to find
		System.out.println("Enter element to find: ");
		int x = sc.nextInt();
		boolean found=false;
		
		//traverse the array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("Yeah! Element is found at index "+i);
				System.out.println(arr[i]);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element is not their in array");
		}
		
			
		//max and min number from array of integers
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		//why this swapping of min -> max and max-> min:
		//max is already at the highest, so nothing in the array will be greater → max never updates
		//min is already at the lowest, so nothing in the array will be smaller → min never updates
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Minimum number: "+min);
		System.out.println("Maximum number: "+max);
	}
}
