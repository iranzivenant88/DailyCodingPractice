import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumToTarget {

        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0;i<nums.length;i++){
                int compliment = target-nums[i];
                if(map.containsKey(compliment)){
                    int []output = {map.get(compliment),i};
                    return output;
                }
                map.put(nums[i],i);
            }

            throw new IllegalArgumentException("There is no correct answer ");
        }

    public static void main(String[] args) {
       int [] input = {2,7,11,15} ;
       int target = 9;
        //Expected Output: [0,1]
       int [] result= twoSum(input,target);
        System.out.println(Arrays.toString(result));
    }
}
