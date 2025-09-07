package bit;

public class excercise {

	public static void main(String[] args) {
		//1)check if a number is a power of 2
		//Logic: A number n is a power of 2 if it has only one 1 in binary.
		//Example: 16 = 10000 (one set bit).
		        // n - 1 = 15 = 01111
		        // 10000 & 01111 = 00000 → 0
				//So, 16 is a power of 2.
		int n = 16;
		if(n>0 && (n & (n-1)) == 0) {
			System.out.println(n+ " is a power of 2");
		} else {
			System.out.println(n+ " is Not a power of 2");
		}
		
		//2)toggle a bit at position pos
		//Logic: XOR with (1 << pos) flips the bit.
		 int n1 = 29; // 11101 in binary
	     int pos = 3; // toggle 3rd bit (counting from 0)

	     int result = n1 ^ (1 << pos);

	     System.out.println("Original number: " + n1);
	     System.out.println("After toggling bit at position " + pos + ": " + result);
	     
	     //3)count number of 1`s in binary presentation
	     int n2 = 29; // 11101 → 4 ones
	        int count = 0;

	        while (n2 > 0) {
	            count += (n2 & 1); // check last bit
	            n2 >>= 1;          // shift right
	        }

	        System.out.println("Number of 1's: " + count);
	        
	   	}

}
