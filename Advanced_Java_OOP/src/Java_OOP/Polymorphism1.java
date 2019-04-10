package Java_OOP;

public class Polymorphism1 {
	
	// so we will create an inheritance hierarchy 
	// we will have a main class with the constructors and methods
	// then subsequent classes which will extend from this class
	
	// first we create te variables
	
	private String make;
    private String model;
    private int year;
    
    // now we create the constructor method which will ask for these variables
    // whenever we call the method
    
    public Polymorphism1(String Nmake, String Nmodel, int Nyear) {
    	this.make=Nmake;
    	this.model=Nmodel;
    	this.year=Nyear;
    	
    	// Now we set the getter and setter methods
    	
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
    // Now we create a start() and stop() methods for all the child classes
	
	void start() {
		System.out.println(" The car is starting");
	}
      
	
	void stop() {
		System.out.println(" The car sis stopping");
	}
    

}
