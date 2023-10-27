class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
   
    for(int i = 0;i<nums.length;i++){
        int compliment = target-nums[i];
        if(map.containsKey(compliment)){
            int []result = {map.get(compliment),i};
           return result;  
        }
        map.put(nums[i],i);
    }
   
    throw new ArithmeticException("There is no correct answer ");
    }
}
