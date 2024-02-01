package Imu892_2019;

import java.util.Scanner;

//输入一组百分制分数，等级判断
public class Score {
    public static void entrance(Scanner in){
        score(in);
    }
    public static void score(Scanner in) {
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            switch (arr[i] / 10) { //分数除10
                case 10, 9 -> System.out.println("成绩为A");
                case 8 -> System.out.println("成绩为B");
                case 7 -> System.out.println("成绩为c");
                case 6 -> System.out.println("成绩为d");
                default -> System.out.println("成绩等级为E");
            }
        }
    }
}
