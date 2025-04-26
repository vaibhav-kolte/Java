class Student {
	public String name;
	public static String studentClass;
	public static final String CLASS_NAME = "Computer Science";
	
	public void printStudnetName() {
		System.out.println("Name: " + name);
		
		// Static member is access in non static function
		System.out.println(studentClass); 
	}

	public static void classInfo() {
		System.out.println("Java");
		
		System.out.println(studentClass);
		// Non static member not access static function
//		System.out.println(name); 
	}
}

public class StaticFinal {
	public static void main(String[] args) {

		Student.studentClass = "Java fundamentals.";
		System.out.println(Student.studentClass);

		Student.classInfo();

		Student student1 = new Student();
		Student student2 = new Student();

		student1.name = "Vaibhav";
		student2.name = "Pankaj";

		student1.printStudnetName();
		student2.printStudnetName();
		
		System.out.println(Student.CLASS_NAME);
		
		// Below line getting error cannot change final variable
//		Student.CLASS_NAME = "Physics";
	}
}
