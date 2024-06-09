class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int currentMax = 1;
        int max =1;
        Arrays.sort(nums);
        for(int i = 1; i< nums.length; i++){
            if(nums[i]!= nums[i-1]){
               if(nums[i]== nums[i-1]+1){
                    currentMax++;
               }else{
                    max = Math.max(currentMax,max);
                    currentMax = 1;
               }
            }
           
        }
         return Math.max(currentMax , max);
    }
}