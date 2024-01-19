package Imu892_2016;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//字符串中，提取 连续数字 的整数 个数
public class StrNumberCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
}
