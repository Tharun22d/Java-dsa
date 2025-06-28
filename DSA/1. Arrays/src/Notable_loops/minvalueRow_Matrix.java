/*
1380. Lucky Numbers in a Matrix

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

 */


package Notable_loops;
import java.util.*;

public class minvalueRow_Matrix {
    public List<Integer> luckyNumbers(int[][] arr){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0 ; i< arr.length ; i++){
            int min = arr[i][0];
            int index = 0;

            for(int j = 0 ; j<arr[i].length ; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    index = j;
                }
            }

            boolean ismax = true;  //adding this because once the loop gets in  else statenent is written it adds the valye of min to list
            for(int k = 0 ; k<arr.length ; k++){
                if(arr[k][index]>min){
                    ismax = false;
                    break;
                }
            }
            if(ismax){
                result.add(min);
            }
        }
        return result;
    }
}
