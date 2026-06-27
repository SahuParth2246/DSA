class Solution {
    public int findNumbers(int[] nums) {
        int output= 0;
        int count = 0;
        for(int num :nums){
            count = 0;
            while (num>0){
                num = num/10;
                count ++;
            }
            if(count %2 == 0){
                output++;
            }
        }
        return output;
        
    }
}