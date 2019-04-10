package Java_OOP;

public class Box_Inheritance {
	
	//create the two variables which will be used
	
	int length;
	int width;
	
	
	// now we are going to use default constructors to carry out the tasks
	
	public Box_Inheritance(int newlength, int newWidth) {  // we set the constructor to have two parameters
		this.length= newlength;
		this.width = newWidth;
		
		
	}
	
	public void displayBoxname() {  // can be called upon from any class which extends from this class
		System.out.println("I am the Parent Box Class");
		
		
	}
	
	// Now create a class that will inherit methods from this class

}
