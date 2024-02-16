package Day2;

public class vehicleparent {

   String bName, vehicleNumber;
   int price;
   
   public void drive() {
	   System.out.println("vehicle being drive");

	}

   public void speeddisplay() {
	   System.out.println("Displaying Current speed");
   }
   
   public void getdetails() {
	   System.out.println("brand Name is "+bName);
	   System.out.println("Vehicle number is "+vehicleNumber);
	   System.out.println("Price is "+price);
	   
   }
}


class Bike extends vehicleparent{
	
	public void kickstart() {
		System.out.println("called kick start");
		
	}
	public void drive() {
		   System.out.println("bike being drive");

	}
}

class car extends vehicleparent{
	
	public void startAC() {
		System.out.println("Starting AC of car");
	}
	
}