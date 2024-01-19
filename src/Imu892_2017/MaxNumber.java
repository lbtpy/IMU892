package Imu892_2017;

import java.util.Scanner;

//输入n个整数，输出最大值和最小值
public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.print("请输入数字个数：");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("请输入第" + i + "个数字：");
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}
