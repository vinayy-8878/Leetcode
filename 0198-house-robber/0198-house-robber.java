class Solution {
    public int rob(int[] nums) {
       int[] ans=new int[nums.length];
        if(nums.length<2) return nums[0];
        ans[0]=nums[0];
        ans[1]=Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
  ans[i]=Math.max(ans[i-2]+nums[i],ans[i-1]);
        }
        return ans[nums.length-1];
        
    }
}