import java.util.Scanner;

public class FindingCouple {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int n=input.nextInt();
            int list[]=new int[n];
            for (int j = 0; j < n; j++) {
                list[j]=input.nextInt();
            }
            int sum=0;
            for (int a:list)sum+=a;
            double avg=(double)sum/n;
            for (int j = 0; j < n; j++) {
                
            }
        }
    }
}
