class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE ;
        int left = 0;
        int currentSum = 0;
    for(int i = 0; i < nums.length;i++){
        currentSum += nums[i];
       // [2,3,1,2,4,3]
        while(currentSum >= target){
            res = Math.min(res , i - left +1);
            currentSum -= nums[left];
            left++;
        }
    }
    if(res !=  Integer.MAX_VALUE ){
        return res;
    }
    return 0;

    }
}