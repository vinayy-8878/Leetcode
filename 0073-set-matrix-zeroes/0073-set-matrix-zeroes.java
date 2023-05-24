class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int r=0;
        int c=0;
        ArrayList<Integer> row=new ArrayList<>();
         ArrayList<Integer> col=new ArrayList<>();
        // int[] row=new int[10];
        // int[] col=new int[10];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                 row.add(i);
                 col.add(j);
                }
            }
        }
        
        for(int i=0;i<row.size();i++){
            int value=row.get(i);
            for(int j=0;j<n;j++){
                matrix[value][j]=0;
            }
        }
         for(int i=0;i<col.size();i++){
            int value=col.get(i);
            for(int j=0;j<m;j++){
                matrix[j][value]=0;
            }
        }
        
        // for(int i=0;i<row.size();i++){
        //      System.out.println(row.get(i));
        // }
        // System.out.println(Arrays.toString(col));
    }
}