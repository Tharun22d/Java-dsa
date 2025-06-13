
/*
1929. Concatenation of Array
Given an integer array nums of length n, you want to create an array ans of length '2n' where
ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]  //twice the nums
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */

import java.util.*;

public class leetcode2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Enter the size of the array");
        int[] arr = new int[size];

        //looping through the size for the input values
        for(int i = 0 ; i<arr.length ;i++){
            arr[i] = input.nextInt();
        }
        //storing array to Convert to string
        int[] result = Concatenated(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] Concatenated(int[] arr){
        int[] ans = new int[2*arr.length];  //creating new array as its 2wice the size of the input
        for(int i = 0 ; i<arr.length;i++){
            ans[i] = arr[i];
        }
        for(int i = arr.length ; i<2*arr.length ; i++){
            ans[i] = arr[i-arr.length];// ans i = lenght when arr[i] gives index bound exception so i-arr.lenght = 0
        }
        return ans;
    }
}
