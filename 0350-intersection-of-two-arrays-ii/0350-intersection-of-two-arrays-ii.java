class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length){
            return intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       ArrayList<Integer> list=new ArrayList<Integer>();
        int start=0;
        for(int num:nums1){
            int res=binarySearch(nums2,num,start);
            if(res!=-1){
                list.add(num);
                start=res+1;
            }
        }
       
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public int binarySearch(int[] nums,int target,int start){
        int index=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                end=mid-1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
}