package Imu892_2017;

import java.util.Scanner;

//输入n个整数，输出最大值和最小值
public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;    //定义初值max=int型最小值
        int min = Integer.MAX_VALUE;    //定义初值min=int型最大值
        System.out.print("请输入数字个数：");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("请输入第" + i + "个数字：");
            int num = input.nextInt();

            //输入的第一个数字，既是最大也是最小
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
