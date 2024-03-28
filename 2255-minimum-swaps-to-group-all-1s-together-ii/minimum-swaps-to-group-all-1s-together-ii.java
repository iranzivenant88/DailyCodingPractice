class Solution {
    public int minSwaps(int[] nums) {
        int CurrentSwap = 0;
        int CountOne = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 1){
                CountOne++;
            }
        }
        //Here I have CountOne , which is equal to number of 1 we have
        
        for(int i = 0; i < CountOne; i++){
            if(nums[i] == 0){
                CurrentSwap += 1;
            }       
        }

        int minSwap = CurrentSwap;
        int [] numsCircle = new int [nums.length *2];

           for (int i = 0; i < nums.length; i++) {
            numsCircle[i] = nums[i];
        }

        // Copy elements from nums to numsCircle again to concatenate
        for (int i = 0; i < nums.length; i++) {
            numsCircle[i + nums.length] = nums[i];
        }

        for(int i = CountOne;i< numsCircle.length;i++){
            if(numsCircle[i] == 0){
               CurrentSwap += 1;

            }
            if(numsCircle[i-CountOne] == 0){
                CurrentSwap -= 1;
            }
            minSwap = Math.min(CurrentSwap,minSwap);
        }
        

        return minSwap;
    }
}