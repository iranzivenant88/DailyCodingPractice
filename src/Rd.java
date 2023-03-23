public class Rd {
        public int removeDuplicates(int[] nums) {

            int j = 1;
            int i =0;
            while(i<j && j<nums.length){
                if(nums[i]==nums[j]){
                    j++;

                }else{
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
            }

            return i+1;
    }
}
