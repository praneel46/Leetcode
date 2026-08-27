class Solution {
    public List<Integer> generateRow(int row)
    {
        List<Integer> ansROW = new ArrayList<>();
        long val=1;
        ansROW.add(1);
        for(int col=1;col<row;col++)
        {
            val=val*(row-col);
            val=val/col;
            ansROW.add((int) val);
        }
        return ansROW;

    }
    public List<List<Integer>> generate(int N)
     {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=1;i<=N;i++)
        {
            pascal.add(generateRow(i));
        }
        return pascal;


        
    }
}