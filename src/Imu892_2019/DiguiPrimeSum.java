package Imu892_2019;

import java.util.Scanner;

//输入一个数，输出比它大的五个最小素数之和
public class DiguiPrimeSum {
    public static void ebtrance(Scanner in){
        diGuiPrime(in);
    }
    public static void diGuiPrime(Scanner in) {
        //输入一个数，输出比它大的五个最小素数之和
        int n = in.nextInt();
        int i = 0; //控制循环次数
        int sum = 0;
        while (i < 5) {
            n++;
            boolean flag = true;
            if ( n == 2) {
                sum += 2;
                i++;
                continue;
            }
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                sum += n;
                i++;
            }
        }
        System.out.println(sum);
    }
}