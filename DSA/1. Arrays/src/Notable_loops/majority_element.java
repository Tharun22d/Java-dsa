/*
169. Majority Element
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Input: nums = [3,2,3]
Output: 3
 */

package Notable_loops;

public class majority_element {
        public int majorityElement(int[] nums) {
            //moores voting algorithm
            int count = 0 ;
            int element = nums[0];
            for(int i = 0; i<nums.length ; i++){
                if(count ==0){
                    count = 1;
                    element = nums[i];
                }
                else if (nums[i] == element) {
                    count++;
                }
                else {
                    count --;
                }
            }
            int count1 = 0;
            for(int i:nums){
                if(i == element){    //in enchaced for loop  i = nums[i]
                    count1++;
                }
            }
            int n = nums.length;
            if(count1>n/2){
                return element;
            }
            return -1;
        }
}
