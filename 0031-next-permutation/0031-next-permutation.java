class Solution {
    public void nextPermutation(int[] nums) {
        int infection=0;
      //  int toSwap=0;
        for(int i=nums.length-1;i>0;i--){
           if( nums[i]>nums[i-1]){
            infection=i;
            break;
         }
        }
        if(infection==0){
            Arrays.sort(nums);
          System.out.println(Arrays.toString(nums));
         }
        else{
            int min=Integer. MAX_VALUE;
             int toSwap=nums[infection-1];
            int idx=0;
            for(int j=infection;j<nums.length;j++){
                if(nums[j]-toSwap>0 && nums[j]-toSwap<min){
                 
                    min=nums[j]-toSwap;
                    idx=j;
                }
                    
                
            }
            int temp=nums[idx];
                    nums[idx]=nums[infection-1];
                    nums[infection-1]=temp;
        }
        Arrays.sort(nums,infection,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    
}