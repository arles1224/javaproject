package selfStudy;

public class ClassesObjects{
	int x = 5;
	/*
	 * [Java Class Attribute]
	 * Class attributes are variables within a class.
	 * "Variable" x is actually an attribute of "ClassesObjects" class.
	 * Attributes can be accessed and modified or overrode existing value by creating an object of class, and using the dot syntax(.).
	 */
	public static void main(String[] args) {
		//To create an object, specify the class name, followed by the object name, and use the keyword new.
		ClassesObjects myObj1 = new ClassesObjects();
		Second myObj2 = new Second();
		System.out.println(myObj1.x);
		System.out.println(myObj2.a);
		myObj1.x = 30; //Override the value form 5 to 30.
		System.out.println(myObj1.x);
	}
}
