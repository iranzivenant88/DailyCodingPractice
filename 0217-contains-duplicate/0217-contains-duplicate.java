class Solution {
    public boolean containsDuplicate(int[] nums) {
//         int i =0;
//         int j = nums.length-1;
//         while(i<j){
//             if(nums[i]==nums[j]){
                
//                 return true;
//             }            
//         }
//         return false;
    Set<Integer>set= new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
       if (set.size()!=nums.length){
           return true;
       }
        return false;
    }
}