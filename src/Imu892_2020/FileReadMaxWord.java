package Imu892_2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReadMaxWord {
    public static void entrance() throws IOException {
        read();
    }
    public static void read() throws IOException {
        String fileName = "C:\\Users\\86139\\Desktop\\word.txt";
        readUsingBufferedReader(fileName);
    }
    private static String readUsingBufferedReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String regex = " ";
        String[] s = new String[0];
        System.out.println("读取内容如下");
        while((line = br.readLine()) != null) {
            //逐行读取
            System.out.println(line);
            s = line.split(regex);
        }
        br.close();
        fr.close();
        //建立两个集合
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(String word : s){
            list1.add(word); //存取单词
            list2.add(word.length()); //存取每个单词的长度
        }
        int maxLength = 0;
        String maxStr = "";
        for(int i=0;i<list2.size();i++){
            if(maxLength<list2.get(i)){
                maxLength = list2.get(i);
                maxStr = list1.get(i);
            }
        }
        System.out.println("第一个最长的单词:"+maxStr);
        return maxStr;
    }
}
