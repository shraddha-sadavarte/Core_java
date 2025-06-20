package loop;

public class patterns {
	public static void main(String args[]) {
		//pattern - solid rectangle
//		*****
//		*****
//		*****
//		***** c=5,r=4
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
