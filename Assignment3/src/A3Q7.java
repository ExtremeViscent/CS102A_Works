import java.util.Scanner;

public class A3Q7 {
    private static Scanner scanner;
    private static double[][] kernel;
    private static int[][] image;
    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            initKernel(scanner.nextInt());
            flipKernel();
            initImage(scanner.nextInt(),scanner.nextInt());

        }
    }
    private static void initKernel(int M){
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                kernel[i][j]=scanner.nextDouble();
            }
        }
    }
    private static void flipKernel(){
        double newKernel[][]=new double[kernel.length][kernel.length];
        for (int i = 0; i < kernel.length; i++) {
            for (int j = 0; j < kernel.length; j++) {
                newKernel[j][i]=kernel[i][j];
            }
        }
        for (int i = 0; i < kernel.length; i++) {
            System.arraycopy(newKernel[i], 0, kernel[i], 0, kernel.length);
        }
    }
    private static void initImage(int H,int W){
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                image[i][j]=scanner.nextInt();
            }
        }
    }
    private static void convolution(int l,int c){
        int[][]tmpMatrix=new int[kernel.length][kernel.length];
        int oriWidth=0,oriHeight=0;
        if (l-kernel.length/2<0)oriHeight+=l+1;
        else oriHeight+=kernel.length/2+1;
        if (l+kernel.length/2>image.length-1)oriHeight+=image.length-1-l;
        else oriHeight+=kernel.length/2;
        if (c-kernel.length/2<0)oriWidth+=c+1;
        else oriWidth+=kernel.length/2+1;
        if (c+kernel.length/2>image.length-1)oriWidth+=image.length-c-1;
        else oriWidth+=kernel.length/2;
        for (int i = 0; i < kernel.length-oriHeight; i++) {
            tmpMatrix[]
        }
    }

}
