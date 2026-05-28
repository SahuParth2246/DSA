// LC 2090 — K Radius Subarray Averages
// https://leetcode.com/problems/k-radius-subarray-averages/

public class kRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] nums1 = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        System.out.println(java.util.Arrays.toString(getAverages(nums1, 3))); // expected: [-1,-1,-1,5,4,4,-1,-1,-1]

        int[] nums2 = {100000};
        System.out.println(java.util.Arrays.toString(getAverages(nums2, 0))); // expected: [100000]
    }

    public static int[] getAverages(int[] nums, int k) {
        int[] res = new int[nums.length];
        if (nums.length < 2 * k + 1) {
            for (int i = 0; i < nums.length; i++) {
                res[i] = -1;
            }
            return res;
        }
        for (int i = 0; i < k; i++) {
            res[i] = -1;
        }
        long sum = 0;
        for (int i = 0; i < 2 * k + 1; i++) {
            sum += nums[i];
        }
        res[k] = (int) (sum / (2 * k + 1));
        for (int low = 1; low < nums.length - 2 * k; low++) {
            int high = 2 * k + low;
            sum += nums[high] - nums[low - 1];
            res[k + low] = (int) (sum / (2 * k + 1));
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            res[i] = -1;
        }
        return res;
    }
}