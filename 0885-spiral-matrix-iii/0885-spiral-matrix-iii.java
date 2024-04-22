class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans= new int[rows*cols][2];
        int k=0;
        int rEnd=rStart+1;
        int cEnd=cStart+1;
        while(true){
            //-------->left traversal
          for(int i=cStart;i<=cEnd;i++){
              if(i>=0 && i< cols && rStart>=0)
             { ans[k][0]=rStart;
              ans[k][1]=i;
              k++;}
          }
            cStart--;
            cEnd++;
            if(k==ans.length){
                break;
            }
            
            //------->down traversal
            for(int i=rStart+1;i<=rEnd;i++){
                if(i>=0 && i< rows && cEnd-1<cols){
                    ans[k][0]=i;
              ans[k][1]=cEnd-1;
              k++;}
                }
            rStart--;
            rEnd++;
            if(k==ans.length){
                break;
            }
            
        //----->Left traversal
        for(int i=cEnd-2;i>=cStart;i--){
            if(i>=0 && i<cols && rEnd-1<rows){
                 ans[k][0]=rEnd-1;
                 ans[k][1]=i;
                 k++;
            }
            
            
        }
             if(k==ans.length){
                break;
            }
            
            
            
            
            //--------->up traversal
            
            for(int i=rEnd-2;i>rStart;i--){
                if(i>=0 && i< rows && cStart>=0){
                    ans[k][0]=i;
                    ans[k][1]=cStart;
                    k++;
                }
            }
         if(k==ans.length){
                break;
            }
            
        
            }
        
        
        
        
        return ans;
        }
    }
