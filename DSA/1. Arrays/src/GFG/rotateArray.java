//rotate an array towards left
//apprach - reverse the first half till the k , reverse the next half , revesse the whole array

/*
    right rotation :
    // Step 1: Reverse the entire array
    // Step 2: Reverse the first k elements
    // Step 3: Reverse the remaining n - k elements

 */


package GFG;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int d = 2;
        int[] res = rotateArr(arr,d);
        System.out.println(Arrays.toString(res));
    }
    static int[] rotateArr(int arr[], int d) {
        // add your code here
        //reverse the first half till d
        if(arr.length ==0 || d ==0){
            return arr;
        }
        d = d%arr.length;
        for(int i = 0, j = d-1;i<j; i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        //reverse the 2nd half d and >than d
        for(int i = d, j = arr.length-1 ; i<j ;i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        //reverse the entire array
        for(int i = 0 , j = arr.length-1 ; i<j ;i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
