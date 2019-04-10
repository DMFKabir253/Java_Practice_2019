package Java_OOP;

public abstract class Abstarct_Method {
	
	// create the private variables
	
	private String name;   // abstract private name variable
	private String address;  // abstract address variable
	
	// now create the getter and setter methods
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// now create an abstract method
	
	public abstract String getCustomerInfo();   // abstarct method
	
	
	
	
	

}
