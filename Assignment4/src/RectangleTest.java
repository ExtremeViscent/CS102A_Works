import java.util.ArrayList;
import java.util.Scanner;

public class RectangleTest {
    private static Scanner scanner;
    public static void main(String[] args){
        scanner=new Scanner(System.in);
        ArrayList<Rectangle> rectangles=new ArrayList<Rectangle>();
        String lineNow=scanner.nextLine();
        while (!lineNow.equals("")){
            switch (lineNow.split(",").length){
                case 2:rectangles.add(new Rectangle(Double.parseDouble(lineNow.split(",")[0]),Double.parseDouble(lineNow.split(",")[1])));break;
                case 4:rectangles.add(new Rectangle(Double.parseDouble(lineNow.split(",")[0]),Double.parseDouble(lineNow.split(",")[1]),Double.parseDouble(lineNow.split(",")[2]),Double.parseDouble(lineNow.split(",")[3])));break;
                case 7:rectangles.add(new Rectangle(Double.parseDouble(lineNow.split(",")[0]),Double.parseDouble(lineNow.split(",")[1]),Double.parseDouble(lineNow.split(",")[2]),Double.parseDouble(lineNow.split(",")[3]),Integer.parseInt(lineNow.split(",")[4]),Integer.parseInt(lineNow.split(",")[5]),Integer.parseInt(lineNow.split(",")[6])));            rectangles.add(new Rectangle(Double.parseDouble(lineNow.split(",")[0]),Double.parseDouble(lineNow.split(",")[1]),Double.parseDouble(lineNow.split(",")[2]),Double.parseDouble(lineNow.split(",")[3]),Integer.parseInt(lineNow.split(",")[4]),Integer.parseInt(lineNow.split(",")[5]),Integer.parseInt(lineNow.split(",")[6])));break;
            }
            lineNow=scanner.nextLine();
        }
        StdDraw.setXscale(-10,10);
        StdDraw.setYscale(-10,10);
        Rectangle firstValid=new Rectangle(0,0);
        for (Rectangle rectangle:rectangles){
            if (rectangle.isValid())firstValid=rectangle;
        }
        for (Rectangle rectangle:rectangles) {
            if (rectangle.isValid() && rectangle == firstValid || !rectangle.intersect(firstValid)) {
                System.out.println(rectangle);
                //rectangle.draw();
            }
        }
    }
}
