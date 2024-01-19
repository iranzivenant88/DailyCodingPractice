class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums.length == 0){
          return 0;
      }
        if(nums.length == 1){
            return 1 ; 
        }
        int i = 0;
        int t = 1;
        int count = 1;
        while(i < t && t < nums.length){
            if(nums[t] != nums[i]){
                i++;
                nums[i] = nums[t];
                count ++;
            }
            t++;
        }
          return count;

        }
}