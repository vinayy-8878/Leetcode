class Solution {
    public int[] plusOne(int[] digits) {
         ArrayList<Integer> list=new ArrayList<Integer>();
     
         int k=1;
        int count=0;
        for(int i=digits.length-1;i>=0;i--){
            list.add((digits[i]+k)%10);
            count++;
            k=(digits[i]+k)/10;
        }
        while(k!=0){
            list.add(k%10);
            count++;
            k=k/10;
        }
        int[] arr=new int[count];
        for(int j=0;j<count;j++){
            arr[count-1-j]=list.get(j);
        }
      
        return arr;
    }
}