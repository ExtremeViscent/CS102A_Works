import java.util.Scanner;

public class A3Q7 {
    private static double[][]tmpMatrix;
    private static boolean[][]defineStat;
    private static Scanner scanner;
    private static double[][] kernel;
    private static int[][] image;
    private static int[][] newImage;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            initKernel(scanner.nextInt());
            initImage(scanner.nextInt(),scanner.nextInt());
            newImage=new int[image.length][image[0].length];
            for (int j = 0; j < image.length; j++) {
                for (int k = 0; k < image[0].length; k++) {
                    convolution(j,k);
                }
            }
            outImage();
        }
    }
    private static void initKernel(int M){
        kernel=new double[M][M];
        for (int i = M-1; i >=0; i--) {
            for (int j = M-1; j >=0; j--) {
                kernel[i][j]=scanner.nextDouble();
            }
        }
    }
    private static void initImage(int H,int W){
        image=new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                image[i][j]=scanner.nextInt();
            }
        }
    }
    private static void convolution(int l,int c){
        if (l+kernel.length/2>image.length-1) {
        }
        tmpMatrix=new double[kernel.length][kernel.length];
        defineStat=new boolean[kernel.length][kernel.length];
        initTemp(l,c);
        for (int i = 0; i < kernel.length*kernel.length; i++) {
            for (int j = 0; j < kernel.length; j++) {
                for (int k = 0; k < kernel.length; k++) {
                    checkStat(j,k);
                }
            }
        }
        newImage[l][c]=mutSum();
    }
    private static int mutSum() {
        double sum=0;
        for (int i = 0; i < kernel.length; i++) {
            for (int j = 0; j < kernel.length; j++) {
                sum=sum+kernel[i][j]* tmpMatrix[i][j];
            }
        }
        if (sum>255)return 255;
        else if (sum<0)return 0;
        else return (int) Math.round(sum);
    }
    private static void outImage() {
        for (int[] aNewImage : newImage) {
            for (int j = 0; j < newImage[0].length; j++) {
                System.out.printf("%3d",aNewImage[j]);
            }
            System.out.println();
        }
    }
    private static void initTemp(int l, int c){
        for (int i = 0; i < kernel.length; i++) {
            for (int j = 0; j < kernel.length; j++) {
                if (l + i - kernel.length / 2 <0||l+i-kernel.length/2>=image.length||c+j-kernel.length/2<0||c+j-kernel.length/2>=image[0].length)defineStat[i][j]=false;
                else {defineStat[i][j]=true;tmpMatrix[i][j]=image[l+i-kernel.length/2][c+j-kernel.length/2];}
            }
        }
    }
    private static void checkStat(int kl,int kc){
        if (!defineStat[kl][kc]) {
            if (kl+1<kernel.length&&defineStat[kl+1][kc]){tmpMatrix[kl][kc]=tmpMatrix[kl+1][kc];}
            else if (kl-1>=0&&defineStat[kl-1][kc]){tmpMatrix[kl][kc]=tmpMatrix[kl-1][kc];}
            else if (kc+1<kernel.length&&defineStat[kl][kc+1]){tmpMatrix[kl][kc]=tmpMatrix[kl][kc+1];}
            else if (kc-1>=0&&defineStat[kl][kc-1]){tmpMatrix[kl][kc]=tmpMatrix[kl][kc-1];}
            else if (kl+1<kernel.length&&kc+1<kernel.length&&defineStat[kl+1][kc+1]){tmpMatrix[kl][kc]=tmpMatrix[kl+1][kc+1];}
            else if (kl+1<kernel.length&&kc-1>=0&&defineStat[kl+1][kc-1]){tmpMatrix[kl][kc]=tmpMatrix[kl+1][kc-1];}
            else if (kl-1>=0&&kc-1>=0&&defineStat[kl-1][kc-1]){tmpMatrix[kl][kc]=tmpMatrix[kl-1][kc-1];}
            else if (kl-1>=0&&kc+1<kernel.length&&defineStat[kl-1][kc+1]){tmpMatrix[kl][kc]=tmpMatrix[kl-1][kc+1];}
            }

        }
}
