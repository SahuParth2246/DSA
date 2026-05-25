import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int [] nums = {5,4,3,2,1};
        nums = merge1(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int [] merge1  (int [] num ) {
        if (num.length == 1) {
            return num;
        }
        int mid = num.length/2;

        int [] left = merge1(Arrays.copyOfRange(num,0,mid));
        int [] right = merge1(Arrays.copyOfRange(num,mid,num.length));


        return merge2(left,right);

    }
    static int [] merge2 (int [] left , int [] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mix = new int[left.length + right.length];
        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;

        //for the remaining ones as both of them can be remained
        }
        while(i<left.length){
            mix[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            mix[k]=right[j];
            k++;
            j++;
        }
        return mix;
    }




}
