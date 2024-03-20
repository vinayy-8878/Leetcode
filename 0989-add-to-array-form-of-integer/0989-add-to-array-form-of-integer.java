class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         ArrayList<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        int carry = k;
        
        while (i >= 0 || carry > 0) {
            if (i >= 0)
                carry += num[i];
            list.add(0, carry % 10);
            carry /= 10;
            i--;
        }
        
        return list;
    }
}