package Imu892_2017;

import java.util.Scanner;

//统计英文字符，即ASCII码比较，统计字符中a-z，A-Z的字符
public class WordNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s  = in.nextLine();
        char[] str = new char[s.length()];
        for(int i = 0; i<str.length; i++){
            str[i] = s.charAt(i);
        }
        System.out.print(myLength(str));
    }
    public static int myLength(char[] str){
        int count = 0;
        for(int i =0; i<str.length; i++){
            if(str[i]>='a'&&str[i]<='z'||str[i]>='A'&&str[i]<='Z'){
                count++;
            }
        }
        return count;
    }
}
