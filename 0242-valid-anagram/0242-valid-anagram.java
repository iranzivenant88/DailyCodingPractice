
class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if the lengths of the two strings are different
        if (s.length() != t.length()) {
            return false;
        }

        // Create two HashMaps to store character frequencies for each string
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Populate map1 with character frequencies from string s
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Populate map2 with character frequencies from string t
        for (int j = 0; j < t.length(); j++) {
            map2.put(t.charAt(j), map2.getOrDefault(t.charAt(j), 0) + 1);
        }

        // Compare the character frequencies in map1 and map2
        return map1.equals(map2);
    }
}
