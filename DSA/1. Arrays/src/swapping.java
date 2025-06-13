/*
Given an integer array and two indices, swap the elements at those indices and print the updated array.

example input :
Array: 10 20 30 40 50
Indices to swap: 1 3

output:
Updated array: [10, 40, 30, 20, 50]
 */

import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 35 , 5 , 4 , 8};
        swap(arr , 0 , 1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
