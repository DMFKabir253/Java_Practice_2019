package Java_Practice_02_Instance_Methods;

public class Vehicle {
	
	// This is an example and practice for Constructor Methods
	
	String make;
	String model;
	int year;
	
	
	// Now we will creat the constructor Method
	// Now we want to force the user, that whenever they want to create an object for the vehicle class, 
	// they need to pass the three parameters
	
	public Vehicle(String vehiclemake, String vehiclemodel, int vehicleyear) {
		this.make=vehiclemake;
		this.model=vehiclemodel;
		this.year=vehicleyear;
		// so here, just to clarify, the white make, model, year is equal to the parameter of them
		
		// if we do vehicle.make , it wont work, b ut we can also do make=make, but will be confusing
		
		}
	
	// now we will create an instance method 
	public void start() {
		System.out.println("The vehicle is starting");
		
		// now look for the vehicleConstructormethod class where we will call these methods
		
}

}
