package Imu892_2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//字符串中，提取 连续数字 的整数 个数
public class StrNumberCount {
    public static void entrance (Scanner in){
        //strNumberCountOne(in);
        strNumberCountTwo(in);
    }
    public static void strNumberCountOne(Scanner in){
        String str = in.next();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int count =0;
        while(matcher.find()) {
            String string = matcher.group();
            count++;
            System.out.print(string+" ");
        }
        System.out.println("个数="+count);

    }

    public static void strNumberCountTwo(Scanner in){
        String str = in.nextLine();
        int index = 0;
        int count = 0;
        String temp = "";
        for (; index < str.length(); index++ ) {
            if (Character.isDigit(str.charAt(index))) {
                temp += str.charAt(index);
                if (index == str.length() - 1) {
                    System.out.println(temp);
                    count++;
                    break;
                }
//                    continue;
            } else {
                //如果前一个内容是数字则打印temp，temp再置空,count++
                //如果前一个内容不是数字，则temp必定是空，不打印
                if (temp.equals(""));
                else {
                    System.out.println(temp);
                    temp = "";
                    count++;
                }
            }
        }
        System.out.println("字符串中整数的个数=" + count);
    }
}
