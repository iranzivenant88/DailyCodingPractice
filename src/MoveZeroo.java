import java.util.Arrays;

public class MoveZeroo {
    // counter
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};
        moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }
    public static void moveZeroes(int[] nums) {
        //Input: nums = [0,1,0,3,12]
        if (nums.length < 2) {
            return;
        }

        int i = 0;
        int j = 1;
        // 6,0,8,0

        while (j < nums.length) {
            if(nums[i] != 0) {
                j++;
                i++;
            } else if(nums[j] == 0) {
                j++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

        }

    }

}
