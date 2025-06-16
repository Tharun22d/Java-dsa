/*
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */

package leetcode;

    import java.util.*;
    public class SmallerThanCurrent {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] arr = {8,1,2,3,2,3,4};

//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = input.nextInt();
//            }
            int[] res = smaller(arr);
            System.out.print(Arrays.toString(res));
        }

            static int[] smaller(int[] nums){
                int max = 0;
                for(int i = 0 ; i<nums.length;i++){
                    if(nums[i]>max){
                        max = nums[i];
                    }
                }

                int[] count = new int[max+1];
                for(int i = 0 ; i<nums.length; i++){
                    count[nums[i]]++;
                }
                for(int i = 1 ;i<count.length;i++){
                    count[i] = count[i]+count[i-1];
                }
                int[]result = new int[nums.length];
                for(int i = 0;i<nums.length;i++){
                        result[i] = count[nums[i] - 1];
                    }



                return result;
            }

    }
