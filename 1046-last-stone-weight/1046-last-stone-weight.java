class Solution {
    public int lastStoneWeight(int[] nums) {
        PriorityQueue <Integer> heap = new PriorityQueue <> (Collections.reverseOrder());
        for(int i =0;i<nums.length;i++){
           heap.add(nums[i]);
        }
        while(!(heap.size()==1||heap.size()==0)){
            if(heap.size()==1)return heap.peek();
            int x = heap.poll();
            int y = heap.poll();
            if(x==y)continue;
            if(x!=y)heap.add(x-y);
        }
        if(heap.isEmpty())return 0;

        return heap.peek();

        
    }
}