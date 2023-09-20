class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        Map<Character, Integer>map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1); 
        }
        
        for(char c1 : t.toCharArray()){
            if(map.containsKey(c1)){
                map.put(c1,map.getOrDefault(c1,0)-1);
            }
        }
        for(char c2 : map.keySet()){
            if(map.get(c2)!=0){
                return false;
            }
        }
        
      return true;
        
        
        
    }
}


    