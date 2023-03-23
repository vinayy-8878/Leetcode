class Solution {
    public String freqAlphabets(String s) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
             answer.append((char)(10*(s.charAt(i)-48)+s.charAt(i+1)+48));
                i=i+2;
            }
            else
            {
              answer.append((char)(s.charAt(i)+48));
            }
        }
        return new String(answer);
    }
}