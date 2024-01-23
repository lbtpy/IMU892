package Imu892_2018;

import java.util.Scanner;

//输入元素，组成矩阵，输出每列的最大值，并求它们的和
public class MatrixColumnSum {
    public static void entrance(Scanner in){
        matrixColumnSum(in);
    }
    public static void matrixColumnSum(Scanner in) {
        //矩阵每行的最大值，和
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int [][] arr = new int[n][m];
//        int [] b = new int[n];
//        int sum = 0;
//        for(int i = 0; i < n; i++){
//            b[i] =0;
//            for(int j = 0; j < m; j++){
//                arr[i][j] = in.nextInt();
//                if(b[i] < arr[i][j]){
//                    b[i] = arr[i][j];
//                }
//            }
//        }
//        for(int i = 0; i < n; i++) {
//            System.out.println("第"+(i+1)+"行的最大值："+b[i]);
//            sum += b[i];
//        }
//        System.out.println("行最大值的和为："+sum);

        //矩阵每列的最大值，和 -- 行进行 转置
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int [][]arr = new int[n][m];
        int [][]c = new int[m][n];
        int []b = new int[m]; //存最大值的数组
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
                c[j][i] = arr[i][j]; //矩阵转置
            }
        }
        for(int i = 0; i < m; i++){
            b[i] = 0;
            for(int j = 0; j < n; j++){
                if(b[i]<c[i][j]){
                    b[i] = c[i][j];
                }
            }
        }
        for(int i = 0; i < m; i++){
            System.out.println("第"+(i+1)+"列的最大值为："+b[i]);
            sum += b[i];
        }
        System.out.println("列最大值的和为："+sum);

    }
}
