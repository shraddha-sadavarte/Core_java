package bit;

//set the 2nd bit(position=1) of a number n. (n=0101)
//1)Bit Mask : 1 << i
//0101 << 1 => 0010
//2)Operation :  OR 
//0010 | 0101 => 0111 -> 7 in decimal

public class bit_setbit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; //0101
		int pos = 1;
		int bitMask = 1<<pos;
		
		int newNumber = bitMask | n;
		System.out.println(newNumber);

	}
}
