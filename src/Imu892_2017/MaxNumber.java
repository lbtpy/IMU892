package Imu892_2017;

import java.util.Scanner;

//输入n个整数，输出最大值和最小值
public class MaxNumber {
    public static void entrance(Scanner in) {
        maxNumber(in);
    }
    public static void maxNumber(Scanner in){
        int max = 0;    //定义初值max
        int min = 0;    //定义初值min
        System.out.print("请输入数字个数：");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("请输入第" + i + "个数字：");
            int num = in.nextInt();

            //输入的第一个数字，既是最大也是最小
            if (num >= max) {
                max = num;
            }
            if (num <= min) {
                min = num;
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}
