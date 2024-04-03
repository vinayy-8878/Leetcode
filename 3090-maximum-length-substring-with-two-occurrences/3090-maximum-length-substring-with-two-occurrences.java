class Solution {
    public int maximumLengthSubstring(String s) {
        
    Map<Character, Integer> mp = new HashMap<>();
        int i = 0, j = 0, len = 0;
        while(j < s.length()){
            char ch2 = s.charAt(j);
            mp.put(ch2, mp.getOrDefault(ch2, 0) + 1);
            //Condition if any character's count gets greater than 2
            while(mp.get(ch2) > 2){
                char ch1 = s.charAt(i);
                mp.put(ch1, mp.get(ch1) - 1);
                i++;
            }
           len = Math.max(len, j - i + 1);
           j++;
        }
        return len;
    }
}