class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int compliment = target - nums[i]; // compl = 9-2 = 7
            if(map.containsKey(compliment)){
                return new int [] {map.get(compliment), i};
            }
            map.put(nums[i],i);// 
        }
        return null;
        
    }
}