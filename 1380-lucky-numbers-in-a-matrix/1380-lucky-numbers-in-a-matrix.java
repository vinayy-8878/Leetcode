class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            int minIndex=0;
            int minValue=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(minValue>matrix[i][j]){
                    minValue=matrix[i][j];
                    minIndex=j;
                }
            }
            boolean lucky=true;
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][minIndex]<matrix[j][minIndex]){
                    lucky=false;
                    break;
                }
            }
            if(lucky==true){
           list.add(matrix[i][minIndex]);
            }
        }
        return list;
    }
}