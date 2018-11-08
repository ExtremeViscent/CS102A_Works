import java.util.Scanner;

/**
 *
 */
public class A3Q1 {
    private static int m,n;
    private static Scanner scanner;
    private static int[][] matrix;
    public static void main(String args[]){
        scanner = new Scanner(System.in);
        int T=scanner.nextInt();
        loop:for (int i = 0; i < T; i++) {
            n=scanner.nextInt();
            m=scanner.nextInt();
            initArr();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (isSame(k,j)){System.out.println(true);continue loop;}
                }
            }
            System.out.println(false);
        }
    }
    private static boolean isSame(int x,int y){
        if (x==m-1&&y!=n-1)return matrix[x][y]==matrix[x][y+1];
        if (x!=m-1&&y==n-1)return matrix[x][y]==matrix[x+1][y];
        if (x==m-1&&y==n-1)return false;
        return matrix[x][y]==matrix[x][y+1]||matrix[x+1][y+1]==matrix[x][y]||matrix[x+1][y]==matrix[x][y];
    }
    private static void initArr(){
        matrix=new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][i]=scanner.nextInt();
            }
        }
    }
}
