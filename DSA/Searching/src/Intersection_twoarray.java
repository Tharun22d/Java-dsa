/*
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted

apprach :

so basiclly we are using hashset to remove duplicate values
we are treating through any one array and searching whethe the elemet is present in the other array
so genearally instead of using linear search .. we are using binary search to perform the operation
 */
package Searching;


import java.util.*;

public class Intersection_twoarray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);  //will be used for binary search to perform operation
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums2){
            if(binarySearch(nums1 , i)){  //searching whether the elements in num2 present in num1 (so sorting num1)
                set.add(i);
            }
        }
        int[] res = new int[set.size()];
        int index = 0;
        for(int i : set){
            res[index] += i;
            index++;
        }
        return res;
    }
    static boolean binarySearch(int[] arr , int target){
        int left = 0;
        int right = arr.length -1 ;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] >target){
                right = mid -1 ;
            }
            else {
                left = mid + 1;
            }
        }
        return false;
    }

}
