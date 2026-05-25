import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
        int [] nums = {5,4,3,2,1};
        bubble(nums);
        selection(nums);

    }
    static void bubble(int [] nums){

        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1]= nums[j];
                    nums[j]=temp;
                    swapped = true;

                }



            }
            if(!swapped){
                break;
            }

        }
        System.out.print(Arrays.toString(nums));
    }
    static void selection (int [] nums){

        for (int i = 0; i < nums.length-1; i++) {
            int max = max(nums,nums.length - i - 1);
            if(max == nums.length-i){
                continue;
            }

            int temp = nums[nums.length-i-1];
            nums[nums.length-i-1] = nums[max];
            nums[max]= temp;


        }
        System.out.print(Arrays.toString(nums));
    }
    static int max(int [] nums,int end ){
        int max = Integer.MIN_VALUE;
        int maxindex = 0;
        for (int i = 0; i <= end ; i++) {
            if (nums[i]>max){
                max = nums[i];
                maxindex = i;
            }

        }
        return maxindex;

    }
}

