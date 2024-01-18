package Imu892_2020;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //斐波那契数列：1,1,2,3,5,8,13……,前n项数列之和
        int n = in.nextInt();
        int sum = 0;
        for(int i=1;i<=n; i++) {
            System.out.println("第"+i+"个的值为"+Sum(i));
            sum+=Sum(i);
        }
        System.out.println("和为"+sum);
    }
    public static long Sum(int n){
        if(n==1 || n==2){
            return 1;
        }
        else {
            return Sum(n-1)+Sum(n-2);

        }
    }
}
