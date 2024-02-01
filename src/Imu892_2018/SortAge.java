package Imu892_2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//班级学生，姓名，出生年月，排序
public class SortAge {
    public static void entrance(Scanner in) {
        putName(in);
    }
    public static void putName(Scanner in){
        String str;
        String regex = "\\s";
        String[] s1;
        List<Student> list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            System.out.println("请输入第"+(i+1)+"人的姓名和生日");
            str = in.nextLine();
            s1 = str.split(regex);
            list.add(new Student(s1[0],getDate(s1[1]))); //分割后，添加进列表，同步进行实例化
        }
        //按生日大小，排序
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).date > list.get(j).date) {
                    Student temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        //输出结果
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name+" ");
        }
    }
    public static Integer getDate(String x){
        String str = "";
        String regex = "\\D+";
        String[] s = x.split(regex);
        for (int i = 0; i < s.length; i++) {
            str = str + s[i];
        }
        return Integer.parseInt(str);
    }
}

class Student{ //定义学生类，属性
    String name;
    Integer date;
    public  Student(String name, Integer date){
        this.name = name;
        this.date = date;
    }
}

