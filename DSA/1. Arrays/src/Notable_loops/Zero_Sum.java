/*
1304. Find N Unique Integers Sum up to Zero

Given an integer n, return any array containing n unique integers such that they add up to 0

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 */

package Notable_loops;

public class Zero_Sum {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0; // my mistake is i did arr[i] = i and arr[i+1] = -i and incrementeed i by 2 , but this is not correct

        if(n%2 ==1){
            arr[index] = 0;
        }

        for(int i = 1;i<=n/2 ; i++){
            arr[index++] = i;  //arr[index] = i ; index ++  //arr[0] = 1 ; index = 1
            arr[index++] = -i; // arr[1] = -1 ; index = 2 ;
        }


        return arr;
    }
}
