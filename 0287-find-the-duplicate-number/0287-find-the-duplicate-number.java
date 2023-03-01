class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        
            while(i<nums.length){
               
                      int check=nums[i]-1;
                      if(nums[i]!=nums[check]){
                      swap(nums,i,check);
                       } 
                      else{
                      i++;
                      }
            }
         for(int index=0;index<nums.length;index++){
             if(nums[index]!=index+1)
                 return nums[ index];
         }
        return -1;
        }
         
    
    public void swap(int[] arr,int i,int check){
        int temp=arr[i];
        arr[i]=arr[check];
        arr[check]=temp;
    }
}