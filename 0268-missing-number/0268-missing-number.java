class Solution {
    public int missingNumber(int[] nums) {
        
        int i=0;
        while(i<nums.length){
            int check=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[check]){
                swap(nums,i,check);
            }
            else
                 i++;
        }
           for(int index=0;index<nums.length;index++){
               if(nums[index]!=index)   return index;
           }
                 return nums.length;
    }
      public void swap(int[] arr,int i,int check){
             int temp=arr[i];
             arr[i]=arr[check];
             arr[check]=temp;
         }

   

}