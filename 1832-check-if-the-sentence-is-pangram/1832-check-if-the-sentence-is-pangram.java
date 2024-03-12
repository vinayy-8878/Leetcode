class Solution {
    public boolean checkIfPangram(String sentence) {
     HashSet<Character> set = new HashSet<Character>();
        char[] arr=sentence.toCharArray();
        for(char c:arr){
    set.add(c);
        }
        for(char ch='a';ch<='z';ch++){
            if(!set.contains(ch)){
               return false;
            }
         
        }
        return true;
        
        
    }
}