import java.util.Arrays;
import java.util.Scanner;

public class Main2016 {
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

        //递归，逆序输出整数 -- 不换行 逐个输出
        /*int number = in.nextInt();
        InverseNumber( number );
        }
        public static void InverseNumber( int i ){
            if( i< 10){
                System.out.print(i);
            }
            else{
                int m = i%10;
                System.out.print(m);
                int n = i/10;
                InverseNumber(n);
            }

         */

        //变为字符串 逆序输出整数
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

        //字符串中，提取 连续数字 的整数 个数
        /*String str = in.next();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int count =0;
        while(matcher.find()) {
            String string = matcher.group();
            count++;
            System.out.print(string+" ");
        }
        System.out.println("个数="+count);



        //杨辉三角 直角
        /*int n = in.nextInt(); //行
        int[][] number = new int[n][n];
        for( int i = 0 ; i < n ; i++ ) {
            for( int j = 0; j <= i; j++ ) {
                if( j==0 || i==j ){
                    number[i][j] = 1;
                }
                else{
                    number[i][j] = number[i-1][j-1]+number[i-1][j];
                }
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

         */

        //矩阵处理，m * n ,每行元素按升序排列
        //法一 : 二维数组，冒泡排序
        /*int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        //输入矩阵数据
        for( int i =0; i< n; i++ ) {
            for( int j =0; j< m; j++ ) {
                arr [i][j] = in.nextInt();
            }
        }
        //升序排序
        for( int i =0; i< n; i++ ){ //行循环
            for ( int j = 0; j < m; j++) { //每行循环的次数
                for ( int z = 0; z < m-j-1; z++) { //每列的元素位置
                    if( arr[i][z] > arr[i][z+1]) {
                        int temp = arr[i][z];
                        arr[i][z] = arr[i][z + 1];
                        arr[i][z + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }

         */

        //法二 : Arrays.sort() 排序
        /*int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("输入排序前的矩阵");
        for(int i  = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i =0; i < arr.length; i++){
            Arrays.sort(arr[i]);
        }

        System.out.println("排序后的矩阵");
        for(int i  = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

         */
    }
}


