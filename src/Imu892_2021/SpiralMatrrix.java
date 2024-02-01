package Imu892_2021;

import java.util.Scanner;

public class SpiralMatrrix {
    public static void entrance(Scanner in){
        int n = in.nextInt();
        printMatrix(generateMatrix(n));
    }
    public static int[][] generateMatrix(int n) {
        //数组的位置下标
        int i = 0, j = 0;
        //循环次数
        int loop = n == 1 ? 1 : n - 1;
        //填充元素的值
        int count = 1;
        //控制方向
        int direction = 1;
        int[][] result = new int[n][n];

        while (count <= n * n) {
            //从左往右
            if (direction == 1) {
                for (int k = 0; k < loop; k++) {
                    //设置值后向右移动，同时count自增1
                    result[i][j++] = count++;
                }
                //改变方向，使下次进入从上往下的循环
                direction = 2;
                //结束该次循环
                continue;
            }
            //从上往下
            if (direction == 2) {
                for (int k = 0; k < loop; k++) {
                    result[i++][j] = count++;
                }
                direction = 3;
                continue;
            }
            //从右往左
            if (direction == 3) {
                for (int k = 0; k < loop; k++) {
                    result[i][j--] = count++;
                }
                direction = 4;
                continue;
            }
            //从下往上
            if (direction == 4) {
                for (int k = 0; k < loop; k++) {
                    result[i--][j] = count++;
                }
                //方向回到  左----》右
                direction = 1;
                //当前层结束，调整loop
                loop = loop == 3 || loop == 2 ? loop / 2 : loop - 2;
                //i,j指向下一层首个元素
                i++;
                j++;
                continue;
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
