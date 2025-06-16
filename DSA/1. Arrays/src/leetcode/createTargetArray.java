/*
1389. Create Target Array in the Given Order

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class createTargetArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int[] index = new int[size];

        System.out.println("Enter the Array Values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the Index Values : ");
        for (int i = 0; i < index.length; i++) {
            index[i] = input.nextInt();
        }

        int[] res = calculate(index,arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] calculate(int index[] , int[] arr){
        ArrayList<Integer> target= new ArrayList<>();

        for(int i = 0 ; i<arr.length ;i++){
            target.add(index[i] , arr[i]);
        }

        int[] ans = new int[arr.length];

        for(int i = 0 ; i < target.size() ;i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}
