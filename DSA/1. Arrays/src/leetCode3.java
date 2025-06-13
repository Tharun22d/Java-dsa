/*
1480. Running Sum of ld Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

import java.util.*;
public class leetCode3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Values Array : ");
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = input.nextInt();
        }
        int[] result = runningSum(arr);
        System.out.print("Sum of arrays : "+ Arrays.toString(result));
    }
    public static int[] runningSum(int[] nums) {

        int sum = 0 ;
        int[] result = new int[nums.length];

        for(int i = 0 ; i<nums.length ; i++){
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }
}
