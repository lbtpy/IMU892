package Imu892_2019;

import java.util.Scanner;

//输入一组数，将其中的奇数，逆序输出，不用排序，例如：1 2 3 4 5 7. 7 5 3 1
public class OddsNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        int []b = new int[n];
        int p = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            if(arr[i]%2 !=0){
                b[p++] = arr[i];
            }
        }
        for (int i = b.length-1; i >= 0; i--){
            if( b[i] != 0) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
