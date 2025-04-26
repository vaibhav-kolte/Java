
public class Application {

	public static void main(String[] args) {
		
		// Access modifier: public, protected, default( lack of access modifier), private
		
		Factory factory1 = new Factory();
		factory1.design();
		factory1.build();
		
		Car car = new Car();
		
		car.design();
		car.build();
		car.brand();

	}

}
