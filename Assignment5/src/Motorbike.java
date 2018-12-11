public class Motorbike extends Vehicle {
	private final int deposit;

	public void MotorbikeDescription() {		
	}

	public Motorbike(String name, double basicPrice, int deposit) {
		super(name, basicPrice);
		this.deposit = deposit;
	}

	public double getRental(int days) {
		return days/5*getBasicPrice()+deposit;
	}
	@Override
	public String toString() {
		return "Motorbike" + super.toString();
	}

}
