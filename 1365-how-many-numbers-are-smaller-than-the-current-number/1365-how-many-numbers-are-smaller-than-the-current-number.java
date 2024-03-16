class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[101];
        // int[] result=new int[nums.length];
        for(int num:nums){
         ans[num]++;
        }
        for(int i=1;i<ans.length;i++){
         ans[i]=ans[i]+ans[i-1];
        }
        for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
        nums[i]=0;
        }
            else{
nums[i]=ans[nums[i]-1];
            }
        }
        return nums;
    }
}