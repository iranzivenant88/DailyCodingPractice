public class SingleNumber {

        public int singleNumber(int[] nums) {
            // O(1) space
            // O(n) time
            int value = 0;
            for(int x : nums) {
                value ^= x;
            }
            return value;

    }

}
