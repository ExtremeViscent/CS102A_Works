import java.util.ArrayList;
import java.util.Scanner;

public class QD {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int A[] = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextInt();
            }
            ArrayList list = new ArrayList();
            int sumIndex = 0;
            int[] sum = new int[N * N];
            int na = 0;
            for (int j = 0; j < N; j++) {
                sumIndex++;
                if (A[j] < 0) {
                    na++;
                    continue;
                }
                for (int k = 0; k < N - j; k++) {
                    if (A[j + k] < 0) {
                        if (j + k != N - 1 && A[j + k + 1] > 0) sumIndex += 1;
                        continue;
                    }
                    if (A[j + k] >= 0) sum[sumIndex] += A[j + k];
                }
            }
            if (na == N) {
                System.out.println(qsort(A)[A.length - 1]);
                continue;
            }
            int toSort[] = new int[sumIndex + 1];
            for (int j = 0; j < sumIndex + 1; j++) {
                toSort[j] = sum[j];
            }
            System.out.println(qsort(toSort)[sumIndex]);
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
