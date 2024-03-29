package Imu892_2018;

import java.util.Scanner;

//回文数，输入多个数字进行判断
public class Palindrome {
    public static void entrance(Scanner in){
        palindromeOne(in);
    }
    public static void palindromeOne(Scanner in) {
        System.out.println("请输入多个整数,以空格分隔");
        String number = in.nextLine(); //输入字符串
        String[] numberString = number.split(" "); //将输入的字符串以空格分开,存到字符串数组
        int[] numbers = new int[numberString.length]; //划分后的字符个数，作为数组的长度
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]); //将 字符 转换为 int[]
            if (isPalindromeTwo(numbers[i])) {
                System.out.println(numbers[i] + "是回文数");
            } else {
                System.out.println(numbers[i] + "不是回文数");
            }
        }
    }
    public static boolean isPalindrome(int x){  //法一
            if( x < 0 || x!=0 && x % 10 == 0){
                return false;
            }
            int reverseNnumber = 0;
            while( x > reverseNnumber){ //数取逆后，剩下数小于取出的时，剩下循环到最后至多2位不用比较了
                reverseNnumber = reverseNnumber * 10 + x % 10;
                x = x / 10;
            }
            return x == reverseNnumber || x == reverseNnumber / 10; //对剩下的进行判断，如果符合回文数，则正确，反之不然
        }
    public static boolean isPalindromeTwo(int num) {    //法二
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
