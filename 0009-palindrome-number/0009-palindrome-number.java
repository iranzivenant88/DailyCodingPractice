class Solution {
    public boolean isPalindrome(int x) {
     
        int rev=0;
        int original = x;   
        while(x>0){
            int digit = x%10;    //rev= rev*10+x%10
            rev = rev*10+digit;
            x/=10;
        }
        return rev == original;
          
        
    }
}