package Imu892_2019;

import java.util.Scanner;

//输入两个数，作为区间，输出区间内整数 任意位 含3 的整数
public class Find3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        putContain3(39,49);
    }
    public static void putContain3(int a, int b){
        int []arr = new int[b-a];
        int p = 0;
        for (int i = a; i <= b; i++){
            String str = ""+i;
            if(str.contains("3")){
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
