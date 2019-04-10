package Java_OOP;

public class Polymorphism_SUV extends Polymorphism1 {

	public Polymorphism_SUV(String Nmake, String Nmodel, int Nyear) {
		super(Nmake, Nmodel, Nyear);

	}

	// now we add the polymorphism code
	// Naturally we would just call the start() and stop() methods
	// but we want to change what those methods would say
	// just like in pokemon, or when we talk about butterflies
	// insects polymorph to a next phase, or different structure
	// same way we are polymorphing the methods already declared in the parent class

	void start() {
		System.out.println(String.format("Starting the SUV , Make = %s ,Model = %s , Year = %d", getMake(), getModel(),
				getYear()));
	}
	
	void stop() {
		System.out.println(String.format("Stoping the SUV , Make = %s ,Model = %s , Year = %d", getMake(), getModel(),
				getYear()));
	}

}
