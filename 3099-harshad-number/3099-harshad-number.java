class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int rem=0;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(x%sum==0) return sum;
        return -1;
    }
}