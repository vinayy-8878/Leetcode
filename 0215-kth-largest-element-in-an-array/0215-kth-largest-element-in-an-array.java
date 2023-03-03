class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
   //     System.out.println(Arrays.toString(nums));
        
    //     int i=0;
    //     while(i<nums.length){
    //         int check=nums[i]-1;
    //         if(nums[i]!=nums[check]){
    //             swap(nums,i,check);
    //         }
    //         else
    //             i++;
    //     }
    //     return nums[nums.length-k];
    // }
    // public void swap(int[] arr,int i,int check){
    //  int temp=arr[i];
    //     arr[i]=arr[check];
    //     arr[check]=temp;
    // }
        return nums[nums.length-k];
    }
}