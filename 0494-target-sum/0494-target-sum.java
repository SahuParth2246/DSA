class Solution {
    Map<String, Integer> memo = new HashMap<>();

    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    public int solve(int[] nums, int target, int index, int current) {
        if (index == nums.length) {
            return current == target ? 1 : 0;
        }

        String key = index + "," + current;  
        if (memo.containsKey(key)) return memo.get(key);

        int result = solve(nums, target, index + 1, current + nums[index])
                   + solve(nums, target, index + 1, current - nums[index]);

        memo.put(key, result);
        return result;
    }
}