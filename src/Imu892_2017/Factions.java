package Imu892_2017;

import java.util.Scanner;

//分式之和 = （2/1,3/2,5/3...）
public class Factions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt(); //前d项和
        double x = 2;
        double y = 1;
        double sum = 0;
        double temp;
        for(int i = 1; i <= d; i++){
            sum += x/y;
            temp = x;
            x = x + y;
            y = temp;
        }
        System.out.println(sum);
    }
}
