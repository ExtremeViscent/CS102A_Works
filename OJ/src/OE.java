import java.util.Scanner;

public class OE {
    private static int[] A;
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    private static int n;
    public static void main(String args[]){
        int T=scanner.nextInt();
        for (int i = 0; i < T; i++) {
            n=scanner.nextInt();
            initArr();
            int q=scanner.nextInt();
            for (int j = 0; j < q; j++) {
                String operator=scanner.next();
                int a,b,c,d,e;
                switch (operator){
                    case "I":a=scanner.nextInt();b=scanner.nextInt();I(a,b);break;
                    case "D":c=scanner.nextInt();D(c);break;
                    case "S":d=scanner.nextInt();e=scanner.nextInt();S(d,e);break;
                }
            }
        }
    }
    private static void initArr(){
        A=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=scanner.nextInt();
        }
    }
    private static void I(int i, int x){
        n++;
        int[] A_=new int[n];
        if (i >= 0) System.arraycopy(A, 0, A_, 0, i);
        A_[i]=x;
        for (int j = 0; j < n-i-1; j++) {
            A_[i+j+1]=A[i+j];
        }
        arrayUpdate(A_);
    }
    private static void arrayUpdate(int[] A_){
        A=new int[n];
        System.arraycopy(A_, 0, A, 0, n);
       // System.out.println(Arrays.toString(A));
    }
    private static void D(int x){
        n--;
        int[] A_=new int[n];
        int counter=0;
        for (int a:A) {
            if (a==x)break;
            counter++;
        }
        if (counter >= 0) System.arraycopy(A, 0, A_, 0, counter);
        for (int i = 0; i < n-counter; i++) A_[counter + i] = A[counter + i + 1];
        arrayUpdate(A_);
    }
    private static void S(int i, int j){
        int sum=0;
        for (int k = 0; k < j-i+1; k++) {
            sum+=A[i+k];
        }
        System.out.println(sum);
    }
}
