import java.util.Scanner;

public class Main2017 {
    public static void main(String[] args) {
        //输入整数，输出最大值
        Scanner in = new Scanner(System.in);
        /*System.out.println("请输入数字的个数" );
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<= n;i++){
            System.out.println("请输入第"+ i + "个数字") ;
            int q = in.nextInt();
            if( q > max ){
                max = q;
            }
            else if (q < min) {
                min = q;
            }
        }
        System.out.println("最大值为"+max);
        System.out.println("最小值为"+min);

         */

        //输入两个数，并求他们的最大公约数和最小公倍数
        /*int m = in.nextInt();
        int n = in.nextInt();
        int max = (m>=n)? m:n;
        int min = (m<=n)? m:n;
        //最大公约数
        for(int i = min; i >= 1; i--){
            if( max%i == 0 && min%i ==0){
                System.out.println("最大公约数为" + i);
                break;
            }
        }
        //最大公倍数; 法二 = 两数的积 = 最大公约数 * 最小公倍数
        for (int i = max; i <= max * min; i++) {
            if (i%min ==0 && i%max == 0) {
                System.out.println("最大公倍数为" + i);
                break;
            }
        }

         */

        //输入两个数，求它们之间的素数
        /*int a = in.nextInt();
        int b = in.nextInt();
        primeGeneretor prime = new primeGeneretor();
        prime.setPrime(a,b);
        prime.getPrime();

         */

        //分式之和 = （2/1,3/2,5/3...）
        /*int d = in.nextInt(); //前d项和
        double x = 2;
        double y = 1;
        double sum = 0;
        double temp;
        for(int i = 1; i <= d; i++){
            sum += x/y;
            temp = x;
            x = x + y;
            y = temp;
        }
        System.out.println(sum);

         */


    }
}
        //素数的类
        /*class primeGeneretor{

        private int start;
        private int end;

        void setPrime(int a, int b){
           if(a>b){
               this.start = b;
               this.end = a;
           }
           else {
               this.start = a;
               this.end = b;
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

     */
