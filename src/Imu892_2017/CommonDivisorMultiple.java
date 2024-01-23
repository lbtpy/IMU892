package Imu892_2017;

import java.util.Scanner;

//输入两个数，并求他们的最大公约数和最小公倍数
public class CommonDivisorMultiple {
    public static void entrance(Scanner in) {
        //commonDivisorMutipleOne(in);
        commonDivisorMutipleTwo(in);
    }
    public static void commonDivisorMutipleOne(Scanner in) {
        int m = in.nextInt();
        int n = in.nextInt();
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        //最大公约数
        for(int i = min; i >= 1; i--){
            if( max%i == 0 && min%i ==0){
                System.out.println("最大公约数为" + i);
                break;  //及时退出循环
            }
        }
        //最大公倍数; 法二 = 两数的积 = 最大公约数 * 最小公倍数
        for (int i = max; i <= max * min; i++) {
            if (i%min ==0 && i%max == 0) {
                System.out.println("最大公倍数为" + i);
                break;
            }
        }
    }
    public static void commonDivisorMutipleTwo(Scanner in) {
        int m = in.nextInt();
        int n = in.nextInt();
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        //最大公约数
        int i;
        for( i = min; i >= 1; i--){
            if( max%i == 0 && min%i ==0){
                System.out.println("最大公约数为" + i);
                break;  //及时退出循环
            }
        }
        //法二 = 两数的积 = 最大公约数 * 最小公倍数
       System.out.println("最小公倍数为"+(m*n/i));
    }
}
