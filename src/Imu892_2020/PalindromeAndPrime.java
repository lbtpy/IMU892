package Imu892_2020;

import java.util.Scanner;

//输出a到b之间 回文素数
public class PalindromeAndPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i<=b; i++){
            if(isPalindrome(i)&&isPrime(i)){
                System.out.println(i+"既是回文数也是素数");
            }
        }
    }
    public static boolean isPrime(int x) { //判断是否是素数
        if (x == 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
