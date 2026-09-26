class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]!=arr1[j])
                {
                    return false;
                }
            }
        }
        return true ;
    }
}