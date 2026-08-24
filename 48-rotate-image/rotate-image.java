class Solution {
    public void rotate(int[][] matrix)
     {
//to rotate a matirx 90 degree on observing the i/p we can see that they have basically tranposed the matrix and thn they have reversed the every row .
        transpose(matrix);
        reverse(matrix);
        
    }
public static void transpose(int [][] matrix)
{
    int n=matrix.length;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++) //j=i+1 cuz after transpose the diagonal ele remian same so we take j=i+1 to avoid swap of same ele.
        {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    }
}
public static void reverse(int [][] matrix)
{
int n=matrix.length;
for(int i = 0; i < n; i++) {

        int left = 0;
        int right = n - 1;

        while(left < right) {

            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;

            left++;
            right--;
        }
    }
}
}