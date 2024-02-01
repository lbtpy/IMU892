package Imu892_2021;

import java.util.Scanner;

public class To10 {
    public static void entrance(Scanner in){
        //to10One(in);
        //to10Two(in);
        //to16One(in);
    }
    public static void to10One(Scanner in){
        //输入十六进制数
        String n = in.nextLine();
        int m = converse(n);
        System.out.println("对应的十进制为"+m);
    }
    //转换为10进制
    public static int converse(String x){
       int res = 0;
       for (int i = 0; i < x.length(); i++) {
           res *= 16;
           res += x.charAt(i)-'0';
       }
       return res;
    }
    public static void to10Two(Scanner in){
        String s = in.nextLine();
        int dec = Integer.parseInt(s,16);
        System.out.println(dec);
    }
    public static void to16One(Scanner in){
        Integer x = in.nextInt();
        String hex = x.toHexString(x);  //转换为16进制
        System.out.println(hex);
    }
}
