public class RemoveDuplicateInSortedArrayII {
        public int removeDuplicates(int[] nums) {
            int counter = 0; int R = 1; int L =0;
            int N = nums.length;

            while (R<N){
                if(nums[L]!=nums[R]){
                    L++;
                    nums[L]=nums[R];
                    counter =0;
                }else if(nums[L]==nums[R]&& counter<1){
                    counter++;
                    nums[++L]=nums[R];

                }
                R++;
            }
            return L+1;

        }
}
