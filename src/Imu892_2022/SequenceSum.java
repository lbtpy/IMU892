package Imu892_2022;

import java.util.Scanner;

public class SequenceSum {
    public static void entrance(Scanner in){
        sequenceSum(in);
    }
    public static void sequenceSum(Scanner in){
        long n = in.nextLong();
        System.out.println((1 + n) * n / 2);
    }
}
