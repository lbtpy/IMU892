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
        /*String s = in.nextLine();
        int n = to10(s);
        System.out.println(to19(n));

         */

        //班级学生，姓名，出生年月，排序
        /*putName();
    }

         */
        /*public static void putName(){
        String []s1 = new String[2];
        String str = "";
        String regex1 = "\\s";
        List<Student> list = new ArrayList();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("请输入");
            str = in.nextLine();
            s1 = str.split(regex1);
            list.add(new Student(s1[0],getDate(s1[1])));
        }
        System.out.println("ss");
        for(int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){
                if(list.get(i).date > list.get(j).date){
                    Student tmp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,tmp);
                }
            }
        }
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i).name+" ");
        }
    }
    public static Integer getDate(String s2){
        String regex = "\\D+";
        String str = "";
        String []arr = s2.split(regex);
        for (int i =0; i < arr.length; i++){
            str = str + arr[i];
        }
        return Integer.parseInt(str);

     */

        //蛇形方阵
        /*int n = in.nextInt();
        int [][]arr = new int[n][n];
        int i = 0;
        int j = 0;
        int p = 1;
        int line = 0;
        while(p <= n){
            if( line%2 == 0) {
                i = line;
                j = 0;
                while (i >= 0 && p <= n) {
                    arr[i--][j++] = p++;
                }
                line ++;
            }else {
                j = line;
                i = 0;
                while(j>=0&&p<=n){
                    arr[i++][j--] = p++;
                }
                line ++;
            }
        }
        for (int w = 0; w < arr.length; w++){
            for (int m = 0; m < arr.length; m++){
                if(arr[w][m]!=0){
                    System.out.print(arr[w][m]+" ");
                }
            }
            System.out.println();
        }

         */

        //输入一组百分制分数，等级判断
        /*int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            switch (arr[i]/10) {
                case 10:
                case 9:
                    System.out.println("成绩为A");
                    break;
                case 8:
                    System.out.println("成绩为B");
                    break;
                case 7:
                    System.out.println("成绩为c");
                    break;
                case 6:
                    System.out.println("成绩为d");
                    break;
                default:
                    System.out.println("成绩等级为E");
                    break;
            }
        }

         */

        //输入一组数，将其中的奇数，逆序输出，例如：1 2 3 4 5 7. 7 5 3 1
        /*int n = in.nextInt();
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

         */

        //输入两个数，作为区间，输出区间内整数 任意位 含3 的整数
        /*putContain3(39,49);
        }
         */

        //输入十个数，计算其中最大数并计算平均数
        /*int n = in.nextInt();
        int[] arr = new int[n];
        int count = 0;
        double sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            count++;
            sum += arr[i];
        }
        System.out.println("平均数=" + (double)(sum / count));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[j];
                }

            }
        }
        System.out.println("最大值为" + max);

         */

        //斐波那契数列：1,1,2,3,5,8,13……,前n项数列之和
        /*int n = in.nextInt();
        int sum = 0;
        for(int i=1;i<=n; i++) {
            System.out.println("第"+i+"个的值为"+Sum(i));
            sum+=Sum(i);
        }
        System.out.println("和为"+sum);
    }

         */

        //杨辉三角等腰
        /*int n = in.nextInt();//行数
        int [][]arr = new int[n][n];
        for(int i = 0; i< arr.length;i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //等腰输出
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr.length- 1 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

         */

        //输出a到b之间 素数 的回文数
        PrimeNumberAndHw prime = new PrimeNumberAndHw();
        int a = in.nextInt();
        int b = in.nextInt();
        prime.setPrime(a,b);
        prime.getPrime();
        String []str = new String[];
//        for(int i = a; i <= b; i++){
//
//        }
    }
}
    //回文数 判断 类、方法
    /*private static class Reverse{
        boolean isPalindrome(int x){
            if( x < 0 || x!=0 && x % 10 == 0){
                return false;
            }
            int reverseNnumber = 0;
            while( x > reverseNnumber){ //对数取逆，剩下数小于取出的时，剩下的至多2位不用比较了
                reverseNnumber = reverseNnumber * 10 + x % 10;
                x = x / 10;
            }
            return x == reverseNnumber || x == reverseNnumber / 10; //对剩下的进行判断，如果符合回文数，则正确，反之不然
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

    //输入9进制数，转换为十九进制数
    /*public static int to10(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res *= 9;
            res+=s.charAt(i)-'0'; //转为int
        }
        return res;
    }
    public static char tochar(int x){// 转换为char
        if( x<= 9){
            return (char)('0'+x);
        }
        else {
            return (char)('a'+x-10);
        }
    }
    public static String to19(int n){
        String res ="";//拼接
        while(n!=0){
            res = tochar(n%19)+res;
            n = n/19;
        }
        return res;
    }

}

     */

    //班级学生，姓名，出生年月，排序
    /*class Student{
        String name;
        Integer date;
        public Student(String name,Integer date){
            super();
            this.name = name;
            this.date = date;
        }
    }

     */

    //输入两个数，作为区间，输出区间内整数 任意位 含3 的整数
    /*public static void putContain3(int a, int b){
        int []arr = new int[b-a];
        int p = 0;
        for (int i = a; i <= b; i++){
            String str = ""+i;
            if(str.contains("3")){
                arr[p++] = i;
            }
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

     */

    //斐波那契数列
    /*public static long Sum(int n){
        if(n==1 || n==2){
            return 1;
        }
        else {
            return Sum(n-1)+Sum(n-2);
        }
    }
}

     */

    //输出a到b之间 素数 的回文数
    class PrimeNumberAndHw {
        private int start;
        private int end;

        boolean isPrime(int x) { //判断是否是素数
            if (x == 1) {
                return false;
            }
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
        void setPrime(int a, int b){ //设置区间
            if( a > b ){
                this.start = b;
                this.end = a;
            }
            else {
                this.start = a;
                this.end = b;
            }
        }
        String  getPrime() { //找出区间内的素数
            for(int i = start; i <= end; i++ ) {
                if (isPrime(i)) {
//                    return PrimeNumberAndHw.toString();
                }
            }
            return null;
        }


    }
