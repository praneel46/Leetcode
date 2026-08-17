class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int candidate = 0;
        int votes = 0;

        // Find candidate
        for (int i = 0; i < n; i++) {

            if (votes == 0) {
                candidate = nums[i];
                votes = 1;
            }
            else if (candidate == nums[i]) {
                votes++;
            }
            else {
                votes--;
            }
        }

        // Verify candidate
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }

        return -1;
    }
}