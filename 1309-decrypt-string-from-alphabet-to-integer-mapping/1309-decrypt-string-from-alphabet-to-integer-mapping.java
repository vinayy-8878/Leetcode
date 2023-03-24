class Solution {
    public String freqAlphabets(String s) {
        StringBuilder answer = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
             int num=Integer.parseInt(s.substring(i,i+2));
                answer.append((char)(96+num));
                i=i+2;
            }
            else
            {
              int num=Integer.parseInt(s.substring(i,i+1));
                answer.append((char)(96+num));
            }
        }
        return answer.toString();
    }
}