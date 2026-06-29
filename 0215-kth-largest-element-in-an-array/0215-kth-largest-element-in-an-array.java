class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> heap = new PriorityQueue <> (Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            heap.add(nums[i]);
        }
        int ans= 0;
        for(int i = k ; i>0;i--){
            ans = heap.poll();
        }
        return ans;
        
    }
}