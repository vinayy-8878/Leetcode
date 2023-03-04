class Solution {
    public boolean checkIfExist(int[] arr) {
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        int product=arr[i]*2;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
         if(product==arr[mid] && mid!=i)   return true;
         else if(arr[mid]<product) start=mid+1;
         else end=mid-1;
        }
    }
        return false;
        
    }
}