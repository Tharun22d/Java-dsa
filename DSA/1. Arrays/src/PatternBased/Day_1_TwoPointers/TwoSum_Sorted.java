/*
167. Two Sum II - Input Array Is Sorted     - tag : Two pointers , binary Search

Given an Sorted Array - need to check which value of the array returs the target valye and add 1 to the indices

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */

package PatternBased.TwoPointers;

public class TwoSum_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1 ;
        while(left<right){
            if(numbers[left] + numbers[right] == target){
                return new int[] {left+1 , right+1};
            }
            else if(numbers[left]+numbers[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {};
    }
  }

