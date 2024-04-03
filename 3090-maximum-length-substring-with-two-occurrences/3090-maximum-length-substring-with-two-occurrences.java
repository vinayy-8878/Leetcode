class Solution {
    public int maximumLengthSubstring(String s) {
        
        int n=s.length();
        int maxLength=0;
            int[] arr=new int[26];
        for(int i=0;i<n;i++){
        
           for(int j=i;j<n;j++){
               arr[s.charAt(j) - 'a']++; 
               if(arr[s.charAt(j)-'a']==3) break;
              maxLength = Math.max(maxLength, j - i + 1);
           }
            for (int k = 0; k < arr.length; k++) {
    arr[k] = 0;
}
        }
        return maxLength;
    }
}