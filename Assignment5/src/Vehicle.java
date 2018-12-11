abstract class Vehicle {
	private String name;
	private double basisPrice;

	Vehicle(String name, double basicPrice) {
		this.name = name;
		this.basisPrice = basicPrice;
	}

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double getBasicPrice() {
		return basisPrice;
	}

	public void setBasicPrice() {
	}

	public abstract double getRental(int days);

	@Override
	public String toString() {
		return "Vehicle [" + name + ", " + basisPrice + "]";
	}

}
