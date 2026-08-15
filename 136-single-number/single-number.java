class Solution {
    public int singleNumber(int[] a)
     {
        int n=a.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=c^a[i];
    

        }
        return c;
    }
}