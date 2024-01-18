package Imu892_2020;

import java.util.Scanner;

//杨辉直角
public class YangHuiZhiJiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //行
        int[][] number = new int[n][n];
        for( int i = 0 ; i < n ; i++ ) {
            for( int j = 0; j <= i; j++ ) {
                if( j==0 || i==j ){
                    number[i][j] = 1;
                }
                else{
                    number[i][j] = number[i-1][j-1]+number[i-1][j];
                }
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
