package Imu892_2016;

import java.util.Scanner;

//两个数之间的偶数和
public class EvenNumberSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for ( int i = m;  i <= n; i++ ){
            if ( i%2 == 0 ){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
