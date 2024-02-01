package Imu892_2019;

import java.util.Scanner;

//输入正整数n，再输入n个数，计算并输出这n个数之和。必须使用递归
public class DiguiSum {
    public static void entrance(Scanner in){
        diGuiSum(in);
    }
    public static void diGuiSum(Scanner in) {
        int n = in.nextInt();
        System.out.println(getsum(n,0));
    }
    public static int getsum(int n, int sum) { //n控制循环次数，sum返回结果
        if (n == 0) { //递归条件
            return sum;
        } else { //每次递归输入数，求和
            Scanner in = new Scanner(System.in);
            int tmp = in.nextInt();
            sum += tmp;
            return getsum(n - 1, sum);  //n-1,每次递归次数减一次
        }
    }
}
