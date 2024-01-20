package Imu892_2016;

import java.util.Arrays;
import java.util.Scanner;

//矩阵处理，m * n ,每行元素按升序排列
//法一 : 二维数组，冒泡排序
public class SortMatrix {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        //输入矩阵数据
        for( int i =0; i< n; i++ ) {
            for( int j =0; j< m; j++ ) {
                arr [i][j] = in.nextInt();
            }
        }
        //升序排序
        for( int i =0; i< n; i++ ){ //行循环
            //冒泡排序
            for ( int j = 0; j < m; j++) { //每行循环的次数
                for ( int z = 0; z < m-j-1; z++) { //每列的元素位置
                    if( arr[i][z] > arr[i][z+1]) {
                        int temp = arr[i][z];
                        arr[i][z] = arr[i][z + 1];
                        arr[i][z + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
