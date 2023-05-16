class Solution {
    public boolean canJump(int[] nums) {
        int index=nums.length-1;
        int i=index;
        while(i>=0){
            if(i+nums[i]>=index){
                index=i;
            }
            i--;
        }
        if(index==0) return true;
        else return false;
    }
}