package Imu892_2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//输入一组互不相等的百分制成绩，-1结束，由高到低输出成绩及其位置号，位置号由输入顺序确定
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Grade> list = new ArrayList<>();
        int p = 1;
        while (n != -1) {
            list.add(new Grade(p++, n));
            n = in.nextInt();
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).grade < list.get(j).grade) {
                    Grade temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        for (int i = 0; i < list.size() && i < 10; i++) {
            System.out.print(list.get(i).num + "号" + list.get(i).grade + "分" + " ");
        }
    }
}
class Grade{
    int num;
    int grade;
    public Grade(int num,int grade){
        this.grade = grade;
        this.num = num;
    }
}

