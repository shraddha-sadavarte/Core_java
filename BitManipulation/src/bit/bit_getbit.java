package bit;

//To get a specific bit (the "ith" bit) from a number using bit manipulation, the following operations are used:
//Create a Bitmask: A bitmask is created by left-shifting the number 1 by i positions. This results in a number where only the i-th bit is set to 1, and all other bits are 0.
//mask = 1 << i
//Bitwise AND Operation: Perform a bitwise AND operation between the original number and the created bitmask.
//If the i-th bit of the original number is 1, then (number & mask) will result in a non-zero value (specifically, mask itself).
//If the i-th bit of the original number is 0, then (number & mask) will result in 0.
//result = number & mask
//Check the Result: To determine if the i-th bit was 0 or 1, check if the result from the AND operation is non-zero.
//If result != 0, the i-th bit of the original number was 1.
//If result == 0, the i-th bit of the original number was 0.
//Example:
//To get the 2nd bit (0-indexed) of the number 13 (binary 1101):
//Mask: 1 << 2 results in 0100 (decimal 4).
//AND: 1101 & 0100 results in 0100.
//Check: Since 0100 is not 0, the 2nd bit of 13 is 1.

public class bit_getbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; //0101
		int pos = 2;
		int bitMask = 1<<pos;
		
		if((bitMask & n) == 0) { //here & is bitwise operator and perform anding between bitmask and n
			System.out.println("Bit was zero");
		} else {
			System.out.println("Bit was one");
		}

	}

}
