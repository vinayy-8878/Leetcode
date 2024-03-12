class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetList=new ArrayList<Integer>();
        int[] targetArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
         targetList.add(index[i],nums[i]);
            System.out.println(targetList);
        }
        for(int i=0;i<targetList.size();i++){
            targetArray[i]=targetList.get(i);
        }
        return  targetArray;
    }
}