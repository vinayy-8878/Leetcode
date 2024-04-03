class Solution {
    public int maximumLengthSubstring(String s) {
        
        int n=s.length();
        int maxLength=0;
        for(int i=0;i<n;i++){
            int[] arr=new int[26];
           for(int j=i;j<n;j++){
               arr[s.charAt(j) - 'a']++; 
               if(arr[s.charAt(j)-'a']==3) break;
              maxLength = Math.max(maxLength, j - i + 1);
           }
        }
        return maxLength;
    }
}