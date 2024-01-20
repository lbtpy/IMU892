package Imu892_2016;

import java.util.Scanner;

//递归，逆序输出整数 -- 不换行 逐个输出
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        InverseNumber( number );
        }
    public static void InverseNumber( int i ){
        if( i< 10){
            System.out.print(i);    //小于10直接输出
        }
        else{
            int m = i%10;
            System.out.print(m);    //输出个位
            int n = i/10;
            InverseNumber(n);   //除了个位，剩余位递归进行
        }
    }
}
