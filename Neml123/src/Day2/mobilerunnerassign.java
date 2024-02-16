package Day2;

import java.util.*;

public class mobilerunnerassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Basic j = null;
		System.out.println("Enter your mobile series ");
		String a = sc.next();
		if (a.equals("m")) {
			j = new mseries();
		} else {
			j = new jseries();

		}
		
		j.in_call();
    	j.out_call();
    	j.in_sms();
    	j.out_sms();
    	
    	
    	
	}
	
}
