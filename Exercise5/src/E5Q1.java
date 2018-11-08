import java.util.Scanner;

public class E5Q1 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        int kids[]={12,24,8,22,15,4,8,6,scanner.nextInt()};
        int[] tmpa;
        int counter=0;
        while (!isSame(kids)){
            counter++;
            tmpa=new int[9];
            for (int i = 0; i < 9; i++) {
                if (kids[i]%2!=0)kids[i]--;
                kids[i]/=2;
                tmpa[i]=kids[i];
            }
            for (int i = 0; i < 8; i++) {
                kids[i+1]+=tmpa[i];
            }
            kids[0]+=tmpa[8];
        }
        System.out.print("After looping "+counter+" times,each kid get "+kids[0]+" chocolates.");
    }
    public static boolean isSame(int a[]){
        for (int i = 0; i < 8; i++) {
            if (a[i]!=a[i+1])return false;
        }
        return true;
    }
}
