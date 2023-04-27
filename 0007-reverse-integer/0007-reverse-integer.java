class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        int reverse = 0;
       //  if(x<0){
       //      isNegative = true;
       //      x = x *(-1);
       //  } 
        while(x != 0){
        int pop = x %10 ; 
        
            x = x/10;
        
        if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse * 10 + pop; 
        }
        // if(isNegative){
        //     reverse = (-1)*reverse;
        // }        
        return reverse;
        
    }
}