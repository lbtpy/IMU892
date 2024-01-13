import java.util.Scanner;

public class Main2018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int a = InverseNumber(number);
            if (number == a) {
                System.out.println(number + "是回文数");
            }
            else {
                System.out.println(number + "不是回文数");
            }
    }
    public static int InverseNumber(int i){
        if(i < 10){
            return i;
        }
        else{
            int m = i%10;
            System.out.print(m);
            int n = i /10;
            InverseNumber(n);
            return i;
        }
    }
}
