class Solution {
    public int[] getConcatenation(int[] nums) {
      int[] ans=new int[nums.length*2]  ;
        int index=0;
        for(int val:nums){
            ans[index]=nums[index];
            ans[index+nums.length]=nums[index];
            index++;
        }
        return ans;
    }
}