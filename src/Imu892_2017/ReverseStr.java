package Imu892_2017;

//逆序输出字符串
public class ReverseStr {
    public static void entrance(){
        reverseStr();
    }
    public static void reverseStr() {
        String str = "abcd.";
        reverse(str,0);
    }
    public static void reverse(String str, int length){
        if(str.charAt(length) == '.'){ //递归退出条件
            return ;
        }
        reverse(str,++length); //先自加，否则就栈溢出
        System.out.print(str.charAt(--length));
    }
}
