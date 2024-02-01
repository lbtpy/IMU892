package Imu892_2021;

import java.util.Scanner;

public class ExactDivisor {
    public static void entrance (){
        divisorOne();
        divisorTwo();
    }
    public static void divisorOne(){
        long start = System.currentTimeMillis();
        for (int i = 300; i <= 500; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
        long spend = System.currentTimeMillis() - start;
        System.out.println(spend+"ms");
    }

    public static void divisorTwo(){
        long start = System.currentTimeMillis();
        for (int i = 315; i <= 500; i+=21) {
                System.out.println(i);
        }
        long spend = System.currentTimeMillis() - start;
        System.out.println(spend+"ms");
    }
}
