package Imu892_2018;

import java.util.Scanner;

//杨辉三角等腰
public class YangHuiDengYao {
    public static void entrance(Scanner in){
        yangHuiDengYao(in);
    }
    public static void yangHuiDengYao(Scanner in) {
        int n = in.nextInt();//行数
        int [][]arr = new int[n][n];
        for(int i = 0; i< arr.length;i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //等腰输出
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr.length- 1 - i; j++){
                System.out.print(" "); //先打印每行的空字符
            }
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j]+" ");// 打印每行的值
            }
            System.out.println();
        }
    }
}
