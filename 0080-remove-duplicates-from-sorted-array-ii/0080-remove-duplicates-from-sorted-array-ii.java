class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    
    int i = 0;
    
    for (int n : nums) {
        if (i < 2 || n > nums[i - 2]) {
            nums[i++] = n;
        }
    }
    
    return i;

        
    }
}