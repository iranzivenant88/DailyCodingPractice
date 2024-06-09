class Solution {
    public boolean containsDuplicate(int[] nums) {
      //  int len = ;
      Set<Integer>set = new HashSet<>();
      for(int i : nums){
          if(!set.add(i)){
            return true;
          }
      }
     return false;
      
    }
}