package Imu892_2016;

import java.util.Scanner;

//字符串方法 逆序输出整数
public class ReverseNumberString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String a  = InverseNumber( number );
        System.out.print(a);
    }
    public static String InverseNumber( int i){
        String s = "";
        if( i<10 ) {
            return s+i;
        }
        else{
            return s+InverseNumber(i%10)+InverseNumber(i/10);
        }
    }
}
