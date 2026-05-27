// LC 643 — Maximum Average Subarray I
// https://leetcode.com/problems/maximum-average-subarray-i/

public class maximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums1, 4)); // expected: 12.75

        int[] nums2 = {5};
        System.out.println(findMaxAverage(nums2, 1)); // expected: 5.0
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int low = 1; low <= nums.length - k; low++) {
            int high = low + k - 1;
            sum = sum + nums[high] - nums[low - 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum / k;
    }
}
