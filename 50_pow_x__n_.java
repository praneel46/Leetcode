class Solution {
    public double myPow(double x, int n)
     {
        long N=n;
      double  result = Integer.MIN_VALUE;
        if(n<0)
        {
            result= 1/(Math.pow(x,-(N)));

        }
        else
        {
             result=Math.pow(x,N);
        }
        return result;
    }
}