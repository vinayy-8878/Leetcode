class Solution {
    public int rob(int[] nums) {
       if(nums.length<2) return nums[0];
        int[] skipFirst=new int[nums.length-1];
        int[] skipLast=new int[nums.length-1];
        for(int i =0;i<nums.length-1;i++){
            skipFirst[i]=nums[i+1];
            skipLast[i]=nums[i];
        
        }
      int sumWithLast=  robMoney(skipFirst);
       int sumWithFirst= robMoney(skipLast);
      return  Math.max(sumWithFirst,sumWithLast);
    }
    public int robMoney(int[] nums){
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