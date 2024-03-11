class Solution {
    public int maximumWealth(int[][] accounts) {
          int richestCustomer=0;
        for(int i=0;i<accounts.length;i++){
            int money=0;
          
            for(int j=0;j<accounts[i].length;j++){
                    money+=accounts[i][j];
                }
            if(richestCustomer<money){
richestCustomer=money;
            }
        }
        return richestCustomer;
    }
}