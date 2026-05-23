import java.util.Arrays;
import java.util.ArrayList;
public class tripletsum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        ArrayList <Integer> y = new ArrayList <> ();
        int sum = 0;
        Arrays.sort(nums);
        for(int fixed = 0;fixed <nums.length-2;fixed++){
            if(fixed>0&&nums[fixed]==nums[fixed-1]){
                continue;
            }
            int start = fixed +1;
            int end = nums.length-1;
            while(end>start){
                sum = nums[fixed]+nums[start]+nums[end];
                if(sum==0){
                    y.add(nums[fixed]);
                    y.add(nums[start]);
                    y.add(nums[end]);
                    x.add(new ArrayList(y));
                    y.clear();
                    while(start<end&&nums[start]==nums[start+1])start++;
                    while(start<end&&nums[end]==nums[end-1])end--;
                    start++;
                    end--;
                }else if (sum>0){
                    end--;
                }else{
                    start++;
                }

            }

        }
        return x;

    }
}