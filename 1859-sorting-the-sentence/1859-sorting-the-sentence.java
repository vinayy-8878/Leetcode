class Solution {
    public String sortSentence(String s) {
       String[] arr=s.split(" ");
       String[] sorted=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int len=arr[i].length();
            int index=arr[i].charAt(len-1)-'0';
            sorted[index-1]=arr[i].substring(0,len-1);
        }
     return   String.join(" ",sorted);
    }
}