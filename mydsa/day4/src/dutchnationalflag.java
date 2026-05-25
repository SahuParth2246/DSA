import java.util.Arrays;
import java.util.Random;
public class dutchnationalflag {
    public static void main(String[] args) {
        int [] nums = new int[8];
        Random rd = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i]= rd.nextInt(0,3);

        }
        System.out.println("The Colors Before Sorting:" + Arrays.toString(nums));
        sortColors(nums);

    }


    public static void sortColors(int[] nums) {
        int low = 0;
        int mid  = 0;
        int high = nums.length-1;

        while(high>=mid){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;


            }else if(nums[mid]==2){
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }else{
                mid++;
            }
        }
        System.out.println("The Colors after Sorting:"+Arrays.toString(nums));



    }

}
