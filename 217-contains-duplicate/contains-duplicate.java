class Solution {
    public boolean containsDuplicate(int[] nums) {
      //  int len = ;
      Set<Integer>set = new HashSet<>();
      for(int i : nums){
           set.add(i);
      }
      //int size = ;
      if(nums.length != set.size()){
        return true;
      }else
      return false;
      
    }
}