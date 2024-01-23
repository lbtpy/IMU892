package Imu892_2017;

import java.util.Scanner;

//输入两个数，求它们之间的素数
public class Prime {
    public static void entrance(Scanner in){

        prime(in);
    }
    public static void prime(Scanner in) {
        int a = in.nextInt();
        int b = in.nextInt();
        primeGeneretor prime = new primeGeneretor(a,b);
        prime.getPrime();
    }
}
class primeGeneretor{
    private int start;
    private int end;
    public primeGeneretor(int a, int b){
        if (a > b) {
            start = b;
            end = a;
        } else {
            start = a;
            end = b;
        }
    }
    boolean isPrime(int n) {
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
        for(int i = start; i <= end; i++){
            if(isPrime(i)) {
                System.out.print(i+" ");
                n++;
                if(n % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}
