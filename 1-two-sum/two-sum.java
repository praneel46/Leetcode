class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        int left = 0;
        int right = n - 1;

        int[][] arr = new int[n][2];

        // Store value + original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort according to value
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        while (left < right) {

            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[]{
                    arr[left][1],
                    arr[right][1]
                };
            }

            if (sum > target) {
                right--;
            } 
            else {
                left++;
            }
        }

        return new int[]{};
    }
}