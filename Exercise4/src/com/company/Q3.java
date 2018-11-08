package com.company;

import static java.lang.Character.toLowerCase;

public class Q3 {
    public static void main(String args[]){
        for (int i = 0; i < 12; i++) {
            String day=null;
            switch (i){
                case 0:day="first";break;
                case 1:day="second";break;
                case 2:day="third";break;
                case 3:day="fourth";break;
                case 4:day="fifth";break;
                case 5:day="sixth";break;
                case 6:day="seventh";break;
                case 7:day="eighth";break;
                case 8:day="ninth";break;
                case 9:day="tenth";break;
                case 10:day="eleventh";break;
                case 11:day="twelfth";break;
            }
            System.out.println("On the "+day+" day of Christmas,");
            System.out.println("my true love sent to me");
            String presents[]={
                    "A partridge in a pear tree",
                    "Two turtle doves",
                    "Three French hens",
                    "Four calling birds",
                    "Five golden rings",
                    "Six geese a-laying",
                    "Seven swans a-swimming",
                    "Eight maids a-milking",
                    "Nine ladies dancing",
                    "Ten lords a-leaping",
                    "Eleven pipers piping",
                    "Twelve drummers drumming"
            };
            for (int j = 0; j < i+1; j++) {
                if (j!=0)System.out.print(",\n");
                if (j==i&&i!=0){
                    System.out.print("And ");
                    for (int k = 0; k < (presents[j].length()); k++) {
                        if (k==0)System.out.print(toLowerCase(presents[j].charAt(0)));
                        else System.out.print(presents[i].charAt(k));
                    }
                    continue;
                }
                System.out.print(presents[j]);
            }
            System.out.print('.');
            System.out.println();
            System.out.println();
        }
    }
}
