package Imu892_2019;

import java.util.Scanner;

//设计菜单，完成简单计算器功能
public class Compute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入指令，1-加，2-减，3-乘，4-除，5-退出");
        int n = in.nextInt();
        while (n < 5) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (n == 1) {
                System.out.println(a + b);
            } else if (n == 2) {
                System.out.println(a - b);
            } else if (n == 3) {
                System.out.println(a * b);
            } else if (n == 4) {
                System.out.println(a / b);
            } else {
                break;
            }
            System.out.println("请输入指令，1-加，2-减，3-乘，4-除，5-退出");
            n = in.nextInt();
        }
    }
}