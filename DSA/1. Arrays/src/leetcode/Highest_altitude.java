/*
1732. Find the Highest Altitude
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

approach : create a new array to store the prefixsum of the value then finf the maximum in it
 */

package leetcode;

public class Highest_altitude {
    //only approach
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];  //to store 0th index

        for(int i = 1 ; i<arr.length ; i++){
            arr[i] = gain[i-1] + arr[i-1];
        }

        int max = arr[0];
        for(int i = 1 ; i <arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
