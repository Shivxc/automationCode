package Day1;

import java.util.*;

public class calculatorwithswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter your Operator");
		System.out.println("1 add");
		System.out.println("2.substarct\n3.multiple\n4.Division");
		
		int c=sc.nextInt();
		
		switch(c)   //choice variable i round braces
		{
		case 1 :
			System.out.println("your ans is "+(a+b));
			break;
		case 2 : 
			System.out.println("Your ans is "+(a-b));
			break;
		case 3 :
			System.out.println("Your ans is "+(a*b));
			break;
		case 4 :
		    System.out.println("Your ans is "+(a/b));
		    break;
		case 5 :
			System.out.println("Invalid Operator");
			break;
		}
		
	}
	
}
		
		
		
		
		
		
	