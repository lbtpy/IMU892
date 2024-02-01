package Imu892_2022;

import java.util.Scanner;

//统计数字出现的频率，一次直接输出，大于1次输出频率的相反数
public class NumberCount {
    public static void entrance(Scanner in){
        //numberCountOne(in);
        numberCountTwo(in);
    }
    public static void numberCountOne(Scanner in){
        String s = in.nextLine();
        char[] c = s.toCharArray();
        int[] arr = new int[10];
        String n = "0123456789";
        char[] nc = n.toCharArray();
        int a = c.length;
        int b = nc.length;
        for (int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++){
                if(c[i] == nc[j]){
                    arr[j]++;
                }
            }
        }
        //i<b,b中每个数只有一次
        for(int i = 0; i < b; i++){
            if (arr[i] != 0) {
                if(arr[i] == 1){
                    System.out.println(nc[i] + " " + arr[i]);
                }
                if(arr[i] > 1) {
                    System.out.println(nc[i] + " " + (-arr[i]));
                }
            }
        }
    }

    //只能用作数字，下标作为要统计的数字字符，以元素作为计数器进行计数；
    public static void numberCountTwo(Scanner in){
        String s = in.nextLine();
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int a = c - 48;
            arr[a]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if(arr[i] == 1){
                    System.out.println(i + "次数 " + arr[i]);
                }
                if(arr[i] > 1) {
                    System.out.println(i + "次数 " + (-arr[i]));
                }
            }
        }
    }
}

