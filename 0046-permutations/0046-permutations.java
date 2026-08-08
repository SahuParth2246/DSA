class Solution {
    List<List<Integer>> result = new ArrayList<>();
    boolean [] used ;

    public List<List<Integer>> permute(int[]nums){
        Arrays.sort(nums);
        used = new boolean [nums.length];
        backtrack(nums,new ArrayList<>());
        return result;

    }
    public void backtrack (int [] nums ,List <Integer> current){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(used[i])continue;
            used[i]=true;
            current.add(nums[i]);
            backtrack(nums,current);
            used[i] = false;
            current.remove(current.size()-1);
        }
    }
}