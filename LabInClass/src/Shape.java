public class Shape {
    private double x;
    private double y;
    ShapeColor color=ShapeColor.GRAY;
    private static int screenSize=10;

    public Shape(double x, double y,ShapeColor color,int screenSize) {
        this.x=x;this.y=y;this.color=color;
        Shape.screenSize =screenSize;
    }
    public Shape(){

    }
    public Shape(double x,double y){
        this.x=x;this.y=y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return this.toString();
    }

    public static int getScreenSize() {
        return screenSize;
    }

    public ShapeColor getColor() {
        return color;
    }

    public static void setScreenSize(int screenSize) {
        Shape.screenSize = screenSize;
    }
}
