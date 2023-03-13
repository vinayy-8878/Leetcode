class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
         while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                arr[0]=mid;
                end=mid-1;
            }
            else if(target<=nums[mid]){
                end=mid-1;
            }
             else if(target>=nums[mid]){
                start=mid+1;
            }
         }
         start=0;end=nums.length-1;
          while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                arr[1]=mid;
                start=mid+1;
            }
            else if(target<=nums[mid]){
                end=mid-1;
            }
             else if(target>=nums[mid]){
                start=mid+1;
            }
         }
         return arr;
    }
}