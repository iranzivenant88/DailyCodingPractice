public class RotateArray {
    /*
 Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 * */
    static void reverse(int[] arr,int startingPoint,int endingPoint){
        while(endingPoint>startingPoint){
            int temporaryVariable = arr[startingPoint];
            arr[startingPoint]=arr[endingPoint];
            arr[endingPoint] =temporaryVariable;
            startingPoint++;
            endingPoint--;
        }
    }
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7};
        //5,6,7,1,2,3,4


        int k =3; // k is the number of times to rotate our array
        int len = array.length; // this is the length of the array

        reverse(array,0,len-1);
        for (int i: array){
            System.out.print(i +" ");
        }
        System.out.println("end of 1 reverse");
        reverse(array,0,k-1);
        for (int i: array){
            System.out.print(i +" ");
        }
        System.out.println("end of 2 reverse");
        reverse(array,k,len-1);
        for (int i: array){
            System.out.print(i +" ");

        }
        System.out.println("end of 3 reverse");


        }
    }
//[5,6,7,1,2,3,4]
