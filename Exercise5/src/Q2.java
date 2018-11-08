import java.util.Scanner;

public class Q2 {
    private static int[] A;
    private static int n;
    public static void main(String args[]){
        n=10;
        A=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            A[i]=scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            int counter=0;
            for (int j = 0; j < n; j++) {
                if (A[j]==i)counter+=1;
                if (counter>1){D(j);counter--;}
            }
        }
        System.out.print("The distinct numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
    }
    private static void D(int x){
        n--;
        int A_[]=new int[n];
        for (int i = 0; i < x; i++) {
            A_[i]=A[i];
        }
        for (int i = 0; i < n-x; i++) {
            A_[x+i]=A[x+i+1];
        }
        arrayUpdate(A_);
    }
    private static void arrayUpdate(int[] A_){
        A=new int[n];
        System.arraycopy(A_, 0, A, 0, n);
        // System.out.println(Arrays.toString(A));
    }

}
