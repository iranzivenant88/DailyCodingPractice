import java.util.Arrays;

public class MoveZeroo {
    // counter
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};
        moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }
    public static void moveZeroes(int[] num){
        int counter = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[counter] = num[i];
                counter++;
            }
        }

        // counter = 2
        // 1,3,12,3,12


        num[0] = 1;
    }
}
