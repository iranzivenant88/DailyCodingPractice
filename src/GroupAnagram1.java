import java.util.*;

public class GroupAnagram1 {
    /*
  * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
* typically using all the original letters exactly once.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:
Input: strs = [""]
Output: [[""]]
Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */
        public static List<List<String>>groupAnagrams(String[] str)
        {
            //Key = Sorted String
            //Value =list of original String
            Map<String,List<String>> map = new HashMap<>();
            List<List<String>>results = new ArrayList<>();

            for (String originalString:str)
            {
                char[]charArray = originalString.toCharArray();
                Arrays.sort(charArray);
                String sortedString =String.valueOf(charArray);
                List<String>listOfValues =new ArrayList<>();

                if (map.containsKey(sortedString))
                {
                    var list = map.get(sortedString);
                    list.add(originalString);
                }else{
                    listOfValues.add(originalString);
                    map.put(sortedString,listOfValues);
                }
            }
            for (String key: map.keySet())
            {
                results.add(map.get(key));
            }
            return results;

        }
        public static void main(String[] args)
        {
            String [] str ={"eat","tea","tan","ate","nat","bat"};
            System.out.println(groupAnagrams(str));

        }

}
