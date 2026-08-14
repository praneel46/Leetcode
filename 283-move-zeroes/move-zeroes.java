class Solution {
    public void moveZeroes(int[] a) {
        int n=a.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }   
        }
    }
}