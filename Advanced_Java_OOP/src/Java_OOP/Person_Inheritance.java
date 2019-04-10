package Java_OOP;

public class Person_Inheritance {
	
	// create static variables, which are also public and can be accessed by other classes
	
	String name;
	int age;
	
	// Now create getter and setter methods for those two varibales
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

// now we create another class and method which will EXTEND and INHERIT methods and properties from the person



