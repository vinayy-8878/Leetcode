class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str=new StringBuilder();
        char ch[]=new char[indices.length];
        for(int i=0;i<s.length();i++){
        ch[indices[i]]=s.charAt(i);
        }
        str.append(ch);
        return str.toString();
    }
}