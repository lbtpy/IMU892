package Imu892_2016;

import java.util.Scanner;

//两个数之间的偶数和
public class EvenNumberSum {
    public static void methodOne(Scanner in) {
        long m = in.nextInt();
        long n = in.nextInt();
        long start = System.currentTimeMillis();
        long sum = 0;
        for (long i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        long spend = System.currentTimeMillis() - start;
        System.out.println("methodOne spend time(ms) = " + spend);
    }
    public static void methodTwo(Scanner in){
        //法二:求出偶数项数,等差数列
        long m = in.nextInt();   //首值
        long n = in.nextInt();   //末值
        long start = System.currentTimeMillis();
        long sum,count;
        if (m % 2 == 0) {
            //首项偶，末项偶
            if(n%2 ==0) {
                count = (n - m) / 2 + 1;
                sum = count * (n + m) / 2;
            }
            //首项偶，末项奇
            else {
                count = (n + 1 - m) / 2;
                sum = count * (n-1 + m) / 2;
            }
        } else {
            //首项奇，末项偶
            if(n%2 == 0){
                count = (n + 1 - m) / 2;
                sum = count * (n + m + 1) / 2;
            }
            //首项奇，末项奇
            else {
                count = (n - m) / 2;
                sum = count * (n + m) / 2;
            }
        }
        System.out.println(sum);
        long spend = System.currentTimeMillis() - start;
        System.out.println("methodTwo spend time(ms) = " + spend);
    }
}