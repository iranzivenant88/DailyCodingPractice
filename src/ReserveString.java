import java.util.Arrays;

public class ReserveString {
        public static void reverseString(char[] s) {
            int i = 0;
            int j = s.length-1;
            while(i<j){
                char temp =s[j];
                s[j] = s[i];
                s[i] = temp;
                i++;
                j--;
            }

        }
    public static void main(String[] args) {
            String [] s ={"h","e","l","l","o"};
      reverseString(Arrays.toString(s).toCharArray());

    }
}
/*
* Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/