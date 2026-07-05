class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] ans = new int [m+n];
        int one = 0;
        int two = 0;
        int index = 0;
        while(one<m && two<n){
            if(nums1[one]<=nums2[two]){
                ans[index]=nums1[one];
                one++;
            }else{
                ans[index]=nums2[two];
                two++;
            }
            index++;
        }
        while(two<n){
            ans[index]=nums2[two];
            index++;
            two++;
        }
        while(one<m){
            ans[index]=nums1[one];
            index++;
            one++;
        }
        if(ans.length%2==0){
            return (float)(((float)ans[ans.length/2-1]+(float)ans[ans.length/2])/2);

        }
        return (float)ans[ans.length/2];
        
    }
}