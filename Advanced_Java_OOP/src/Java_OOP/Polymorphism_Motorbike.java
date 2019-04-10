package Java_OOP;

public class Polymorphism_Motorbike extends Polymorphism1 {

	public Polymorphism_Motorbike(String Nmake, String Nmodel, int Nyear) {
		super(Nmake, Nmodel, Nyear);
		
	}
	
	void start() {
		System.out.println(String.format("Starting the Motorbike , Make = %s ,Model = %s , Year = %d", getMake(), getModel(),
				getYear()));
	}
	
	void stop() {
		System.out.println(String.format("Stoping the Motorbike , Make = %s ,Model = %s , Year = %d", getMake(), getModel(),
				getYear()));
	}

}
