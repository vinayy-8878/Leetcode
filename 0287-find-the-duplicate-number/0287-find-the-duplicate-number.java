class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        
            while(i<nums.length){
                if(nums[i]!=i+1){
                      int check=nums[i]-1;
                      if(nums[i]!=nums[check]){
                      swap(nums,i,check);
                       } 
                      else{
                      return nums[i];
                      }      
                }
           else{
                     i++;
                }
               
            }
        return -1;
        }
         
    
    public void swap(int[] arr,int i,int check){
        int temp=arr[i];
        arr[i]=arr[check];
        arr[check]=temp;
    }
}