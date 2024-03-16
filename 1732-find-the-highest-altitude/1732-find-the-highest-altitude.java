class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int[] arr=new int[gain.length+1];
        int alt=0;
        for(int i=0;i<gain.length;i++){
            arr[i+1]=gain[i]+alt;
            alt=arr[i+1];
            if(max<alt) max=alt;
        }
        return max;
    }
}