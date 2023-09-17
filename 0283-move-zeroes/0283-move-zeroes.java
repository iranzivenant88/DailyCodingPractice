class Solution {
    public void moveZeroes(int[] nums) {
        int counterOfNonZeroNumbers = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                //Input: nums = [0,1,0,3,12]           
                nums[counterOfNonZeroNumbers]=nums[i];  
                counterOfNonZeroNumbers++;
            }
             
            }
            while (counterOfNonZeroNumbers < nums.length){
              
                nums[counterOfNonZeroNumbers]=0;
                 counterOfNonZeroNumbers ++;
        }
        
    }
}