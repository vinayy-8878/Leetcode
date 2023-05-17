class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr= new int[nums.length];
       k=k%nums.length;
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%nums.length]=nums[i];
        }
         for(int i=0;i<nums.length;i++){
        nums[i]=arr[i];
         }
        System.out.println(Arrays.toString(nums));
        
      //   k=k%nums.length;
      //   System.out.println(k);
      //   if(nums.length>1){
      // int[] arr=new int[nums.length];
      //   for(int i=0;i<nums.length;i++){
      //    arr[i]=nums[nums.length-1-i];
      //   }
      //   int[] ans=new int[nums.length];
      //   for(int i=0;i<k;i++){
      //   ans[i]=arr[k-i-1];
      //   }
      //   int j=0;
      //   for(int i=k;i<nums.length;i++){
      //   ans[nums.length-j-1]=arr[i];
      //       j++;
      //   }
      //   for(int i=0;i<nums.length;i++){
      //    nums[i]=ans[i];
      //   }
      //   }
      //  // System.out.println(Arrays.toString(ans));
    }
}