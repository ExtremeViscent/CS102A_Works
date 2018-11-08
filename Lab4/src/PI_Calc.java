import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class PI_Calc {
    public static void main(String args[]){
        double pi=0,pin=4;
        Scanner input=new Scanner(System.in);
        System.out.println("Please input a precision:");
        double thre=input.nextDouble();
        int i=1,k=1;
        while (Math.abs(pin-pi)>thre){
            pi=pin;
            pin=pi-4.0/(i+2)+4.0/(i+4);
            i+=4;
            k++;k++;
        }
        System.out.println(pin);
        System.out.println(k+" iterations");
    }
}
