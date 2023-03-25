class Solution {
    public String mergeAlternately(String word1, String word2) {
    int l= ( word1.length()>word2.length())?(word1.length()):(word2.length());
        int first=0;
        int second=0;
        boolean flag=true;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<l;i++){
            if(flag && first<word1.length() && second<word2.length())
            {
                ans.append(word1.charAt(first));
                first++;
                flag=false;
            }
            if(!flag && first<word1.length() && second < word2.length())
            {    ans.append(word2.charAt(second));
                second++;
                flag=true;
            }
        }
        while(first<word1.length()){
            ans.append(word1.charAt(first));
            first++;
        }
        while(second<word2.length()){
            ans.append(word2.charAt(second));
            second++;
        }
        return ans.toString();
    }
   
}