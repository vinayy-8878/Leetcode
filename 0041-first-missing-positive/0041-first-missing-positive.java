class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int check=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[check]){
                swap(nums,i,check);
            }
            else
                i++;
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
     
            return nums.length+1;
    }
      public  void swap(int[] arr, int i, int check) {
        int temp=arr[i];
        arr[i]=arr[check];
        arr[check]=temp;
    }
}