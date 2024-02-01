package Imu892_2020;

// 奇数 排序
public class SortOddsNumber {
    public static void entrance(){
        sortOddsNumber();
    }
    public static void sortOddsNumber() {
        int[] arr = {1,7,2,3,5,4};
        int p = 0;
        int[] b = new int[arr.length];
        //将奇数存入数组
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                b[p++] = arr[i];
            }
        }
        //对奇数组排序
        for(int i =0; i< b.length; i++){
            for(int j = i+1; j<b.length; j++) {
                if (b[i] < b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        //输出
        for(int i =0; i<b.length; i++){
            if(b[i]!=0){
                System.out.print(b[i]);
            }
        }
    }
}
