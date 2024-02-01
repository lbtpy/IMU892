package Imu892_2021;

import java.util.Arrays;
import java.util.Scanner;
//矩阵快速幂 -- 将幂次数转为二进制，每位上的结果相乘
public class MatrixPower {
    //定义矩阵乘法函数
    public static long[][] multiply(long[][] num1, long[][] num2) {
        int m = num1.length, n = num2[0].length, k = num2.length;
        long[][] num3 = new long[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int p = 0; p < k; p++) {
                    num3[i][j] += num1[i][p] * num2[p][j];
                }
            }
        }
        return num3;
    }
    //幂次方计算
    public static long[][] power(long[][] num1, long n) {
        int a = num1.length;
        long[][] num2 = new long[a][a];//构造单位矩阵
        for (int i = 0; i < a; i++) {
            num2[i][i] = 1;
        }
        while (n > 0) {
            //n的二进制末位 = 1
            if ((n & 1) == 1) {
                //矩阵本身，即和单位矩阵相乘
               num2 = multiply(num2,num1);
            }
            //幂次，自己和自己相乘
            num1 = multiply(num1, num1);
            // n 右移 1 位
            n >>= 1;
        }
        return num2;
    }
    public static void entrance(Scanner in) {
        int n = in.nextInt();
        int m = in.nextInt();
        long[][] num1 = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num1[i][j] = in.nextInt();
            }
        }
        long[][] num4 = power(num1, m);
        System.out.println(Arrays.deepToString(num4));
    }
}