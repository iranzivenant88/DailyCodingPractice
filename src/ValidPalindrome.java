public class ValidPalindrome {
    public static void main(String[] args) {
        /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
        removing all non-alphanumeric characters, it reads the same forward and backward.
        Alphanumeric characters include letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.
        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.*/
        String Input = "A man, a plan, a canal: Panama";
       boolean isValidPalindrome = isPalindrome(Input);
        System.out.println(isValidPalindrome);
    }
        public static boolean isPalindrome(String s) {
            // if(s.length()<1 ||s==null){
            //     return true;
            // }
            //Input: s = "an, a 2plan, a ?canal: Pana"

            int i = 0;
            int j = s.length()-1;
            System.out.println(j);

            while(i<j){ // i =3 j =27
                while(!Character.isLetterOrDigit(s.charAt(i)))
                {
                    i++;
                // String Input = "A man, a plan, a canal: Panama";
                }
                while(!Character.isLetterOrDigit(s.charAt(j)))
                {
                    j--;

                }
                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                {
                    return false;
                }
                i++; // i =4
                j--; // 26
            }
            return true;

        }
    }
/*
*
*
*
*
*
*
* */
