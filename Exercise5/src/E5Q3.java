import java.util.Scanner;

public class E5Q3 {
    public static void main(String args[]){
        System.out.print("Enter a00,a01,a10,a11,b0,b1:");
        Scanner scanner=new Scanner(System.in);
        double[][]a=new double[2][2];
        double[] b=new double[2];
        a[0][0]=scanner.nextDouble();a[0][1]=scanner.nextDouble();
        a[1][0]=scanner.nextDouble();a[1][1]=scanner.nextDouble();
        b[0]=scanner.nextDouble();b[1]=scanner.nextDouble();

        double[] res=linearEquation(a,b);
        if (res==null)System.out.print("The equation has no solution");
        else System.out.print("x is "+res[0]+" and y is "+res[1]);
    }
    public static double[] linearEquation(double[][] a,double[] b){
        if(a[0][0]*a[1][1]==a[0][1]*a[1][0])return null;
        return new double[]{(b[0]*a[1][1]-b[1]*a[0][1])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]),(b[1]*a[0][0]-b[0]*a[1][0])/(a[0][0]*a[1][1]-a[0][1]*a[1][0])};
    }
}
