class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        slow=square(slow);
        fast=square(square(fast));
        while(slow!=fast){
            slow=square(slow);
        fast=square(square(fast));
        }
        if(slow==1) return true;
       
        return false;
    }
    public int square(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number=number/10;
        }
        return ans;
    }
}