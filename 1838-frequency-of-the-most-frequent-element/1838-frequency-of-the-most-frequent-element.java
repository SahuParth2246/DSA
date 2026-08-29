class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0;
        long sum = 0;
        int ans = 0;
        for(int high = 0; high < nums.length; high++){
            sum += nums[high];
            while((long)nums[high] * (high - low + 1) - sum > k){
                sum -= nums[low];
                low++;
            }
            ans = Math.max(ans, high - low + 1);
        }
        return ans;
    }
}