class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                arr[i][j]=image[i][image[0].length-1-j]^1 ;
             //   arr[i][j]^=1;
                
            }
        }
        return arr;
    }
}