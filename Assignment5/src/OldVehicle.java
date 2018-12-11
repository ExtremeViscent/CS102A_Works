public class OldVehicle extends Vehicle implements Insurance {


	public OldVehicle(String name, double basicPrice) {
		super(name, basicPrice);
	}

	public double getRental(int days) {

		return days < 3 ? getBasicPrice() : getBasicPrice() + (days - 3) * getBasicPrice() * 0.2;
	}
	@Override
	public String toString() {
		return "Old" + super.toString()+"\n";
	}

	@Override
	public void InsuanceDescription() {
		System.out.println("Purchased insurance");
	}

}
