package Java_OOP;

public class Inheritance_Example {
	
	// here we are going to connect to all the other inheritance classes
	// we will call their methods
	// and also finalize the script
	
	public static void main(String args[]) {
		
		System.out.println("\n"+" ------------------------------------------------------------" + "\n");
		
		//Call the box class
		Box_Inheritance box1 = new Box_Inheritance(24,52);
		box1.displayBoxname();
		
		System.out.println("\n"+" ------------------------------------------------------------" + "\n");
	
	
	// Call Small Box
	
	SmallBox_Inheritance smallbox1 = new SmallBox_Inheritance(52,25);
	  smallbox1.displayName1();
	  System.out.println("The area of this box is : " + smallbox1.printArea());
	  smallbox1.displayprice(32.52);
	  
	  System.out.println("\n"+" ------------------------------------------------------------" + "\n");
	  
	  
	  
	  // Call Big Box
	  
	  BigBox_Inheritance BigBox1 = new BigBox_Inheritance(25,32,54);
	  BigBox1.displayName2();
	  System.out.println("The area of the box is : " + BigBox1.printArea2());
	  BigBox1.displayPrice(85.63);
	  
	  System.out.println("\n"+" ------------------------------------------------------------" + "\n");
	
	}
}
