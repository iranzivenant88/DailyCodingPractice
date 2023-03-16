import java.util.Arrays;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1 || nums == null) {
            return false;
        }
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                return true;
            } else {
                i++;
                j++;
            }
        }
        return false;
    }
}

