class Solution {
    public int removeElement(int[] nums, int val) {

    // nums = [3,2,2,3], val = 3
    // 2,2,3
    // [2,2,-,-]
    
        int i = 0; 
        int j = 0; 
        int k = 0; 
        while( j < nums.length) {
            if(nums[j] == val) {
                j++; // nums[i] = nums[j]
            } else {
                nums[i] = nums[j]; 
                i++; 
                j++; 
                k++; 
            
            }
        }

        return k; 
        
    }
}