package Java_OOP;

public class BigBox_Inheritance extends Box_Inheritance {

	 int height;
	double area;
	

	public BigBox_Inheritance(int newlength, int newWidth, int Nheight) {
		super(newlength, newWidth);
		this.length = newlength;
		this.width=newWidth;
		this.height=Nheight;
		
	}

	
	
	// create a method to print the area of the big box
	
	public double printArea2() {
		 area=length*width*height;
		 return area;
		 
		
	}
	
	// now create a method to display the price
	public void displayPrice(double price) {
	
	System.out.println("The price of the big box is : " + price);
	
	
	
}
	
	// Now create a method to display the name of the big box
	
	public void displayName2() {
		System.out.println("The name of the box is : Big Box");
	}
	
	// Now we are going to create a class to create objects to call the methods from all these classes
	
}
