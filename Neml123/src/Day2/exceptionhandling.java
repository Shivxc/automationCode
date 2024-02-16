package Day2;

import java.util.Scanner;

public class exceptionhandling {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Number");
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			try {//try to do this risky code is kept inside try block
			 System.out.println("Your ans is "+(a/b));
			}catch (Exception A) {
				System.out.println("error while division "+ A.getMessage());
			 
				System.out.println("your ans is "+(a+b));
		
			    System.out.println("Your ans is "+(a-b));
			
			    System.out.println("Your ans is "+(a*b));
			
		
		
		
		
			
		}

	}

}


