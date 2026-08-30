class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int count = set.size();
        int low = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int high = 0; high < nums.length; high++) {
            map.put(nums[high], map.getOrDefault(nums[high], 0) + 1);
            while(map.size() == count){  
                map.put(nums[low], map.get(nums[low]) - 1);
                if(map.get(nums[low]) == 0) map.remove(nums[low]);
                low++;
            }
            ans += low;
        }
        return ans;
    }
}