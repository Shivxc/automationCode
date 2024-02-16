package Day1;

public class array {

	public static void main(String[] args) {
		// String name[]= {"prem","shweta","poonam","saurabh","shivdas"};
		// System.out.println(name[4]);
		// System.out.println(name.length);
		// for(int i=0; i<name.length; i++)
		// System.out.println(name[i]);
		// }

		String name[] = new String[6];
		name[0] = "prem";
		name[1] = "shivdas";
		name[2] = "saurabh";
		name[3] = "prajwal";
		name[4] = "tejas";
		name[5] = "utkarsh";
		System.out.println(name[2]);
		System.out.println(name.length);
		for (int i = 0; i < name.length; i++)
			System.out.println(name[i]);
	}
}