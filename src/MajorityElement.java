import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
       int [] nums = { 3,4,3};
        int maj =majorityElement(nums);
        System.out.println(maj);
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            //[3,2,3]
            if (map.containsKey(nums[i])) {
              map.put(nums[i],map.get(nums[i])+1);
                if (map.get(nums[i]) > n / 2) {
                return nums[i];

                }
            } else {
                map.put(nums[i], 1);
            }
            System.out.println(nums[i]+"---"+map.get(nums[i]));
        }

        //for (int x : map.keySet()) {

        return 0;
    }
}

