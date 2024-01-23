package Imu892_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//输入字符串，字母和空格，判断单词的个数
public class WordsCount {
    public static void entrance(Scanner in) throws IOException {
        //wordCount();
        wordCountTwo(in);
    }
    public static void wordCount() throws IOException {
        String str = getString();
        String[] str1 = str.split(" ");
        int count = 0;
        for(String s:str1){
            if(! s.trim().isEmpty()){
                count++;
            }
        }
        System.out.println(count);
    }
    public static String getString() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入长度小于100的字符串");
        String str = buffer.readLine();
        while(str.length()>100){
            System.out.println("字符串长度超过100，请重新输入");
            String str1 = buffer.readLine();
            str = str1;
        }
        return str;
    }

    public static void wordCountTwo(Scanner in){
        String str = in.nextLine();
        int index = 0;
        int count = 0;
        String temp = "";
        for (; index < str.length(); index++ ) {
            if (Character.isLetter(str.charAt(index))) {
                temp += str.charAt(index);
                if (index == str.length() - 1) {
                    System.out.println(temp);
                    count++;
                    break;
                }
//                    continue;
            } else {
                //如果前一个内容是字母则打印temp，temp再置空,count++
                //如果前一个内容不是字母，则temp必定是空，不打印
                if (temp.equals(""));
                else {
                    System.out.println(temp);
                    temp = "";
                    count++;
                }
            }
        }
        System.out.println("字符串中单词的个数=" + count);
    }
}

