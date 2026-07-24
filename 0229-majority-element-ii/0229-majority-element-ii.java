class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int prev = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                count++;
            } else {
                if (count > nums.length / 3) {
                    list.add(prev);
                }
                prev = nums[i];
                count = 1;
            }
        }

        if (count > nums.length / 3) {
            list.add(prev);
        }

        return list;
    }
}