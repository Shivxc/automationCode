package Day2;

public class overloading {

		public void add(int a, int b ) {
			System.out.println("addition of two int is "+(a+b));

		}
		
		public void add(int a, int b, int c ) {
			System.out.println("addition of two int is "+(a+b+c));
			
		}
	
		public void add(double a, double b ) {
			System.out.println("addition of two double is "+(a+b));
		}
		public void add(int a, double b ) {
			System.out.println("addition of two mix num is "+(a+b));
		}
		public void add(String a, String b ) {
			System.out.println(a+b);
			
		}
		public static void main(String[] args) {
			
			overloading ov=new overloading();
			ov.add(5.2, 6.8);
			ov.add(5.1, 6.5);
			ov.add(3, 5);
			ov.add(2, 6, 7);
			ov.add("shiv","das");


}

}
