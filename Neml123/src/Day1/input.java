package Day1;

import java.util.*;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // making object of scanner class

	//	System.out.println("Enter your name");
	//	String name = sc.nextLine();
	//	System.out.println("Your name is " + name);
		
		System.out.println("Enter your age");
		int age = sc.nextInt(); // take a age of int type from cansole and store it into variable of int type
		System.out.println("Your age is " + age); // print of the age
		
	//	System.out.println("Enter your height ");
	//	double height = sc.nextDouble();
	//	System.out.println("Your height is " + height);

		if(age>17) {//true block 
			System.out.println("You are allowed for voting");
		}
		else {
			System.out.println("You are not allowed for voting");
		}
		
	if(age>17 && age<101)
	
		System.out.println("You are allowed for dl");
	
	else 
		System.out.println("You are not allowed for dl");
	
	}
}

	

	
