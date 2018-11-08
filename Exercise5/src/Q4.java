import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    private static int[][] matrix;
    private static int[] maxPos;
    private static int rows;
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix:");
        rows=scanner.nextInt();
        matrix=new int[rows][rows];
        maxPos=new int[3];
        System.out.println("Enter the matrix by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[j][i]=scanner.nextInt();
            }
        }
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < rows; x++) {
                if (matrix[x][y]==1)findMatrix(x,y);
            }
        }
        System.out.print("The maximum square submatrix is at ("+maxPos[0]+","+maxPos[1]+") with size "+maxPos[2]);
    }
    private static void findMatrix(int x, int y){
        int width=0;
        for (int i = 0; i < rows-x; i++) {
            if (matrix[x+i][y]==0)break;
            width++;
        }
        for (int i = 0; i < Math.min(width,rows-y); i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[x+j][y+i]==0){
                    if (maxPos[2]<Math.min(i,j))maxPos= new int[]{x, y, Math.min(i, j)};
                    return;
                }
            }
        }
        if (maxPos[2]<Math.min(width,rows-y))maxPos=new int[]{x,y,Math.min(width,rows-y)};
    }
}
