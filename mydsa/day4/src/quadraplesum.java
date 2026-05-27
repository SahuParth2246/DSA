import java.util.Arrays;
import java.util.ArrayList;
public class quadraplesum {
    public static void main(String[] args) {
        int [] nums = {100,200,300,400,500,600};
        int target = 1500;
        ArrayList<ArrayList<Integer>> foursum = new ArrayList<>();
        foursum = fourSum(nums,target);
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {

        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        ArrayList <Integer> y = new ArrayList <> ();
        long sum = 0;
        Arrays.sort(nums);

        for(int fixed = 0;fixed <nums.length-1;fixed++){
            if(fixed>0&&nums[fixed]==nums[fixed-1]){
                continue;
            }




            for(int fixed2  = fixed+1;fixed2<nums.length-2;fixed2++){
                if(fixed2 > fixed+1 && nums[fixed2] == nums[fixed2-1]) continue;
                int low = fixed2 +1;
                int high = nums.length-1;
                while(high>low){
                    sum =(long) nums[fixed]+nums[fixed2]+nums[low]+nums[high];
                    if(sum==target){
                        y.add(nums[fixed]);
                        y.add(nums[fixed2]);
                        y.add(nums[low]);
                        y.add(nums[high]);
                        x.add(new ArrayList(y));
                        y.clear();
                        while(low<high&&nums[low]==nums[low+1])low++;
                        while(low<high&&nums[high]==nums[high-1])high--;
                        low++;
                        high--;
                    }else if (sum>target){
                        high--;
                    }else{
                        low++;
                    }

                }

            }

        }
        return x;

    }



}
