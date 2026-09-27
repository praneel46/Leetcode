class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = firstPOS(nums, target);
        int last = lastPOS(nums, target);

        return new int[]{first, last};
    }

    public int firstPOS(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;     // search left
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public int lastPOS(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;      // search right
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}