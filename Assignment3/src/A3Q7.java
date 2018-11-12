import java.util.Arrays;
import java.util.Scanner;

public class A3Q7 {
    private static int[][]tmpMatrix;
    private static boolean[][]defineStat;
    private static Scanner scanner;
    private static double[][] kernel;
    private static int[][] image;
    private static int[][] newImage;
    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            initKernel(scanner.nextInt());
            flipKernel();
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
        int oriWidth=0,oriHeight=0;
        if (l-kernel.length/2<0)oriHeight+=l+1;
        else oriHeight+=kernel.length/2+1;
        if (l+kernel.length/2>image.length-1)
        if (c-kernel.length/2<0)oriWidth+=c+1;
        else oriWidth+=kernel.length/2+1;
        if (c+kernel.length/2>image.length-1)
        tmpMatrix=new int[kernel.length][kernel.length];
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
        int sum=0;
        for (int i = 0; i < kernel.length; i++) {
            for (int j = 0; j < kernel.length; j++) {
                sum+=kernel[i][j]*tmpMatrix[i][j];
            }
        }
        return sum;
    }
    private static void outImage() {
        for (int[] aNewImage : newImage) {
            for (int j = 0; j < newImage[0].length; j++) {
                System.out.print(aNewImage[j]);
            }
            System.out.println();
        }
    }
    private static void initTemp(int l,int c){
        for (int i = 0; i < kernel.length; i++) {
            for (int j = 0; j < kernel.length; j++) {
                if (l+i-kernel.length/2<0||l+i-kernel.length/2>=image.length||c+j-kernel.length<0||c+j-kernel.length>=image[0].length)defineStat[i][j]=false;
                else {defineStat[i][j]=true;tmpMatrix[i][j]=image[l+i-kernel.length][c+j-kernel.length];}
            }
        }
    }
    private static void checkStat(int kl,int kc){
        if (defineStat[kl][kc]) {
        }
        else  {
            if (kl+1<kernel.length&&defineStat[kl+1][kc]){tmpMatrix[kl][kc]=tmpMatrix[kl+1][c];defineStat[kl][kc]=true;}
            if (kl-1>=0&&defineStat[kl-1][kc]){tmpMatrix[kl][kc]=tmpMatrix[kl-1][c];defineStat[kl][kc]=true;}
            if (kc+1<kernel.length&&defineStat[kl][kc+1]){tmpMatrix[kl][kc]=tmpMatrix[kl][kc+1];defineStat[kl][kc]=true;}
            if (kc-1>=0&&defineStat[kl][kc-1]){tmpMatrix[kl][kc]=tmpMatrix[kl][kc-1];defineStat[kl][kc]=true;}
            if (kl+1<kernel.length&&kc+1<kernel.length&&defineStat[kl+1][kc+1]){tmpMatrix[kl][kc]=tmpMatrix[kl+1][kc+1];defineStat[kl][kc]=true;}
            if (kl+1<kernel.length&&kc-1<kernel.length&&defineStat[kl+1][kc-1]){tmpMatrix[kl][kc]=tmpMatrix[kl+1][kc-1];defineStat[kl][kc]=true;}
            if (kl-1<kernel.length&&kc-1<kernel.length&&defineStat[kl-1][kc-1]){tmpMatrix[kl][kc]=tmpMatrix[kl-1][kc-1];defineStat[kl][kc]=true;}
            if (kl-1<kernel.length&&kc+1<kernel.length&&defineStat[kl-1][kc+1]){tmpMatrix[kl][kc]=tmpMatrix[kl-1][kc+1];defineStat[kl][kc]=true;}
            }

        }
}
