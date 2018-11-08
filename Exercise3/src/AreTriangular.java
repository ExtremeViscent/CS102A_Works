public class AreTriangular {
    public static boolean areTriangular(double a, double b, double c){
        return (Math.abs(a-b)<c&&Math.abs(b-c)<a&&Math.abs(a-c)<b&&((a+b)>c)&&((a+c)>b)&&((b+c)>a));
    }
}
