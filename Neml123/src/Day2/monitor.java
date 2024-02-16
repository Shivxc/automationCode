package Day2;

public class monitor {  //class is know as blueprint of the project
	static String brand;
	String colour;
	int price;

	//how methods are defined
	/*access-modifier return type methodname(parameter 1 and 2 )
	{
		body/implementation part
	}*/
		public void display()  //method declaration
		
		{//method implementation 
			System.out.println("Monitor Displaying");
		}
		
		public void getDetails()
		{
		    System.out.println("Brand name is "+brand);
			System.out.println("Colour is "+colour);
			System.out.println("Price is "+price);
			
		}
		

	}



