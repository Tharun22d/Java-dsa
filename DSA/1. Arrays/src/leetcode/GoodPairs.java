//1 512. Number of Good Pairs
// good pairs - arr[i] == arr[j]

//Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

package leetcode;
import java.util.*;

public class GoodPairs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = input.nextInt();
        }

        int res = numIdenticalPairs(arr);
        System.out.println(res);
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for(int i = 0 ; i <nums.length;i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    count = count + 1;
                }
            }

        }
        return count;

    }
}
