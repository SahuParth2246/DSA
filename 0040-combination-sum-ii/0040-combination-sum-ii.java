class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        solve(candidates, target, 0, 0, list, new ArrayList<>());
        return list;
    }

    public void solve(int[] nums, int target, int index, int currSum, List<List<Integer>> list, ArrayList<Integer> curr) {
        // nailed it, add to list and get out
        if (currSum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }
        // ran out of options or went too far, not my problem anymore
        if (index == nums.length || currSum > target) return;

       for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i-1]) continue; // skip dupes
            curr.add(nums[i]);
            solve(nums, target, i + 1, currSum + nums[i], list, curr);
            curr.remove(curr.size() - 1);
        }
    }

}