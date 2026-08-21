class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        if (n == 0)
            return 0;

        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < n - 1; i++) {

            // Duplicate element
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            // Consecutive element
            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            }

            // Gap found
            else {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}