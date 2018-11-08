import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A3Q2 {
    private static int[][] arr;
    private static Scanner  scanner;
    public static void main(String args[]){
        scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n=scanner.nextInt(),m=scanner.nextInt();
            initArray(n);
            for (int j = 0; j < m; j++) {
                int operator[]={scanner.nextInt(),scanner.nextInt()};
                if (operator[0]==0)del(operator[1]);
                else add(operator[0],operator[1]);
            }
            outArray();
        }
    }
    private static void initArray(int n){
        arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            int length=scanner.nextInt();
            arr [i]=new int[length];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
    }
    private static void outArray(){
        for (int[] outer:arr
             ) {
            for (int inner:outer
                 ) {
                System.out.print(inner+" ");
            }
            System.out.println();
        }
    }
    private static void del(int r){
        int zeroCount=0;
        for (int i = 0; i < arr[r].length; i++) {
            if (arr[r][i]==0)zeroCount++;
        }
        int[] tmp=new int[arr[r].length-zeroCount];
        int counter=0;
        for (int i = 0; i < arr[r].length; i++)
            if (arr[r][i] != 0) {
                tmp[counter] = arr[r][i];
                counter++;
            }
        arr[r]=new int[arr[r].length-zeroCount];
        if (arr[r].length >= 0) System.arraycopy(tmp, 0, arr[r], 0, arr[r].length);
    }
    private static void add(int k,int r){
        for (int i = 0; i < arr[r].length; i++) {
            arr[r][i]+=k;
        }
    }
}
