import java.util.Scanner;

public class ODV2 {
    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N=scanner.nextInt();
            int[] A=new int[N];
            for (int j = 0; j < N; j++) {
                A[j]=scanner.nextInt();
            }
            long summax=A[0];
            for (int j = 0; j < N; j++) {
                for (int k = 0;k <N-j;k++) {
                    long sumnow=0;
                    for (int l = 0; l < N-j-k; l++) {
                        sumnow+=A[k+l];
                        summax=Math.max(sumnow,summax);
                    }
                }
            }
            System.out.println(summax);
        }
    }
    public static int[] qsort(int[] arg) {
        int[] ret = new int[arg.length];
        for (int i = 0; i < arg.length; i++) {
            int index = 0;
            for (int j = 0; j < arg.length; j++) {
                if (arg[i] > arg[j]) index++;
                if (arg[i] == arg[j] && i > j) index++;
            }
            ret[index] = arg[i];
        }
        return ret;
    }
}
