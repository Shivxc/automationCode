package Day1;

import java.util.Scanner;

public class assignmen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array define
		
		//for loop
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements you want to store: ");  
	        int n =sc.nextInt();
	        String name[] = new String[n];
	        System.out.println("Enter the names of team members");
	        for(int i=0; i<name.length; i++) {
	            name[i] = sc.next();
	        }
	        for(int j=0; j<name.length; j++) {
	            System.out.println(+j+"th name is: "+name[j]);
	        }
	        


	}
		
}		
	
