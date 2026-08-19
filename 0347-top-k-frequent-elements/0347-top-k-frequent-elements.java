class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            heap.offer(new int [] {num,count});
            if(heap.size()>k)heap.poll();

        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll()[0];
        }
        return result;

    }
}