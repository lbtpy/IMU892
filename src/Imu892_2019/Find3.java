package Imu892_2019;

import java.util.Scanner;

//输入两个数，作为区间，输出区间内整数 任意位 含3 的整数
public class Find3 {
    public static void entrance (Scanner in){
        find3(in);
    }
    public static void find3(Scanner in) {
        putContain3(39,49);
    }
    public static void putContain3(int a, int b){
        int []arr = new int[b-a];
        int p = 0;
        for (int i = a; i <= b; i++){
            String str = ""+i; //拼接转换为字符串
            if(str.contains("3")){ //判断是否含3
                arr[p++] = i;
            }
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
