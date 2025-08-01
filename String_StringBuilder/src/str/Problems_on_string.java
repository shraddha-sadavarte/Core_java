package str;

import java.util.Scanner;

public class Problems_on_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of string array: ");
		int size = sc.nextInt();
		
		String array[] = new String[size];
		int totalLength = 0;
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter strings:");
			array[i] = sc.next();
			totalLength+=array[i].length();
		}
		
		System.out.println(totalLength);
		
		//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
		//Example : 
			//original = “eabcdef’ ; result = “iabcdif”
			//Original = “xyz” ; result = “xyz”
		
		String str = sc.next();
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'e') {
				result += 'i';
			} else {
				result += str.charAt(i);
			}
		}
		System.out.println(result);


//		Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//		Example : 
//		email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
//		email = “helloWorld123@gmail.com”; username = “helloWorld123”
		
		System.out.println("Enter email:");
		String email=sc.next();
		String username="";
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i) == '@') {
				break;
			} else {
				username += email.charAt(i);
			}
		}
		System.out.println(username);
	}

}
