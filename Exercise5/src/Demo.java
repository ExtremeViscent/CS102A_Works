import java.util.Scanner;

public class Demo {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N=scanner.nextInt();
            int[] Orders=new int[N];
            for (int j = 0; j < N; j++) {
                Orders[j]=scanner.nextInt();
            }
            int tmp=0,flag=0;
            for (int j = 0; j < N; j++) {
                if (Orders[tmp]==-1){System.out.println("false");flag=1;break;}
                tmp=Orders[tmp];
            }
            if (flag==1)continue;
            System.out.println(true);
        }
    }
}
