package PatternBased.Day_2_SlidingWindoe;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,5,4,2,9,9,9};
        int ans = Calculate(arr, 3);
        System.out.println(ans);
    }
    static int Calculate(int[] nums , int k) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int right = 0 ; right < nums.length ;right++){
            sum = sum + nums[right];
            if((right - left) + 1 ==k){
                max = Math.max(max,sum);
//                startIndex = left;
                sum = sum - nums[left];
                left++;
            }
        }
        return max;
    }
}
