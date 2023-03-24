class Solution {
    public String reverseWords(String s) {
        StringBuilder answer=new StringBuilder("");
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            
            for(int j=arr[i].length()-1;j>=0;j--){
                answer.append(arr[i].charAt(j));
            }
            if(i<arr.length-1)
            answer.append(" ");
        }
        return answer.toString();
    }
}