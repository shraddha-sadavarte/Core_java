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
	
	System.out.println("=====================================");
	//half pyramid
//	*
//	**
//	***
//	****
	//here row number becomes total columns
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("=====================================");
	//inverted half pyramid
//	****
//	***
//	**
//	*
	for(int i=4;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("=====================================");
	
	//inverted half pyramid (rotated by 180deg)
	//if n=4
//	   * 3space + 1star =>4 => spaces n-i and i=1 (4-1=3spaces)
//	  ** 2space + 2star =>4 => spaces n-i and i=2 (4-2=2spaces)
//	 *** 1space + 3star =>4 => spaces n-i and i=3 (4-3=1space)
//	**** 0space + 4star =>4 => spaces n-i and i=4 (4-4=0spaces)
	//first outer loop is for rows
	//first inner loop is for space
	//second inner loop is for * printing
	
	for (int i=1;i<=n;i++) {
		//inner loop => space print
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		
		//inner loop => star print
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("=====================================");
	//number pattern
//	1
//	12
//	123
//	1234
//	12345
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("=====================================");
	//inverted number pattern
//	12345
//	1234
//	123
//	12
//	1
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5-i+1;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("=====================================");
	
	//floyd's triangle
//	1
//	2 3
//	4 5 6
//	7 8 9 10
//	11 12 13 14 15
	
	int number = 1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(number+" ");
			number++;
		}
		System.out.println();
	}
	
	System.out.println("=====================================");
	//0-1 triangle
//	1
//	01
//	101
//	0101
//	10101
	
	//visualize in matrix form (1,1) to (5,5)
	//look on sum of cells (1,1)=>2,(2,1)=>3
	//for that we find that for even sum (like 2,4) print 1
	//and for odd sum(like 3,5) print 0
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			int sum=i+j;
			if(sum % 2 == 0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
		}
		System.out.println();
	}
	
	System.out.println("=====================================");
	}
}
