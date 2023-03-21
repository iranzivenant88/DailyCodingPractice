public class Palindrome {

    public boolean isPalindrome(String s) {
        int size = s.length();
        if (size <= 0 || s == null) {
            return true;
        }
        int i = 0;
        int j = size - 1;
        while (i <= j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;

            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;

            }

        }
        return true;


    }

}
