public class Food {
    private String name,type;
    private int size;
    private double price;

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
    public void showInformation(){
        System.out.printf(type+" "+name+": ("+size+" Inches) %.2f $\n",price);
    }
}
