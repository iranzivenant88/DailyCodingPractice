import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        /*350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
        *
        * */
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        int [] result = intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0 ;
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();

        while(i<len1 && j<len2){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;

            }else if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }
        }

        int [] arr = new int[result.size()];
        int index = 0 ;
        for(Integer b : result){
            arr[index++]= b ;
        }
        return arr;
    }
}
