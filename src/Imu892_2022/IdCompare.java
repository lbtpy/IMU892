package Imu892_2022;

import java.util.Scanner;

public class IdCompare {
    public static void entrance(Scanner in){
        idCompare(in);
    }
    public static void idCompare(Scanner in){
        String s1 = in.nextLine(); //前者
        String s2 = in.nextLine(); //后者
        String s1_year = s1.substring(6,10);
        String s2_year = s2.substring(6,10);
        String s1_month = s1.substring(10,12);
        String s2_month = s2.substring(10,12);
        String s1_day = s1.substring(12,14);
        String s2_day = s2.substring(12,14);
        int int_s1_year = Integer.parseInt(s1_year);
        int int_s2_year = Integer.parseInt(s2_year);
        int int_s1_month = Integer.parseInt(s1_month);
        int int_s2_month = Integer.parseInt(s2_month);
        int int_s1_day = Integer.parseInt(s1_day);
        int int_s2_day = Integer.parseInt(s2_day);

        //出生年份不同
        if(int_s1_year != int_s2_year) {
            if (int_s1_year > int_s2_year) {
                System.out.println(-1);
            }else {
                System.out.println(1);
            }
        }else {
            //出生 年份相同，月份不同
            if(int_s1_month != int_s2_month){
                if (int_s1_month > int_s2_month) {
                    System.out.println(-1);
                }else {
                    System.out.println(1);
                }
            }else {
                //出生年份、月份相同、日不同
                if (int_s1_day != int_s2_day) {
                    if (int_s1_day > int_s2_day) {
                        System.out.println(-1);
                    }else {
                        System.out.println(1);
                    }
                //出生同一天
                }else {
                    System.out.println(0);
                }
            }
        }
    }
}
