
class MyClass { // class

	public void run() { // method
		System.out.println("I'm running");
	}
}

public class ClassMethodObject { // class
	public static void main(String[] args) { // method
		MyClass myClass = new MyClass(); // object
		myClass.run(); // call function
	}
}
