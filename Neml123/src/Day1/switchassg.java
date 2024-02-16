package Day1;

import java.util.Scanner;

public class switchassg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("which company owner you want to know ?");
		System.out.println("1.IE\n2.EDGE\n3.CROME\n4.FIREFOX\n5.SAFARI");
		
		Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
		
		switch(c)
		{
		case 1: System.out.println("Company owner is Microsoft");
		break;
		case 2 : System.out.println("company owner is Microsoft");
		break;
		case 3: System.out.println("Company owner is Google");
		break;
		case 4 : System.out.println("company owner is MOZILLA");
		break;
		case 5 : System.out.println("company owner is MAC");
		break;
		}
	
		
	}

}
