class Solution {
    public int[] buildArray(int[] nums) {
        int index=0;
        int[] ans=new int[nums.length];
        for(int val:nums){
        ans[index++]=nums[val];
            // index++;
        }
        return ans;
    }
}