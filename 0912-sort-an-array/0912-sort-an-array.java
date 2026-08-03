class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        quicksort(nums,low,high);
        return nums;
    }
    public void quicksort(int [] nums,int low,int high){
        if(low>=high)return;
        int pivot = nums[low+(high-low)/2];
        int end = high;
        int start = low;
        while(start<=end){
            while(nums[start]<pivot)start++;
            while(nums[end]>pivot)end--;
            if(start <=end){
                int temp = nums[end];
                nums[end]= nums[start];
                nums[start]=temp;
                start++;
                end--;

            }

        }
        quicksort(nums,low,end);
        quicksort(nums,start,high);
    }
}