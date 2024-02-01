package Imu892_2019;

import java.util.Scanner;

//输入一行字符（个数<=100），查找其中的数字字符，输出数字字符组成的数字之和。注意，数字字符可能组成两位或两位以上的数字
public class regexNumberSum {
    public static void entrance(){
        numberCountStr();
    }
    public static void numberCountStr() {
        String str = "a11b22c3";
        myStyleSum(str);
    }
    public static void myStyleSum(String str){
        String regex = "\\p{Alpha}+";
        int sum = 0;
        String []s = str.split(regex);
        if (s[0].length()!=0) {
            for (int i=0; i<s.length;i++) { //判断首位是否有数字
                sum+=Integer.parseInt(s[i]);
            }
        } else{
            for(int i=1; i<s.length; i++){ //首位不是数字，从下标1开始
                sum+=Integer.parseInt(s[i]);
            }
        }
        System.out.println(sum);
    }
}
