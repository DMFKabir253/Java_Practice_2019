package Java_OOP;

public class Polymorphism_Final {
	public static void main(String args[]) {
		
	
	
	// Create SUV object
	
	Polymorphism_SUV JeepWrangler = new Polymorphism_SUV("Jeep","Wrangler",2017);
	
	JeepWrangler.start();
	System.out.println("\n");
	JeepWrangler.stop();
	
	System.out.println("\n"+"------------------------------------------------"+"\n");
	
	Polymorphism_Semi ToyotaHighlander = new Polymorphism_Semi("Toyota","HighLander",2011);
	
	ToyotaHighlander.start();
	System.out.println("\n");
	ToyotaHighlander.stop();
	
	System.out.println("\n"+"------------------------------------------------"+"\n");
	
	Polymorphism_Motorbike YuzukuZ100 = new Polymorphism_Motorbike("Yuzuku","Z100",2015);
	
	YuzukuZ100.start();
	System.out.println("\n");
	YuzukuZ100.stop();
	
	System.out.println("\n"+"------------------------------------------------"+"\n");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
