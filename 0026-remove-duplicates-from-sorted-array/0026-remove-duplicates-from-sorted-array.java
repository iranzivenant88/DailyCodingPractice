class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums.length == 0){
          return 0;
      }
        if(nums.length == 1){
            return 1 ; 
        }
        int i = 0;
        int count = 1;
        for(int t = 1 ; t < nums.length; t++){
            if(nums[t] != nums[i]){
                i++;
                nums[i] = nums[t];
                           count ++;
            }
        }
          return count;

        }
}