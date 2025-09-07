package bit;

import java.util.Scanner;

//kisi bhi position ke bit ko update krna
//update the 2nd bit(position=1) of a number n to 1. (n=0101)
//for 0: bitMask:1<<i and Operation:AND with NOT
//for 1: bitmask:1<<i and operation:OR

public class bit_updatebit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation 0 or 1"); //update bit to 1 else update bit to 0
        int operation = sc.nextInt();
		int n =5;
		int pos = 1;
	 		
		if(operation == 1) {
			//set operation
			int bitMask = 1<<pos;
			int newNumber = bitMask | n;
			System.out.println(newNumber);
		} else {
			//clear operation
			int bitmask = 1<<pos;
			int notbit = ~(bitmask);
			int newnum = notbit & n;
			System.out.println(newnum);
			
		}

	}

}
