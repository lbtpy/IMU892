package Imu892_2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//班级学生，姓名，出生年月，排序
public class SortAge {
    public static void main(String[] args) {
        putName();
    }

    public static void putName() {
        String[] s1 = new String[2];
        String str = "";
        String regex1 = "\\s";
        List<Student> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入");
            str = in.nextLine();
            s1 = str.split(regex1);
            list.add(new Student(s1[0], getDate(s1[1])));
        }
        System.out.println("ss");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).date > list.get(j).date) {
                    Student tmp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, tmp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " ");
        }
    }
    public static Integer getDate(String s2) {
        String regex = "\\D+";
        String str = "";
        String[] arr = s2.split(regex);
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
        }
        return null;
    }
}
class Student{
    String name;
    Integer date;
    public Student(String name,Integer date){
        super();
        this.name = name;
        this.date = date;
    }
}
