package OverLoading;

public class Overloading1 {
	
	//we will create the three separate methods, to demonstrate overloading
	
	// Addition of two integers
	// when we call this method it overloads the below two methods
	
	public int add(int x, int y) {
		return x+y;
		
	}
	
	// Addition of three integers
	// when we call this method, it overeloads the top and bottom methods
	
	public int add(int x, int y , int z) {
		return x+y+z;
	}
	
	// Addition of two double
	// when we call this method, it overloads the uppper two
	
	public double add(double x, double y) {
		return x+y;
		
	}

	public static void main(String args[]) {
		Overloading1 a1 = new Overloading1();
	
	
	
	System.out.println("This is the addition of two integers : " + a1.add(24,52));
	System.out.println("\n");
	System.out.println("This is the addition of three integers : "+ a1.add(24, 52, 96));
	System.out.println("\n");
	System.out.println("This si the addition of two doubles : " +a1.add(24, 52));
	
	
}
}
