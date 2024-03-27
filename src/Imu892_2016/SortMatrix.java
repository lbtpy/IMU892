package Imu892_2016;

import java.util.Arrays;
import java.util.Scanner;

//矩阵处理，m * n ,每行元素按升序排列: 快排
public class SortMatrix {
    public static void entrance(Scanner in){
        //SortMatrix.sortMatrix(in);
        SortMatrix.sortMatrixTwo(in);
    }

    public static void sortMatrix(Scanner in) {
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

    private static void sortMatrixTwo(Scanner in) {
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++){
            quickSort(arr[i],0,arr[i].length-1);
            System.out.println(Arrays.toString(arr[i]));
        }
    }

        //快速排序
        public static void quickSort(int[] row, int low, int high) {
            int p, i, j, temp;
            if (low > high) {
                return;
            }
            p = row[low];//基准第一个元素
            i = low;
            j = high;
            while (i != j) {
                while (row[j] >= p && i < j) {
                    j--;
                }
                while(row[i] <= p && i < j) {
                    i++;
                }
                temp = row[j];
                row[j] = row[i];
                row[i] = temp;
            }
            row[low] = row[i];
            row[i] = p;
            quickSort(row,0,j - 1);
            quickSort(row,j + 1,high);
        }

}
