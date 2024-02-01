package Imu892_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTranslaton {
    public static void entrance(Scanner in){
        array(in);
    }
    public static void array(Scanner in){
        int[] arr = {1,2,3,4,5,6,7};
        int[] b = new int[arr.length];
        int p = 0;
        int k = in.nextInt();
        int len = arr.length;
        for (int i = len - k; i < len; i++) {
            b[p++] = arr[i];
        }
        for (int i = 0; i < len - k; i++) {
            b[p++] = arr[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
