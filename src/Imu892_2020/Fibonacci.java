package Imu892_2020;

import java.util.Scanner;

public class Fibonacci {
    public static void entrance(Scanner in){
        fibonacii(in);
    }
    public static void fibonacii(Scanner in) {
        //斐波那契数列：1,1,2,3,5,8,13……,前n项数列之和
        int n = in.nextInt();
        int a = 0;  //和
        for (int i=1;i<=n; i++) {
            System.out.println("第"+i+"个的值为"+Sum(i));
            a += Sum(i);
        }
        System.out.println("和为" + a);
    }
    public static long Sum(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return Sum(n-1) + Sum(n-2);
        }
    }
}
