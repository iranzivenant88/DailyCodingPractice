import java.util.*;
import java.io.*;

    public class MaxPairwiseProduct {
            static long getMaxPairwiseProduct(int[] numbers) {
                int n = numbers.length;
                long max1 = -1, max2 = -1;

                for (int i = 0; i < n; ++i) {
                    if (numbers[i] > max1) {
                        max2 = max1;
                        max1 = numbers[i];
                    } else if (numbers[i] > max2) {
                        max2 = numbers[i];
                    }
                }

                return max1 * max2;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int[] numbers = new int[n];
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }
                System.out.println(getMaxPairwiseProduct(numbers));
            }

    }

