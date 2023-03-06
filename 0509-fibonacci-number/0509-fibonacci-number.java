class Solution {
    public int fib(int n) {
        int ans=fibbo(n);
        return ans;
    }
    public int fibbo(int n){
        if(n<2){
        return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
}