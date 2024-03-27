class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }
        for(int i=0;i<nums.length;i++){
            int composite=target-nums[i];
          
            if(map.containsKey(composite)){
                arr[0]= map.get(composite);
                  arr[1]=i;
                break;
            }
             map.put(nums[i],i);
        }
        return arr;
    }
}