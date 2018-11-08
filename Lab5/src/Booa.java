import java.util.Scanner;

public class Booa {
    public static void main(String args[]){
        int sum[]=new int[11];
        for (int i = 0; i < 36000000; i++) {
            sum[(int)(Math.random()*6+1)+(int)(Math.random()*6+1)-2]++;
        }
        for (int i = 0; i < 11; i++) {
            System.out.println((i+2)+":"+sum[i]);
        }
    }
}
