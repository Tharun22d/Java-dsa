/*
26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order,
remove the duplicates from an array and return the length of the array

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */


package PatternBased.TwoPointers;

public class RemoveDuplicates {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        for(int j = i+1 ; j<arr.length ; j++){
            if(arr[i]!=arr[j]){
                if(arr[i]<arr[j]){
                    arr[i+1] = arr[j];
                    i++;
                }
                else{
                    continue;     //once the inner loop fails the outer loop gets exited and the j value is incremented
                }
            }
        }
        return i+1;
    }
}
