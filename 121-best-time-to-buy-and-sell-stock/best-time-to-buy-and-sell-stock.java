class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
         int currentprofit=0;
        int profit=0;
        int buy=nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<buy)
            {
                buy=nums[i];
                
            }
            currentprofit=nums[i]-buy;
            if(currentprofit>profit)
            {
                profit=currentprofit;
            }
            
        }
        return profit;

    }
}