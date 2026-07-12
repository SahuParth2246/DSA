class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(nums);
        HashMap <Integer,Integer> map = new HashMap <>();
        int rank = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i-1]) rank++;
            map.putIfAbsent(nums[i], rank);
        }
        for(int i = 0;i<nums.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}