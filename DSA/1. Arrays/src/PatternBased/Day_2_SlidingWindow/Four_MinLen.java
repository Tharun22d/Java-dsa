/*
209. Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

approach : initialize from 0 for l and r and add the value of r to the sum first
            since we are shrinking and the target is to find the minimum value
            use WHile loop for shirking as check sum > = target , then calculate the min value and update it
            then delete the value of l and increment
            then incremeent the r

 */

package PatternBased.Day_2_SlidingWindow;

public class Four_MinLen {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        while(right<n){
            sum = sum+nums[right];

            // While current sum is enough, try shrinking the window
            while(sum>=target){
                // Update minimum length if the current window is smaller
                min = Math.min(min,(right-left)+1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
