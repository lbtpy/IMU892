package Imu892_2021;

import java.util.Scanner;

public class Strcmp {
    public static void entrance(Scanner in){
        //strcmpOne(in);
        System.out.println(strcmpTwo(in));
    }

    public static void strcmpOne(Scanner in){
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i < a.length; i++) {
            a1 += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            b1 += b[i];
        }
        if (a1 > b1) {
            System.out.println(1);
        }
        else if (a1 < b1) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }

    public static int strcmpTwo(Scanner in){
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();
        int minlen = Math.min(len1,len2);
        for (int i = 0; i < minlen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }
}
