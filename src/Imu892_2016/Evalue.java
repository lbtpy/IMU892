package Imu892_2016;

import java.util.Scanner;

//求e的值
public class Evalue {
    private static final double MAX_VALUE = 1e20;

   public static void entrance() {
        Evalue.eValue();
        Evalue.eValueTwo();
        Evalue.EValueThree();
   }
   public static void eValue(){
        double mul = 1; //
        double e = 1; //
        long i = 2;
        long start = System.nanoTime();
        while (mul <= MAX_VALUE) { //最后一项值 小于，分之一 就大于
            e += 1.0 / mul;
            mul = mul*i;
            i++;
        }
        System.out.printf("e=%f\n", e);
        System.out.println(i);
        long end = System.nanoTime();
        System.out.println("执行时间(ms)"+(end-start));
    }

    public static void eValueTwo(){
        double mul = 1; //
        double e = 1; //
        long start = System.nanoTime();
        while (mul <= MAX_VALUE) { //最后一项值 小于，分之一 就大于
            for(int i = 2;i <= 11; i++) {
                e += 1.0 / mul;
                mul = mul * i;
            }
        }
        System.out.printf("e=%f\n", e);
        //System.out.println(i);
        long end = System.nanoTime();
        System.out.println("执行时间(ms)"+(end-start));
    }

    public static void EValueThree(){
        double e = 1;
        double sum = 1;
        int n = 1;
        long start = System.nanoTime();
        while(sum > 1/MAX_VALUE){
            e+=sum;
            n++;
            sum = 1.0/fact(n);
        }
        System.out.printf("%f",e);
        long end = System.nanoTime();
        System.out.println("执行时间(ms)"+(end-start));
    }
    public static double fact(int i){
        double mul = 1;
        if (i == 1) {
            return mul;
        }
        mul = i * fact(i-1);
        return mul;
        }
}
