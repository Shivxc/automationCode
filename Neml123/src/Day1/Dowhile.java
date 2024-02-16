package Day1;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		int ch=1;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("enter a number");
		int a = sc.nextInt();
		
		int rem=a%2;
		if (rem==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		System.out.println("Do you have more number to check");
		System.out.println("1= yes, \n any number for no");
		ch=sc.nextInt();
		}while(ch==1);
	}
}


	


