class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer>map = new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            int compliment =target-nums[i];
            if (map.containsKey(compliment))
            {
               int arr[]= {map.get(compliment),i};
               return arr;
            } else
            {
                map.put(nums[i],i);
            }

        }

        throw new IllegalArgumentException();
   
    }
}

