/*
Max Sum Subarray of size K
Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Input: arr[] = [100, 200, 300, 400] , k = 2
Output: 700
Explanation: arr3  + arr4 = 700, which is maximum.

apporach : fixed Size Sliding windpw   - if condidion false : subtact the left and shrink left (l++) else if true : expand r and extend
            initilaize l and r from 0 ;
            run r till the end of the loop
            check if it r-l +1 < k : if true r++
            if fase : subract left decrement the left value
 */


package PatternBased.Day_2_SlidingWindow;

public class Three_MaxSum {
    static int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int left = 0;
        int right = 0;
        int max  = 0;
        int sum = 0;

        if(arr.length == k){
            for(int i : arr){
                sum = sum+i;
            }
            max = sum;
        }

        else{
            while(right <arr.length){
                sum = sum+arr[right];
                if(right -left +1 <k){
                    right++;
                }
                else if(right -left +1 ==k){
                    max = Math.max(max,sum);
                    sum = sum - arr[left];
                    left++;
                    right++;
                }
            }

        }
        return max;
    }
}
