class Solution {
    public String freqAlphabets(String s) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
             int num=Integer.parseInt(s.substring(i,i+2));
                answer+=(char)(96+num);
                i=i+2;
            }
            else
            {
              int num=Integer.parseInt(s.substring(i,i+1));
                answer+=(char)(96+num);
            }
        }
        return answer;
    }
}