package Java_OOP;

public class SmallBox_Inheritance extends Box_Inheritance {
	
	// create a new variable
	
	double area;
	
	// This is the constructor that we set in the parent box class
	
	public SmallBox_Inheritance(int newlength, int newWidth) {
		super(newlength, newWidth); // this is the auto generated super constructor
		
	}
	
	//now we create a method to print the area
	public double printArea() {
		area = length * width;
		return area;
		
	}
	
	// Now create a method to display the name of the small box
	
		public void displayName1() {
			System.out.println("The name of the box is : Small Box");
		}
	
	//Now we create a native method to display the price
	
	public void displayprice(double price) {
		System.out.println("The price of the box is : " + price);
		
		
		
		// Now we create another class Big Box which will also inherit from the master/super class
	}
	
	

}
