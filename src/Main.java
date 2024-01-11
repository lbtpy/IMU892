import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //两个数之间的偶数和
        /*    int m = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for ( int i = m;  i <= n; i++ ){
            if ( i%2 == 0 ){
                sum+=i;
            }
        }
        System.out.println(sum);

     */

        //求e的值
        /*double item = 1; // 定义每一项的变量
        double e = 1; //求和变量
        int n = 1;
        while (item > 1e-6) { //最后一项值 小于，分之一 就大于
            e += item;
            n++;
            item = 1.0 / fact(n);
        }
        System.out.printf("e=%f", e);
    }
    private static double fact( double i ){
        double sum = 1;
        for( int m=1 ; m<= i; m++){
            sum *= m;
        }
        return sum;

         */

        //递归，逆序输出数字 -- 不换行逐个输出
        /*int number = in.nextInt();
        InverseNumber( number );
        }
        public static int InverseNumber( int i ){
            if( i< 10){
                System.out.print(i);
            }
            else{
                int m = i%10;
                System.out.print(m);
                int n = i/10;
                InverseNumber(n);
            }
            return i;

         */

        //变为字符串输出
        /*int number = in.nextInt();
        String a  = InverseNumber( number );
        System.out.print(a);
    }
        public static String InverseNumber( int i){
            String s = "";
            if( i<10 ) {
                return s+i;
            }
            else{
                return s+InverseNumber(i%10)+InverseNumber(i/10);
            }

         */


    }
}


