package arrays_pkg;

//array is a list of items with same data types
public class arr {
	public static void main(String args[]) {
		//defining an array
		int[] marks=new int[5];
		//adding elements to the array
		marks[0]=90;
		marks[1]=87;
		marks[2]=67;
		marks[3]=97;
		marks[4]=80;
		
		//printing array
		System.out.println("Array elements:");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
	}
}
