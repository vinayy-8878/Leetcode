class Solution {
    public int[][] generateMatrix(int n) {
       

        int[][] matrix=new int[n][n];
     

        int element=1;
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int dir=0;
        while(element<=n*n){
             if(dir==0){
               for(int i=left;i<=right;i++){
               matrix[top][i]=element++;
               }
                dir=1;
                top++;
            }
            else if(dir==1){
               for(int i=top;i<=bottom;i++){
                matrix[i][right]=element++;
               }
                dir=2;
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                matrix[bottom][i]=element++;
               }
                dir=3;
                bottom--;
            }
            else if(dir==3){
                for(int i=bottom;i>=top;i--){
               matrix[i][left]=element++;
               }
                dir=0;
                left++;
            }
        }
        return matrix;
    }
}