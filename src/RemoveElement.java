public class RemoveElement {

        public int removeElement(int[] nums, int val) {
            if(nums.length ==0){
                return 0;
            }
            int valid_element = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[valid_element++]=nums[i];


                }
            }
            return valid_element;


        }
}
