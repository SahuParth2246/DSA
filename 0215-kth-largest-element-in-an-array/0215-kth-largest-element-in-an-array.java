class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> heap = new PriorityQueue <> ();
        for(int i = 0;i<nums.length;i++){
            if(heap.size()==0){
                heap.add(nums[i]);
                continue;
            }
            int top = heap.peek();
            if(top<=nums[i]|| heap.size()<k)heap.add(nums[i]);
            while(heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
        
    }
}