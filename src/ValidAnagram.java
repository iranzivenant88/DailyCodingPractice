import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rac", t = "car";

        ValidAnagram validAnagram = new ValidAnagram();
        boolean res = validAnagram.isValidAnagram(s,t);
        System.out.println(res);
    }
    /*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
    *
    * */

    public  boolean isValidAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        //change string to arrays of characters
        char [] ss = s.toCharArray();
        char [] tt = t.toCharArray();
        //sorting arrays of characters
        Arrays.sort(ss);
        Arrays.sort(tt);

        return Arrays.equals(ss,tt);
    }
}
