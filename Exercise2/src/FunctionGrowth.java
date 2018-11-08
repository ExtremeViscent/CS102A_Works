import java.math.BigInteger;

public class FunctionGrowth {
    public static void main(String args[]){
        int n=2;
        while (n<=2048){
            System.out.println(Math.log(n)/Math.log(10)+"\t"+n+"\t"+n*Math.log(n)+"\t"+n*n+n*n*n+"\t"+"\t"+Math.pow(2,n));
            n*=2;
        }
    }

}
