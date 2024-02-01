package Imu892_2020;

import java.util.Scanner;

//递归的逆序输出整数
public class ReverseNumber {
    public static void entrance(Scanner in){
        reverse(in);
    }
    public static void reverse(Scanner in) {
        int n = in.nextInt();
        reverseNumber(n);
    }
    public static void reverseNumber(int num){
        if(num < 10){
            System.out.print(num);
        }
        else {
            int a = num%10;
            System.out.print(a);
            int m = num / 10;
            reverseNumber(m);
        }
    }
}
