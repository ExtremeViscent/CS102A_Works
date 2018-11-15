import java.awt.*;

public class Rectangle {
    private double x,y,width,height;
    private Color color;


    public Rectangle(double x, double y,double width,double height,int R,int G,int B){
        this.x=x;this.y=y;
        this.width=width;this.height=height;
        if (R<0)R=0;if (G<0)G=0;if (B<0)B=0;
        if (R>255)R=255;if (G>255)G=255;if (B>255)B=255;
        color= new Color(R,G,B);
    }
    public Rectangle(double x,double y){
        this(x,y,1,1,100,100,100);}
    public Rectangle(double x,double y,double width,double height){
        this(x,y,width,height,100,100,100); }

    public Color getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) { }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Centre["+x+","+y+"]Shape["+width+","+height+"]Color["+color.getRed()+","+color.getGreen()+","+color.getBlue()+"]";
    }
    public static boolean intersect(Rectangle a,Rectangle b){
        return (2*Math.abs(a.getY()-b.getY())<(a.getHeight()+b.getHeight())&&2*Math.abs(a.getX()-b.getX())<(a.getWidth()+b.getWidth()));
    }
    public boolean intersect(Rectangle a){
        return intersect(a,this);
    }
}
