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
	
	//hollow rectangle
//for right side => top to bottom j=1
//    ***** => i=1 from top to bottom j=5=m
//    *   *
//    *   *
//    *****	=>i=4=n consider matrix form (1,1) to (4,4)
	//rows = outer loop, col = inner loop
	System.out.println("=====================================");
	int n=4;
	int m=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			if(i==1 || i==n || j==1 || j==m) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	}
}
