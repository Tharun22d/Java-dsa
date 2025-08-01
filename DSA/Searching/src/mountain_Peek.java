/*
852. Peak Index in a Mountain Array
You are given an integer mountain array arr of length n where the values increase
to a peak element and then decrease. Return the index of the peak element.

Example 1:

Input: arr = [0,1,0]
Output: 1

Example 2 :
input = [1, 3, 5, 7, 8, 9, 10, 9, 8, 7, 6, 4, 2]
output = 6
 */

package Searching;

public class mountain_Peek {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        while(left <right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[mid+1] ){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }


}
