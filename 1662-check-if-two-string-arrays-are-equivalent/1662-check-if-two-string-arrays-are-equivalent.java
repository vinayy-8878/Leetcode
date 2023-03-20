class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //  String[] first={"a","bc","d"};
        // String[] second={"ab","c"};
        String one="";
        String two="";
        for(int i=0;i<word1.length;i++){
         one=one+word1[i];
        }
        for(int j=0;j<word2.length;j++){
            two=two+word2[j];
        }
        if(one.equals(two)) return true;
        return false;
    }
}