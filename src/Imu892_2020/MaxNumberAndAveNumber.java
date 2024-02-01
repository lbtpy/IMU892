package Imu892_2020;

import java.util.Scanner;

public class MaxNumberAndAveNumber {
    public static void entrance(Scanner in){
        maxNumberAndAveNumber(in);
    }
    public static void maxNumberAndAveNumber(Scanner in) {
        //输入n个数，计算其中最大数并计算平均数
        int n = in.nextInt();
        int[] arr = new int[n];
        int count = 0;
        double sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            count++;
            sum += arr[i];
        }
        System.out.println("平均数=" + (sum / count));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[j];
                }

            }
        }
        System.out.println("最大值为" + max);
    }
}
