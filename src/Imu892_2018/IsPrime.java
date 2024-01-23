package Imu892_2018;

import java.util.Scanner;

//输入两个数，求它们之间的素数
public class IsPrime {
    public static void entrance(Scanner in){
        prime(in);
    }
    public static void prime(Scanner in) {
        int a = in.nextInt();
        int b = in.nextInt();
        PrimeGeneretor prime = new PrimeGeneretor(a,b);
        prime.getPrime();
    }
}
class PrimeGeneretor{
    private int start;
    private int end;
    public PrimeGeneretor(int a, int b){
        if (a > b) {
            start = b;
            end = a;
        } else {
            start = a;
            end = b;
        }
    }
    boolean isPrime(int n) { //判断是否是素数
        if(n == 1) {
            return false;
        }
        for (int j = 2; j < n; j++){
            if( n%j == 0){
                return false;
            }
        }
        return true;
    }
    void getPrime(){
        int n = 0;
        for(int i = start; i <= end; i++){ //判断区间内符合素数的数
            if(isPrime(i)) {
                System.out.print(i+" ");
                n++;
                if(n % 5 == 0){ //超过五个，换行
                    System.out.println();
                }
            }
        }
    }
}
