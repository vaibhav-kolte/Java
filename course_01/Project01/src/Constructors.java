class Program{
	int value;
	
	public Program() {
		this(4);
		System.out.println("First constructor.");
		value = 10;
	}
	
	public Program(int value) {
		System.out.println("Second constructor.");
		this.value = value;
	}
}

public class Constructors {

	public static void main(String[] args) {

		Program firstProgram = new Program();
		
		Program secondProgram = new Program(20);
	}

}
