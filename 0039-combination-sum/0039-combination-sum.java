class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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

        // not taking in cause it's my choice bitch
        solve(nums, target, index + 1, currSum, list, curr);

        // taking in all of the juice, stay at same index to reuse
        curr.add(nums[index]);
        solve(nums, target, index, currSum + nums[index], list, curr);
        curr.remove(curr.size() - 1); // put it back like it never happened
    }
}