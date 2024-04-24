class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Set<Integer> st = new HashSet<>();
        int length1=nums1.length-1;
        int length2=nums2.length-1;
        for(int num:nums2){
            int start=0;
            int end=length1;
            
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums1[mid]==num){
                    st.add(nums1[mid]);
                    break;
                }
                else if(nums1[mid]>num){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        int i=0;
        int[] ans=new int[st.size()];
        for(int num:st){
            ans[i++]=num;
        }
        return ans;
    }
}