import java.util.Arrays;
public class triplesumclosest {

        public int threeSumClosest(int[] nums, int target) {
            int rsum =0;
            int diff = Integer.MAX_VALUE;
            Arrays.sort(nums);

            for(int fixed = 0; fixed<nums.length-2;fixed++){
                int start = fixed +1;
                int end = nums.length-1;
                while(start<end){
                    if(nums[fixed]+nums[start]+nums[end]==target){
                        return nums[fixed]+nums[start]+nums[end];
                    }
                    if(Math.abs(target - (nums[fixed] + nums[start] + nums[end]))<diff){
                        diff =Math.abs(target - (nums[fixed] + nums[start] + nums[end]));
                        rsum = nums[fixed]+nums[start]+nums[end];

                    }
                    if(nums[fixed]+nums[start]+nums[end]<target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
            return rsum;

        }

}
