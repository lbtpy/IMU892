package Imu892_2017;

import java.util.Scanner;

//输入两个数，求它们之间的素数
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        for(int i = start; i <= end; i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
