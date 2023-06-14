class Solution {
    public boolean isHappy(int n) {
        // int slow=findSquare(n);
        // int fast=findSquare(findSquare(n)); 
         int slow=n;
        int fast=n;
        slow=findSquare(slow);
        fast=findSquare(findSquare(fast));
        while(slow!=fast){
            slow=findSquare(slow);
            
        fast=findSquare(findSquare(fast));
        }
        if(slow==1) return true;
       
        return false;
        
       
    
    }
    public int findSquare(int number){
        int answer=0;
       
        while(number>0){
            int rem=number%10;
            answer+=rem*rem;
            number=number/10;
        }
        return answer;
    }
}