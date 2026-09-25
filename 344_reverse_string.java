class Solution {
    public void reverseString(char[] s)

     {
        int n=s.length;
     
        reverse(s,0,n-1);

    }
    public static void reverse(char[] s , int left, int right)
        {
        while(left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            right--;
            left++;
        }
        }
}