package Java_Practice_02_Instance_Methods;

/**
 * @author DKabir
 *
 */
class Programming {
	// constructor method
	 Programming() {
		System.out.println("Constructor method called.");
	}

	
	// Constructor Method with parameter
	public Programming(String param) {
		System.out.println("This is a parameterized Constructor Method");

	}

	// Instance Method
	public void InstanceMethod() {
		System.out.println("This is an instance Method");
	}
	
	public static void main(String[] args) {
		Programming object = new Programming(); // Creating an object with a default constructor
		object.InstanceMethod();  // Now calling the instance method
		
		// So when we run the Java application, it called the first constructor instead of the 
		// second one(With Parameters) because we called the one without any parameters
		
		// so now lets create another object which will be associated with the constructor with
		// a parameter
		
		System.out.println("--------------------------------------------------");
		
		Programming object2 = new Programming("Constructor with parameters");
		object2.InstanceMethod();
		

	}
}


