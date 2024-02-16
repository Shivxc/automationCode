package Day2;

public class employee {
	
	private int basicsal = 10000;
	public String name;
	
	public void getdetails() {
        System.out.println("Basic Sal is "+basicsal);
        System.out.println("Name is "+name);
        
	}
	public void setSal(int newsal)
	{
		if (newsal > basicsal) {  //applied some rule
			basicsal=newsal;
			System.out.println("salary updsated");
		}
	}
}

