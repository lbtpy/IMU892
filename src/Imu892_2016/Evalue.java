package Imu892_2016;

//求e的值
public class Evalue {
    public static void main(String[] args) {
        double item = 1; // 定义每一项的变量
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
    }
}
