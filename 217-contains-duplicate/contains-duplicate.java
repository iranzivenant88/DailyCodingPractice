class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
      Set<Integer>set = new HashSet<>();
      for(int i = 0; i < nums.length ; i++){
           set. add(nums[i]);
      }
      int size = set.size();
      if(len != size){
        return true;
      }else
      return false;
      
    }
}