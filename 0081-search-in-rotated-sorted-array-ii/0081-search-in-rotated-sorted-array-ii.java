class Solution {

    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }

        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1) != -1;
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
    }

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;

            // Case 2
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;

            // Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {

                // Is start the pivot?
                if (start < end && nums[start] > nums[start + 1])
                    return start;
                start++;

                // Is end-1 the pivot?
                if (end > start && nums[end - 1] > nums[end])
                    return end - 1;
                end--;
            }

            // Left side sorted
            else if (nums[start] < nums[mid] ||
                    (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }

            // Right side sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }
}