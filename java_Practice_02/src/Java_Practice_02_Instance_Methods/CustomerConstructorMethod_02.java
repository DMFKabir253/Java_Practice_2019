package Java_Practice_02_Instance_Methods;

public class CustomerConstructorMethod_02 {
	public static void main(String args[]) {
		// Calling constructor method from the Constructor_Customer class
		Constructor_Customer customer1 = new Constructor_Customer();
		// Calling the instance method from the Constructor_Customer class
		customer1.getName("Joshua");
		
		// ---------------------------------------------------------------
		// MAKE SURE WHEN YOU ARE DOING CONSTRUCTORS, THE CLASS NAME AND CONSTRUCTOR NAME
		// SHOULD BE SAME , OTHER WISE THE CODE WILL NOT WORK
		// -------------------------------------------------------------
		
		// In the above example we were calling the metods from another class.
	}

}
