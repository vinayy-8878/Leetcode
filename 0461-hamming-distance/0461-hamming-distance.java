class Solution {
    public int hammingDistance(int x, int y) {
      //  int n=x>y?x:y;
        int count=0;
        while(x!=0 || y!=0){
         int x1=x & 1;
         int y1=y & 1;
         if(x1!=y1)  { 
             count++;
                     }
         x=x>>1;
         y=y>>1;
           // n=x>y?x:y;
            
        }
        return count;
    }
}