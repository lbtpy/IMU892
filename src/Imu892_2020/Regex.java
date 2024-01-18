package Imu892_2020;

public class Regex {
    public static void main(String[] args) {
        compute("40/39");
    }
    public static void compute(String s){
        String regex = "\\D";
        String[] arr = s.split(regex);
        int a1 = Integer.parseInt(arr[0]);
        int b1 = Integer.parseInt(arr[1]);
        if(s.contains("+")){
            System.out.print(a1+b1);
        }
        if(s.contains("-")){
            System.out.print(a1-b1);
        }
        if(s.contains("*")){
            System.out.print(a1*b1);
        }
        if(s.contains("/")){
            System.out.print(a1/b1);
        }
    }
}
