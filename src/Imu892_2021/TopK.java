package Imu892_2021;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TopK {
    public static void entrance(Scanner in){
        findKthLargest(in);
    }
    public static int findKthLargest(Scanner in) {
        int[] _nums = {3,2,1,5,6,4};
        int n = _nums.length;
        int k = 2;
        return quickselect(_nums, 0, n - 1, n - k);
    }
    public static int quickselect(int[] nums, int left, int right, int k) {
        if (left == right)  return nums[k];
        int x = nums[left], i = left - 1, j = right + 1;
        while (i < j) {
            do i++; while (nums[i] < x);
            do j--; while (nums[j] > x);
            if (i < j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        if (k <= j) return quickselect(nums, left, j, k);
        else return quickselect(nums, j + 1, right, k);
    }
}
