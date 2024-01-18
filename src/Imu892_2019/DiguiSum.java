package Imu892_2019;

import java.util.Scanner;

//输入正整数n，再输入n个数，计算并输出这n个数之和。必须使用递归
public class DiguiSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getsum(n,0));
    }
    public static int getsum(int n, int sum) {
        if (n == 0) {
            return sum;
        } else {
            Scanner in = new Scanner(System.in);
            int tmp = in.nextInt();
            sum += tmp;
            return getsum(n - 1, sum);//n-1,控制数的个数
        }
    }
}
