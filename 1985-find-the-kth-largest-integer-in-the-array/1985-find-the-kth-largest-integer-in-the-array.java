import java.math.BigInteger; 
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(new BigInteger(nums[i])); 
            while (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.size() < k ? "" : heap.poll().toString();
    }
}