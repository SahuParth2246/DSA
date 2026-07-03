class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        ArrayList <Integer> list = new ArrayList <>();
        int start = 0;
        int end = nums.length-k;
        while(start<end){
            int mid = start + (end-start)/2;
            if(x - nums[mid] > nums[mid + k] - x) start = mid + 1;
            else end = mid;
        }
        int index=start;
        while(index<start+k){
            list.add(nums[index]);
            index++;
        }
       
        return list;
        
    }
}