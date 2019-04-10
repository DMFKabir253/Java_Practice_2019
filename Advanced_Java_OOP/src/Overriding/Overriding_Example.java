package Overriding;

public class Overriding_Example {
public static void main(String args[]) {
	
	// now create objects for all required classes to call upon the required methods
	
	Animal animal1 = new Animal();
	Animal animal2 =new Dog();
	
	// now call out the methods relating to the objects
	
	// notice the we are using the same method, or you can say calling the same method
	// but the results will be different , because in the dog class the method was overriden
	// to do/ carry out a different action
	
	animal1.talk();            // runs talk() from animal class
	animal2.talk();            // runs talk() from dog class
	
	
	
}
}
