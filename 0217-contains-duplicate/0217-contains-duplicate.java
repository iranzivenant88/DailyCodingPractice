class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>();
        
        for(int it : nums){
            set.add(it);   
        }
      return set.size()!=nums.length;       
        
    }
}