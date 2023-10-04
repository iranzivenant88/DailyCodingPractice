class Solution {
    public int search(int[] nums, int target) {
    //nums = [4,5,6,7,0,1,2], target = 
        // Medium?len-1;
        // len-1<medium, and target < len-1, we go for right side
        //     otherwise we go for left side.
        int right = nums.length-1;
        int left = 0;
        while(left<=right){
            int midIndex = right + left/2;
            if(nums[midIndex]==target){
                return midIndex;
            }else if(nums[midIndex]>=nums[left]){
                if(nums[midIndex]>target && target>=nums[left]){
                    right = midIndex-1;
                }else{
                    left = midIndex+1;
                }
                
                
            }else{
              if(nums[midIndex]<target && target<=nums[right]){
                  left = midIndex+1;
              }else{
                  right = midIndex-1;
              }
            }
            
        }
        return -1;
        
    }
}



