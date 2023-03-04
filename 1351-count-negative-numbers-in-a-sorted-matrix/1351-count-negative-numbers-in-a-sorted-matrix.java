class Solution {
    public int countNegatives(int[][] grid) {
        int cNeg=0;
        for(int i=0;i<grid.length;i++){
            int start=0;
            int end=grid[i].length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(grid[i][mid]<0){
                    if(mid>0 && grid[i][mid-1]<0){
                        end=mid-1;
                    }
                    else {
                        cNeg = cNeg + grid[i].length - mid;
                        break;
                    }

                }
                else
                    start=mid+1;
            }
           // ans=ans+cNeg;
        }
        return cNeg;
    }
}