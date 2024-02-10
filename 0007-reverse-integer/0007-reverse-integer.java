class Solution {
 public int reverse(int x) {
    int reversed = 0;
    
    while (x != 0) {
        int digit = x % 10;
        
        // Check for overflow/underflow
        if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
            return 0;
        }
        
        reversed = reversed * 10 + digit;
        x /= 10;
    }
    
    return reversed;
}

}