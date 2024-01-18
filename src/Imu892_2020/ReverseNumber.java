package Imu892_2020;

import java.util.Scanner;

//递归的逆序输出整数
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
