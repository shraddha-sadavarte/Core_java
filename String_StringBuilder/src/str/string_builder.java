package str;

public class string_builder {

	public static void main(String[] args) {
		//declaration
		StringBuilder sb = new StringBuilder("Coding Hub");
		System.out.println(sb);
		
		//get a character from index
		System.out.println(sb.charAt(2));
		
		//set a character at index
		sb.setCharAt(9, 'p');
		System.out.println(sb);
		
		//insert a character at some index
		sb.insert(0,"S-");
		System.out.println(sb);
		
		//delete char at some index
		sb.delete(0, 2);
	    System.out.println(sb);
	    
	    //append a char : append means to add something at the end
	    sb.append(" by shraddha");
	    System.out.println(sb);
	    
	    //print length of string
	    System.out.println(sb.length());
	    
	    //reverse a string using stringBuilder
	    StringBuilder sb1 = new StringBuilder("Shraddha");
	    for(int i=0;i<sb1.length()/2;i++) {
	    	int front =i;
	    	int back = sb1.length()-i-1;
	    	
	    	char frontChar = sb1.charAt(front);
	    	char backChar = sb1.charAt(back);
	    	
	    	sb1.setCharAt(front, backChar);
	    	sb1.setCharAt(back, frontChar);
	    }
	    System.out.println(sb1);

	}

}
