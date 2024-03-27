package Imu892_2023;

import java.util.Scanner;

public class reversOddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while(a>0){
            int num = a%10;
            System.out.print(num+"");
            a /= 100;
        }
    }
}
