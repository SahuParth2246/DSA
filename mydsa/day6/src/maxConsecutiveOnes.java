public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 1;
        System.out.println(maxConsecutiveOnes(nums, k));
    }

    public static int maxConsecutiveOnes(int[] nums, int k) {
        int low = 0, res = 0, zeros = 0;
        for (int high = 0; high < nums.length; high++) {
            if (nums[high] == 0) zeros++;
            while (zeros > k) {
                if (nums[low] == 0) zeros--;
                low++;
            }
            res = Math.max(res, high - low + 1);
        }
        return res;
    }
}