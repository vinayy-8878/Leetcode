class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans =new int[nums.length] ; 
     int[] left =new int[nums.length] ;  
     int[] right =new int[nums.length] ;  
        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=nums[i]*right[i+1];
        }
        System.out.println(Arrays.toString(left));
         System.out.println(Arrays.toString(right));
        // return left;
        ans[0]=right[1];
        ans[nums.length-1]=left[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }
}