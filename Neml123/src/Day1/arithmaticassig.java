package Day1;

import java.util.Scanner;

public class arithmaticassig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=1;
		   Scanner sc=new Scanner(System.in);
			do {
			System.out.println("Enter your Number"); 
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			System.out.println("Enter your Operator");
			System.out.println("1 add");
			System.out.println("2.substarct\n3.multiple\n4.Division");
			
			int c=sc.nextInt();
		
			if(c==1)
				System.out.println("your ans is "+(a+b));
			else if(c==2)
			    System.out.println("Your ans is "+(a-b));
			else if(c==3)
			    System.out.println("Your ans is "+(a*b));
			else if(c==4)
			    System.out.println("Your ans is "+(a/b));
			else
				System.out.println("Invalid Operator");
			
             System.out.println("Do you want to do operation?");
             System.out.println("1.yes\nany no for NO ");
             ch=sc.nextInt();
	 		}while(ch==1);
	}
	  
}
