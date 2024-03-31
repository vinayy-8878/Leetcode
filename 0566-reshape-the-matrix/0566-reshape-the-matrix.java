class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r*c) !=(mat.length*mat[0].length)){
            return mat;
        }
        if(r==mat.length && c==mat[0].length) return mat;
    int[][] ans=new int[r][c];
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[row][col]=mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col=0;
                }
            }
        }
    return ans;
    }
}