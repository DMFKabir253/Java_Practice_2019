package Java_OOP;

public class Polymorphism_Semi extends Polymorphism1 {

	public Polymorphism_Semi(String Nmake, String Nmodel, int Nyear) {
		super(Nmake, Nmodel, Nyear);
		
	}
	
	void start() {
		System.out.println(String.format("Starting the Semi , Make = %s ,Model = %s , Year = %d", getMake(), getModel(),
				getYear()));
	}
	
	void stop() {
		System.out.println(String.format("Stoping the Semi , Make = %s ,Model = %s , Year = %d", getMake(), getModel(),
				getYear()));
	}
	

}
