
class Appliances { // class
	String name;
	double price;

	void setMyAppliance(String name, double price/* Method parameter */) {
		this.name = name;
		this.price = price;
	}

	public void printMyAppliance() { // method
		System.out.println("My appliance name is " + name + " and price is " + price);
	}

	/* Return type */
	double getAppliancePrice() {
		return price;
	}
}

public class ReturnTypeMethodParam { // class
	public static void main(String[] args) { // method
		Appliances appliance = new Appliances(); // object
		appliance.setMyAppliance("Washing machine", 12000.5); // call function

		appliance.printMyAppliance();

		System.out.println("My appliane price is " + appliance.getAppliancePrice());
	}
}