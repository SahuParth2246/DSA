class Solution {
    public int largestRectangleArea(int[] nums) {
        Deque <Integer> stack = new ArrayDeque <> ();
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                int height = nums[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max =Math.max(max,height * width);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int height = nums[stack.pop()];
            int width = stack.isEmpty() ? nums.length : nums.length - stack.peek() - 1;
            max = Math.max(max, height * width);
        }

        
        return max;
        
    }
}