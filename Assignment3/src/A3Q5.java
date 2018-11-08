import java.util.Scanner;

public class A3Q5 {
    private static Scanner scanner;
    private static int[][] matrix;
    private static boolean flag;

    public static void main(String args[]){
        scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            initMatrix();
            flag=true;
            checkRow();
            checkColumn();
            checkSquare();
            System.out.println(flag?"YES":"NO");
        }
    }
    private static void initMatrix(){
        matrix=new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
    }
    private static void checkRow(){
        for (int i = 0; i < 9; i++) {
            int counter=0;
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (matrix[i][k]==j+1)counter++;
                }
                if (counter!=1){
                    flag=false;return;}
                else counter=0;
            }
        }
    }
    private static void checkColumn(){
        for (int i = 0; i < 9; i++) {
            int counter=0;
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (matrix[k][i]==j+1)counter++;
                }
                if (counter!=1){
                    flag=false;return;}
                else counter=0;
            }
        }
    }
    private static void checkSquare(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 9; k++) {
                    int counter=0;
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            if (matrix[3*i+l][3*j+m]==j+1)counter++;
                        }
                    }
                    if (counter!=1){
                        flag=false;
                        return;
                    }
                }
            }
        }
    }
}
