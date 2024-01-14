import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main2018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //回文数，输入多个数字进行判断
        /*System.out.println("请输入多个整数,以空格分隔");
        String number = in.nextLine(); //输入字符串
        String[] numberString = number.split(" "); //将输入的字符串以空格分开
        int[] numbers = new int[numberString.length]; //划分后的字符个数，作为数组的长度
        Reverse reverse = new Reverse();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]); //将 字符 转换为 int[]
            if (reverse.isPalindrome(numbers[i])) {
                System.out.println(numbers[i] + "是回文数");
            } else {
                System.out.println(numbers[i] + "不是回文数");
            }
        }

         */

        //输入字符串，字母和空格，判断单词的个数
        /*String str = getString();
        String[] str1 = str.split(" ");
        int count = 0;
        for(String s:str1){
            if(! s.trim().isEmpty()){
                count++;
            }
        }
        System.out.println(count);

         */

        //输入元素，组成矩阵，输出每列的最大值，并求它们的和
        //矩阵每行的最大值，和
        /*int n = in.nextInt();
        int m = in.nextInt();
        int [][] arr = new int[n][m];
        int [] b = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            b[i] =0;
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
                if(b[i] < arr[i][j]){
                    b[i] = arr[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println("第"+(i+1)+"行的最大值："+b[i]);
            sum += b[i];
        }
        System.out.println("行最大值的和为："+sum);

         */
        //矩阵每列的最大值，和 -- 行进行 转置
        /*int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int [][]arr = new int[n][m];
        int [][]c = new int[m][n];
        int []b = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
                c[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            b[i] = 0;
            for(int j = 0; j < n; j++){
                if(b[i]<c[i][j]){
                    b[i] = c[i][j];
                }
            }
        }
        for(int i = 0; i < m; i++){
            System.out.println("第"+(i+1)+"列的最大值为："+b[i]);
            sum +=b[i];
        }
        System.out.println("列最大值的和为："+sum);

         */

        //输入9进制数，转换为十九进制数

    }
}
    //回文数 判断 类、方法
    /*private static class Reverse{
        boolean isPalindrome(int x){
            if( x < 0 || x!=0 && x % 10 == 0){
                return false;
            }
            int reverseNnumber = 0;
            while( x > reverseNnumber){
                reverseNnumber = reverseNnumber * 10 + x % 10;
                x = x / 10;
            }
            return x == reverseNnumber || x == reverseNnumber / 10;
        }
    }
    }

     */

    //字符串 空格 判断单词个数 类
    /*public static String getString() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入长度小于100的字符串");
        String str = buffer.readLine();
        while(str.length()>100){
            System.out.println("字符串长度超过100，请重新输入");
            String str1 = buffer.readLine();
            str = str1;
        }
        return str;
    }
}

     */