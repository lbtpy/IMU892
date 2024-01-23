package Imu892_2018;

import java.util.Scanner;

//蛇形方阵
public class Snake {
    public static void entrance(Scanner in){
        snake(in);
    }
    public static void snake(Scanner in) {
        int n = in.nextInt();
        int [][]arr = new int[n][n];
        int i = 0;
        int j = 0;
        int p = 1; //第一个数的值
        int line = 0;  //偶数斜线往上加，奇数斜线往下加
        while(p <= n){
            if( line%2 == 0) {
                i = line;
                j = 0;
                while (i >= 0 && p <= n) {
                    arr[i--][j++] = p++; //赋值，且斜上
                }
                line ++;
            }else {
                j = line;
                i = 0;
                while(j>=0&&p<=n){
                    arr[i++][j--] = p++;  ////赋值，且斜下
                }
                line ++;
            }
        }
        for (int w = 0; w < arr.length; w++){
            for (int m = 0; m < arr.length; m++){
                if(arr[w][m]!=0){ //只输出不为0的数
                    System.out.print(arr[w][m]+" ");
                }
            }
            System.out.println();//换行
        }
    }
}
