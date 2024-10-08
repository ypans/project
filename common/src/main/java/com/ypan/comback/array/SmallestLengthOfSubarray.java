package com.ypan.comback.array;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0。
 *
 * 示例：
 *
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 */
public class SmallestLengthOfSubarray {
    public static void main(String[] args) {

    }

    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int slow = 0;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minIndex = Math.min(minIndex, i - slow + 1);
                sum -= nums[slow++];
            }
        }
        return minIndex != Integer.MAX_VALUE ? minIndex : 0;

    }

}
