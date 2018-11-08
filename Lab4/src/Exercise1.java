import java.util.Scanner;

public class Exercise1 {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        double grade=Double.parseDouble(input.nextLine());
        if(grade>=90)System.out.print("Your grade is "+grade+", the corresponding GPA is 4.0");
        if(grade<90&&grade>=80)System.out.print("Your grade is "+grade+", the corresponding GPA is 3.0");
        if(grade<80&&grade>=70)System.out.print("Your grade is "+grade+", the corresponding GPA is 2.0");
        if(grade<70&&grade>=60)System.out.print("Your grade is "+grade+", the corresponding GPA is 1.0");
        if(grade<60)System.out.print("Your grade is "+grade+", the corresponding GPA is 0");
    }
}
