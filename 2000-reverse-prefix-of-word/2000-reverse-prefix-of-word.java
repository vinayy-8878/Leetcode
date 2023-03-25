class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        String toRev=word.substring(0,index+1);
       String ans="";
        for(int i=0;i<word.length();i++){
            if(i<toRev.length()){
            ans+=word.charAt(index-i);
            }
            else{
             ans=ans+word.charAt(i);
            }
        }
        return ans;
    }
}