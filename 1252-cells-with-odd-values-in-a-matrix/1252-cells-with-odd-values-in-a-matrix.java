class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans=new int[m][n];
        int count=0;
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=indices[i][1];
            for(int j=0;j<n;j++){
                ans[row][j]+=1;
//                 if(j==n-1 && ans[row][j]%2!=0){
// count++;
//                 }
            }
            for(int j=0;j<m;j++){
                ans[j][col]+=1;
//                  if(j==m-1 && ans[j][col]%2!=0){
// count++;
//                 }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]%2!=0){
                    count++;
                }
            }
        }
        // System.out.println(Arrays.deepToString(ans));
        return count;
    }
}