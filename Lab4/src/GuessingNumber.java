import java.io.*;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String args[]) throws IOException {
        int magicNum = (int) (9*Math.random());
        Scanner input=new Scanner(System.in);
        PrintWriter output=new PrintWriter(System.out);
        while (true) {
            int in=input.nextInt();
            if (in > magicNum) output.write("Too high! Please try again:");
            else if (in != magicNum) output.write("Too low! Please try again:");
            else{
                output.write("Congratulations!");
                output.flush();
                break;
            }
            output.flush();
        }
    }
}
