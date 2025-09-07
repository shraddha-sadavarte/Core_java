package bit;

//kisi bhi number ke andar jakar us position ke number ko means bit ko zero bana dena
//clear the 3rd bit(position-2) of number n (0101)
//1)bit mask : 1 << i => 0001 << 2 => 0100
//2) operation : AND with NOT => ~(0100) => 1011
//and perform AND with n => 1011 AND 0101 => 0001 => 1 in decimal

public class bit_clearbit {

	public static void main(String[] args) {
		int num = 5;
		int pos = 2;
		int bitMask = 1<<pos;
		int notBitmask = ~(bitMask);
		
		int newNum = notBitmask & num;
		System.out.println(newNum);
	}

}
