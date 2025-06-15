/*
1470. Shuffle the Array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
 */

package leetcode;
import java.util.*;

public class ShuffleArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array values : ");
        for(int i = 0; i < arr.length ; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the index value : ");
        int index = input.nextInt();
        int[] res = shuffle(arr,index);
        System.out.println(Arrays.toString(res));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for(int i = 0 , j=0; i<nums.length ; i=i+2, j++){
           ans[i] = nums[j];        //ans[0] = nums[0]             //ans[2]  = nums[1] (nums incremented by 1 wehere as ans incremented by 2)
           ans[i+1] = nums[n+j];    //ans[1] = nums[3+0] = nums[3]  // ans[3] = nums[3+1]
        }

        return ans;
    }
}
