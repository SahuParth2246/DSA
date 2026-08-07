class Solution {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>());
        return result;
    }

    void backtrack(int[] nums, List<Integer> current) {
        // BASE CASE
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // copy, not reference!
            return;
        }

        // LOOP from 0 every time
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;          // skip already used

            used[i] = true;                 // choose
            current.add(nums[i]);

            backtrack(nums, current);       // explore

            used[i] = false;                // unchoose (backtrack)
            current.remove(current.size() - 1);
        }
    }
}