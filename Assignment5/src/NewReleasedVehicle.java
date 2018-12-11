public class NewReleasedVehicle extends Vehicle implements Insurance {
    private final Energy energy;


    public NewReleasedVehicle(String name, double basicPrice, boolean chargeable, boolean oiling) {
        super(name, basicPrice);
        if (chargeable && oiling)
            energy = Energy.HYBRID;
        else if (chargeable && !oiling)
            energy = Energy.ELECTRIC;
        else
            energy = Energy.GAS;
    }

    public double getRental(int days) {

        return days < 4 ? getBasicPrice() : getBasicPrice() + (days - 4) * getBasicPrice() * 0.3;
    }

    @Override
    public String toString() {
        return "New Vehicle [" + getName() + ", " + getBasicPrice() + "]" + energy.getDesc() + "\n";
    }

    @Override
    public void InsuanceDescription() {
        System.out.println("Purchased high-value insurance");
    }

}


