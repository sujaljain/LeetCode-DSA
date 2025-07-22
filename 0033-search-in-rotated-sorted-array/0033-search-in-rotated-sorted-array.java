class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) return mid;

            // Check if left part is sorted
            if (nums[s] <= nums[mid]) {
                // Check if target lies in the left sorted part
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;    // For sure left
                } else {
                    s = mid + 1;    // Otherwise right
                }
            }
            // Otherwise, right part
            else {
                if (target > nums[mid] && target <= nums[e]) {
                    s = mid + 1;    // For sure target is in right part
                } else {
                    e = mid - 1;    // Otherwise, left
                }
            }
        }

        return -1;
    }
}