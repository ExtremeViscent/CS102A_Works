
public class Circle extends Shape {
	private double radius;
	static final int DEFAULT_RADIUS = 5;

	public Circle(double radius, double x, double y) {
		super(x,y);
		this.radius = radius;
	}

	public Circle(double radius) {
		super(0,0);
		this.radius=radius;
	}

	public Circle(double x, double y) {
		super(x,y);
		this.radius = DEFAULT_RADIUS;
	}

	public static int getScreenSize() {
		return Shape.getScreenSize();
	}

	public static void setScreenSize(int screenSize) {
		Shape.setScreenSize(screenSize);
	}

	public void checkColor() {
		if(isInBoundary()) {
			color=ShapeColor.GREEN;
		}else {
			color=ShapeColor.RED;
		}
	}
	public boolean isInBoundary() {
		if (-1 * Shape.getScreenSize() > super.getX() - this.radius || Shape.getScreenSize() < super.getX() + this.radius) {
			return false;
		}
		return !(-1 * Shape.getScreenSize() > super.getY() - this.radius) && !(Shape.getScreenSize() < super.getY() + this.radius);
	}

	@Override
	public String toString() {
		return String.format("The postion of the circle is (%.2f, %.2f), the radius is %.2f, %s, %s.\n"
		        , super.getX(), super.getY(), radius, color, color.getDesc());		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void draw() {
//		StdDraw.setXscale(-screenSize, screenSize);
//		StdDraw.setYscale(-screenSize, screenSize);

		StdDraw.setPenColor(color.getColor());
		StdDraw.filledCircle(super.getX(), super.getY(), radius);
		
	}	
}
