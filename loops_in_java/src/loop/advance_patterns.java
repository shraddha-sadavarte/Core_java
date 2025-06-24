package loop;

public class advance_patterns {
	public static void main(String [] args ) {
		//butterfly pattern
//		*      *
//		**    **
//		***  ***
//		********
//		********
//		***  ***
//		**    **
//		*      *
		int n=5;
		//upper half
		for(int i=1;i<=n;i++) {
			//1st part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//spaces
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
		
			//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		//lower half
		for(int i=n;i>=1;i--) {
			//1st part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//spaces
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
		
			//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		System.out.println("===========================");
		
		//solid rhombus
//		    *****
//		   *****
//		  *****
//		 *****
//		*****
		int m=5;
		for(int i=1;i<=m;i++) {
			//spaces
			for(int j=1;j<=m-i;j++) {
				System.out.print(" ");
			}
			
			//stars
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
