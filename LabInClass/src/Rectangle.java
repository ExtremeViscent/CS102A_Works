
public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double x, double y) {
		super(x,y);
	}

	public Rectangle(double x, double y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;

	}

	public void checkColor() {
		if (isInBoundary()) {
			color = ShapeColor.GREEN;
		} else {
			color = ShapeColor.RED;
		}
	}

	public boolean isInBoundary() {
		if (-1 * Shape.getScreenSize() > super.getX() - this.width / 2 || Shape.getScreenSize() < super.getX() + this.width / 2) {
			return false;
		}
		if (-1 * Shape.getScreenSize() > super.getY() - this.height / 2 || Shape.getScreenSize() < super.getY() + this.height / 2) {
			return false;
		}
		return true;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return String.format(
				"The postion of the rectangle is (%.2f, %.2f), the width is %.2f, the height is %.2f, %s, %s.\n", super.getX(), super.getY(),
				width, height, color, color.getDesc());
	}

	public void draw() {
		StdDraw.setPenColor(color.getColor());
		StdDraw.filledRectangle(super.getX(), super.getY(), this.width / 2, this.height / 2);
	}

}
