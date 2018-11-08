import java.util.Scanner;

public class A3Q3 {
    private static Scanner scanner;
    private static int n;
    private static int arr[][];
    public static void main(String args[]){
        scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for (int i = 0; i < T; i++) {
            n=scanner.nextInt();
            initArr();
            outArr(maxLength(arr));
        }
    }
    private static void initArr(){
        int[] lengths=new int[n];
        for (int i = 0; i < n; i++) {
            lengths[i]=scanner.nextInt();
        }
        arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i]=new int[lengths[i]];
            for (int j = 0; j < lengths[i]; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
    }
    private static int maxLength(int[][] toSort){
        int max=toSort[0].length;
        for (int[] aToSort : toSort) {
            max = Math.max(max, aToSort.length);
        }
        return max;
    }
    private static void outArr(int maximum){
        for (int[] anArr : arr) {
            for (int j = 0; j < (maximum - anArr.length) / 2; j++) {
                System.out.print("  ");
            }
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.print("\n");
        }
    }
}
