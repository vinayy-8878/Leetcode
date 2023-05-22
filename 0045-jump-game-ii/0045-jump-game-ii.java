class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int maxReach=0;
        int current=0;
        for(int i=0;i<nums.length-1;i++){
            maxReach=Math.max(maxReach,nums[i]+i);
            if(i==current){
                current=maxReach;
                jump++;
            }
        }
        return jump;
        
    }
}