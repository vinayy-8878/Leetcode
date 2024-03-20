import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         ArrayList<Integer> list = new ArrayList<Integer>();
        BigInteger sum =BigInteger.ZERO;;
          for (int i = 0; i < num.length; i++) {
            sum = BigInteger.valueOf(num[i]).add(sum.multiply(BigInteger.TEN));
        }
        BigInteger n = sum.add(BigInteger.valueOf(k));
        int rem = 0;
        
         while (!n.equals(BigInteger.ZERO)) {
            rem = n.mod(BigInteger.TEN).intValue();
            list.add(0, rem);
            n = n.divide(BigInteger.TEN);
        }
        return list;
    }
}