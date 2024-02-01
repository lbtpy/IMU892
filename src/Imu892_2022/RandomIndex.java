package Imu892_2022;

import java.util.Arrays;
import java.util.Random;

//根据权重生成随机下标
//设数组 www 的权重之和为 total
// 根据题目的要求，我们可以看成将 [1,total]范围内的所有整数分成 n 个部分
// （其中 n 是数组 w的长度），第 i 个部分恰好包含 w[i]个整数，并且这 n 个部分两两的交集为空。
// 随后我们在 [1,total]范围内随机选择一个整数 x
// 如果整数 x 被包含在第 i 个部分内，我们就返回 i
public class RandomIndex {
    static int[] pre;
    static int total;
    public  RandomIndex(int[] w) {
        pre = new int[w.length];
        pre[0] = w[0];
        for (int i = 1; i < w.length; ++i) {
            pre[i] = pre[i - 1] + w[i];
        }
        total = Arrays.stream(w).sum();
    }
    public static void entrance(){
        pickIndex();
        pickIndexTwo();
    }
    public static int pickIndex() {
        int x = (int) (Math.random() * total) + 1;
        return binarySearch(x);
    }

    private static int binarySearch(int x) {
        int low = 0, high = pre.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (pre[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static Random random = new Random();
    private static int[] preSum;

    public static void Solution(int[] w) {
        preSum = new int[w.length];
        preSum[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            preSum[i] = preSum[i - 1] + w[i];
        }
    }

    public static int pickIndexTwo() {
        int max = preSum[preSum.length - 1];
        int rand = random.nextInt(max) + 1;
        return binarySearch(preSum, rand);
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // 考虑等于的情况，去掉等号过不了所有用例
            if (target <= nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
