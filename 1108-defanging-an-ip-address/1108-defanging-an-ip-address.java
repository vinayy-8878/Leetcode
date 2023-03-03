class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        String add="[.]";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ans=ans+add;
            }
            else{
               ans=ans+address.charAt(i);
            }
        }
        return ans;
    }
}