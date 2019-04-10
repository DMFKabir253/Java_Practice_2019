package Java_OOP;

public class EncapsulationMethod {
	public static void main(String args[]) {

		// create an object to call the encapsulation class

		Encapsulation customer1 = new Encapsulation();
		customer1.setName("Joshua");
		customer1.setIdNum("245225325");
		customer1.setAge(25);

		// now we need to print what we set

		//System.out.println("The customer name is : " + customer1.getName());
		//System.out.println("The customer id number is : " + customer1.getIdNum());
		//System.out.println("The age of the customer is : " + customer1.getAge());

		// or you can use string format to make it in all one line

		System.out.println(String.format("The person with name : %s age %d and id Number %s , has entered the store",
				customer1.getName(), customer1.getAge(), customer1.getIdNum()));
		
		// if we want to print put the variables separately , its going to throw an error, because
		// the variables are private

	}

}
