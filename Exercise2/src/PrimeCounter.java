import java.util.ArrayList;
//NOT elegant at all(probably faster than elegant one)
public class PrimeCounter {

    public static ArrayList PrimeNumbers=new ArrayList();
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<n;i++)if (isPrime(i))PrimeNumbers.add(i);
        for(int i=0;i<PrimeNumbers.size();i++)System.out.println(PrimeNumbers.get(i));
    }
    private static boolean isPrime(int argu){
        if (argu==1)return true;
        if (argu==2)return true;
        if (argu==3)return true;
        int i=2;
        for (int a=1;a<PrimeNumbers.size();a++)if (argu% ((int) PrimeNumbers.get(a))==0)return false;
        i=(int)PrimeNumbers.get(PrimeNumbers.size()-1);
        while (i<=((int)argu/2+1)){
         if (argu%i==0)return false;
         else i++;
        }
        return true;
    }
}
