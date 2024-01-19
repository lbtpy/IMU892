package Imu892_2018;

import java.util.Scanner;

//输入9进制数，转换为十九进制数
public class To19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = to10(s);
        System.out.println(to19(n));
    }
    public static int to10(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res *= 9;
            res+=s.charAt(i)-'0'; //转为int
        }
        return res;
    }
    public static char tochar(int x){// 转换为char
        if( x<= 9){
            return (char)('0'+x);
        }
        else {
            return (char)('a'+x-10);
        }
    }
    public static String to19(int n){
        String res ="";//拼接
        while(n!=0){
            res = tochar(n%19)+res;
            n = n/19;
        }
        return res;
    }
}

