class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        if(mat.length%2!=0)
        {
          for(int i=0;i<mat.length;i++)
          {
           for(int j=i;j<=i;j++)
           {
             sum=sum+mat[i][j]+mat[i][mat.length-1-j];
           }
          }
            sum=sum-mat[mat.length/2][mat.length/2];
        }
        else
        {
         for(int i=0;i<mat.length;i++)
          {
           for(int j=i;j<=i;j++)
           {
             sum=sum+mat[i][j]+mat[i][mat.length-1-j];
           }
          }
        }
        return sum;
    }
}