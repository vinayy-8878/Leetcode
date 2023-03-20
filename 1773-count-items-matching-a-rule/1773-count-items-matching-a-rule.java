class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int val=0;
        if(ruleKey.equals("color"))   val=1;
        if(ruleKey.equals("name"))    val=2;
        int count=0;
        for(int i=0;i<items.size();i++){
           if( items.get(i).get(val).equals(ruleValue)){
               count++;
           }
}
       return count; 
    }
}