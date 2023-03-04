class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z' || s1.charAt(i)>='0' && s1.charAt(i)<='9'){
                str.append(s1.charAt(i));
            }
        }
         System.out.println(str.toString());
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            else{
                start=start+1;
                end=end-1;
            }
        }
   //    System.out.println(str.toString());
        return true;
    }
}