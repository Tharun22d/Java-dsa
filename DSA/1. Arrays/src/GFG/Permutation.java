/*
Next Permuataion :

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.

permutation : [1,2,3] -> [1,3,2] -> [2,1,3] -> [2,3,1] -> [3,2,1] next greater possible values
approach :   find the pivot from right to left (value which breaks the increasing order and return the value)
             swap the pivot value with the value which is 1st appearing greater than pivot from the right to left
             reverse the array of pivot + 1
 */

package GFG;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5,0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int index = -1;

        //step 1 : finding the pivot
        for(int i = n-1 ; i>0 ; i--){
            if(arr[i-1]<arr[i]){
                index = i-1;
                break;
            }
        }

        //step 2 : swapping with the value with the right
        if(index!=-1){
            for(int i = n-1 ;i>index ; i--){
                if(arr[i]>arr[index]){  //ex [2,4,'1',7,5,0] the n-1 value will get rejected for sure and n-1 next value will be swapped
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }
        }

        //step 3 : reverse the value next to the pivot
        int i = index+1;
        int j = n-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}
