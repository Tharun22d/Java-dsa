/*
560. Subarray Sum Equals K  - using hashmaps and prefizsums
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Input: nums = [1,1,1], k = 2
Output: 2


 */

package PatternBased.Day_3_PrefixSums;
import java.util.*;
public class two_SubarraySumK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        
        int sum = 0;
        int count = 0;
        for(int i : nums){
            sum = sum+ i;  //1. as of the values in array count the sum
            if(map.containsKey(sum-k)){  //3. then check if the sum-k is present in prefix sum
                count = count + map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1); // 2. add the sum andthe count in map
        }
        return count;
    }

}
