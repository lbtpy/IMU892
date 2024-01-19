package Imu892_2017;

public class MergeSeriesNumber {
    public static void main(String[] args) {
        int []arr1={99,77,66,44,12,3};
        int []arr2={126,120,68,62,84,12,1};
        congrate(arr1, arr2);
    }
    public static void congrate(int arr1[],int arr2[]){
        int k=0,j=0;
        int[] arr=new int[arr1.length+arr2.length];
        for(int i=0;i<arr.length;i++){
            if(j<arr1.length&&k<arr2.length){
                if(arr1[j]>=arr2[k]){
                    arr[i]=arr1[j];
                    j++;
                }else{
                    arr[i]=arr2[k];
                    k++;
                }
            }else if(j<arr1.length){
                arr[i]=arr1[j];
                j++;
            }else{
                arr[i]=arr2[k];
                k++;
            }
        }
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
