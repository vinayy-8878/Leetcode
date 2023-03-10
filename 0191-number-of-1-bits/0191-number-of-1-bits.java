public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int count = 0;

        while (n != 0) {
            
            // Check if the number is odd
            if ((n & 1) == 1)
                count++;
            
            n = n >>> 1;
        }
            
        return count;
    }
}