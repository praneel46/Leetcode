class Solution {
    public void nextPermutation(int[] nums) 
    {
        int n=nums.length;
        int breakpoint=-1;
        for(int i=n-2;i>=0;i--)  //n-2 cuz it is min point where we can get Break point so we traverse from backside .
        {
            if(nums[i]<nums[i+1])
            {
                breakpoint=i;
                break;
            }
        }
            if(breakpoint==-1)
            {
                reverse(nums,0,n-1);
                return ;
            }
        

//now we have got the BP and hence we have to find a element from the array to  breakpoint where we must find the ele > breakpoint but it must be smallest among the remaining element 

for(int i=n-1;i>breakpoint;i--)
{
    if(nums[i]>nums[breakpoint])
    {
        int temp=nums[i];
        nums[i]=nums[breakpoint];;
        nums[breakpoint]=temp;
        break;
    }
}
 reverse(nums, breakpoint + 1, n- 1);    
        
    }

private static void reverse(int[] nums, int start , int end )
{
    while(start<end)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
}
}
