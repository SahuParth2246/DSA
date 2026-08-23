class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //bascially the question can be solved by taking the answer in and not taking the answer in
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums,0,list,curr);
        return list;
    }
    public void solve(int []nums,int index,List<List<Integer>> list ,List<Integer> curr ){
        list.add(new ArrayList<>(curr));

        for(int i = index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1])continue;
            curr.add(nums[i]);
            solve(nums,i+1,list,curr);
            curr.remove(curr.size()-1);
            
        }
    }
}