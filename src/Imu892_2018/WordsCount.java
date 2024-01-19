package Imu892_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//输入字符串，字母和空格，判断单词的个数
public class WordsCount {
    public static void main(String[] args) throws IOException {
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
}

