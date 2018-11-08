public class Sqrt {
    public static double sqrt(double a){
        double EPS = 1E-15;
        double t=a;
        while (Math.abs(t-a/t)>t*EPS)t=(a/t+t)/2.0;
        return t;
    }
}
