package Day1;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Marks");	
		double a=sc.nextDouble();
		
		if (a>0 && a<34)
			System.out.println("Your Bad You Failed");
		else if (a>=35 && a<49)
			System.out.println("Cong You passed");
		else if (a>=50 && a<59)
			System.out.println("Cong You passed with second class");
		else if (a>=60 && a<74)
			System.out.println("Cong You passed with First class");
		else if (a>=75 && a<100)
			System.out.println("Cong You passed with First class and Distintion");
		else
			System.out.println("Dont cheat Enter proper marks");
	}

}
