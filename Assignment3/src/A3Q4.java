import java.math.BigInteger;
import java.util.Scanner;

public class A3Q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long T= scanner.nextLong();
        for (long i = 0; i < T; i++) {
            outRow(scanner.nextLong());
        }
    }
    private static void outRow(long n){
        for (long i = 0; i < n; i++) {
            System.out.print(getNum(n-1,i)+" ");
        }
        System.out.println();
    }
    private static BigInteger getNum(long a, long b){
        if (b==0||b==a)return BigInteger.valueOf(1);
        BigInteger ch=new BigInteger(String.valueOf(a));
        BigInteger mt;
        long aa=a;
        long c=a-b-1;
        for (long i = 0; i < c; i++) ch=ch.multiply(BigInteger.valueOf(--aa));
        mt=new BigInteger(String.valueOf(a-b));
        var dd= a-b;
        for (long i = 0; i < c; i++) mt=mt.multiply(BigInteger.valueOf(--dd));
        return ch.divide(mt);
    }
}
