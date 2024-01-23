package Imu892_2018;

import java.util.Scanner;

//输入9进制数，转换为十九进制数
public class To19 {
    public static void entrance(Scanner in){
        to19(in);
    }
    public static void to19(Scanner in) {
        String s = in.nextLine();
        int n = to10(s);
        System.out.println(to19(n));
    }
    public static int to10(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res *= 9;
            res+=s.charAt(i)-'0'; //每一位上的字符，转为整数
        }
        return res;
    }
    public static char tochar(int x){// 转换为char  a-z,A-Z
        if( x<= 9){
            return (char)('0'+x);
        }
        else {
            return (char)('a'+x-10);
        }
    }
    public static String to19(int n){ //转换为10进制的数，再转换为19进制，字符串输出
        String str ="";//拼接
        while(n!=0){
            str = tochar(n%19) + str;
            n = n / 19;
        }
        return str;
    }
}

