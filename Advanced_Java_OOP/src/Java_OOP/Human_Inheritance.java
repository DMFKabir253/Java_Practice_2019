package Java_OOP;

public class Human_Inheritance extends Person_Inheritance{
	
	//---------------------------------------------------------------
	// THE KEY WORD IS : EXTENDS
	//---------------------------------------------------------------
	
	// now we create another class and method which will EXTEND and INHERIT methods and properties from the person

	
		public String getSSN(String ssn) {
			return ssn;
			
			}
		
		public static void main(String args[]) {
			// create object for the human class, so it can call the methods
			
			Human_Inheritance human1 = new Human_Inheritance();
			human1.setName("joshua");
			human1.setAge(26);
			System.out.println("The name of the person is : "+ human1.getName());
			System.out.println("The age of the person is : " + human1.getAge());
			System.out.println("The social identifier of the person is : " + human1.getSSN("012-8853-225"));
		}
		
		// so we have successfully inherited the getter and setter methods from the person class, and used them
		// here, proving that the child human class inherited those methods
		// and we also created our own get ssn method, which cannot be used in the parent person class
		// the key word is EXTENDS
	}



