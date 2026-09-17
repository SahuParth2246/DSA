class Solution {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        solve(nums, target, 0, 0);
        return count;
    }

    public void solve(int[] nums, int target, int index, int current) {
        if (index == nums.length) {
            if (current == target) count++;
            return;
        }
        solve(nums, target, index + 1, current + nums[index]);
        solve(nums, target, index + 1, current - nums[index]);
    }
}