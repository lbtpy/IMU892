package Imu892_2016;

import java.util.Arrays;
import java.util.Scanner;

//法二 : Arrays.sort() 排序
public class SortMatrixTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("输入排序前的矩阵");
        for(int i  = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i =0; i < arr.length; i++){
            Arrays.sort(arr[i]);
        }

        System.out.println("排序后的矩阵");
        for(int i  = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
