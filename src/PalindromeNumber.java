public class PalindromeNumber {
        public boolean isPalindrome(int x) {
            String str = String.valueOf(x);
            int len = str.length();
            //int i = 0;
            String reverse = "";

            for(int i =len-1 ;i>=0;i--){
                reverse+=str.charAt(i);
                if(str.equals(reverse)){
                    return true;
                }


            }
            return false;

        }
}
