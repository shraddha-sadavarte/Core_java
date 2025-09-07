package bit;

public class decimaltobinary {
	
	//functionto convert decimal to binary
	public static String decimalToBinary (int n) {
		return Integer.toBinaryString(n);
	}
	
	//function to convert binary to decimal
	public static int binaryToDecimal(String binary) {
		return Integer.parseInt(binary,2);
	}
	
	public static void main(String[] args) {
		int decimal = 25;
		String binary = "11001";
		
		System.out.println(decimal + " in binary = " + decimalToBinary(decimal));
		System.out.println(binary + " in decimal = " + binaryToDecimal(binary));
	}

}
