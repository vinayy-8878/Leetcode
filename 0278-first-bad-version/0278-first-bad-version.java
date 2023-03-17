/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      
            int start=1;
            int end=n;
            while(start<=end){
            int mid=start+(end-start)/2;
            boolean val=isBadVersion(mid);
            if(isBadVersion(mid) && isBadVersion(mid-1)==false  )
            return mid;
            if(val==false){
                start=mid+1;
            }
            else if(val== true){
                end=mid;
            }
         }

            

        
        return -1;
        
    }
}