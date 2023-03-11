class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result =  new StringBuilder();
        int aLength=a.length()-1;
        int bLength=b.length()-1;
        int carry=0;
        while(aLength>=0 || bLength>=0 || carry==1){
        int a1=aLength>=0?a.charAt(aLength)-'0':0;
        int b1=bLength>=0?b.charAt(bLength)-'0':0;
        result.append(a1^b1^carry);
            carry= (a1 & b1) |(a1 & carry) | (b1 & carry);
            aLength--;
            bLength--;
        }
              return result.reverse().toString();
              }
        
}