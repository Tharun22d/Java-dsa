/*
35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
 */


package Searching;

import java.util.Scanner;

public class Search_Position {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the len of the array : ");
        int size = input.nextInt();
        System.out.println("Enter the target element : ");
        int target = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(solution(arr , target));

    }
    static int solution(int[] nums , int target){
                int left = 0;
                int right = nums.length - 1 ;
                while(left <= right){
                    int mid = left + (right -left)/2;
                    if(nums[mid] == target){
                        return mid;
                    }
                    else if(nums[mid] < target){
                        left = mid + 1;
                    }
                    else{
                        right = mid - 1;
                    }
                }
                if(left == nums.length){
                    return nums.length;
                }
                return right+1;

    }
}
