class Solution {
    public int strStr(String haystack, String needle) {
        int j=-1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.contains(needle)){
              j=  haystack.indexOf(needle,0);
            }
            
        }
        return j;
    }
}