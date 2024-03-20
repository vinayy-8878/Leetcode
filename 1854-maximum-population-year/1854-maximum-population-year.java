class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr=new int[101];
        int by=1950;
        int dy=2050;
        for(int[] log:logs){
            by=log[0];
            dy=log[1];
            arr[by-1950]++;
            arr[dy-1950]--;
        }
        int max=arr[0];
        int maxYear=1950;
        for(int i=1;i<101;i++){
            arr[i]+=arr[i-1];
            if(arr[i]>max){
            maxYear=1950+i;
                max=arr[i];
            }
        }
        return maxYear;
    }
}