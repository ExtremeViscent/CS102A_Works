import java.util.Scanner;

public class A3Q6 {
    private static int m,n;
    private static int[][] arr;
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            m=scanner.nextInt();n=scanner.nextInt();
            initArray();
            outArray(scanner.nextInt(),scanner.nextInt());
        }
    }
    private static void outArray(int x,int y){
        int counter=0,cont=0;
        int dir=0;
        int unit=1;
        while (cont<arr.length*arr[0].length){
            if (counter>1){counter=0;unit++;}
            switch (dir){
                case 1:{dir++;for (int i = 0; i < unit; i++)
                    try {
                        System.out.print(arr[x+i][y]+" ");cont++;
                    } catch (Exception e) {
                        continue;
                    }
                    x+=unit;counter++;break;}
                case 0:{dir++;for (int i = 0; i < unit; i++)
                    try {
                        System.out.print(arr[x][y+i]+" ");cont++;
                    } catch (Exception e) {
                        continue;
                    }
                    y+=unit;counter++;break;}
                case 3:{dir=0;for (int i = 0; i < unit; i++)
                    try {
                        System.out.print(arr[x-i][y]+" ");cont++;
                    } catch (Exception e) {
                        continue;
                    }
                    x-=unit;counter++;break;}
                case 2:{dir++;for (int i = 0; i < unit; i++)
                    try {
                        System.out.print(arr[x][y-i]+" ");cont++;
                    } catch (Exception e) {
                        continue;
                    }
                    y-=unit;counter++;break;}
            }
        }
        System.out.println();
    }
    private static void initArray(){
        arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
    }
}
