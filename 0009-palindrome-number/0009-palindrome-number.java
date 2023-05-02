class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        //String a = Integer.toString(x);
        String a = String.valueOf(x);
        
    int i =0;
    int k = a.length()-1;
        while(i<k){
            if(a.charAt(i)!=a.charAt(k)){
                return false;
            }else {
                i++;
                k--;
            }
        }
       return true;
        
    }
}