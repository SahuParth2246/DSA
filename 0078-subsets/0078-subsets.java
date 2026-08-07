class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr  = new ArrayList<>();
        int i = 0;
        subsets(nums,i,curr,list);
        return list;
    }

    public void subsets(int [] nums , int i ,List<Integer> current , List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        //exclude karna hai 
        subsets(nums,i+1,current,result);
        //inclde karke same level pe remove karna hai 
        current.add(nums[i]);
        subsets(nums,i+1,current,result);
        current.remove(current.size()-1);
    } 
}