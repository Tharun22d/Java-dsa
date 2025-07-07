/*
Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation:
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 */


package leetcode;

import java.util.HashMap;

public class MaximumPopulation {
    public static void main(String[] args) {
        int[][]arr = {
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };
        int res = solve(arr);
        System.out.println(res);

    }
    static int solve(int[][] arr){
        int start = 1950;
        int end = 2050;
        int[] freq = new int[end - start +1]; // creates an array of sixze for storing the values

        for(int[] year : arr ){
            int birth = year[0]; //which generally like year[i][0]
            int death = year[1];

            for(int val = birth;val<death;val++){
                freq[val - start]++;  //incrementing every index of birth as 1 
            }
        }


        int max = 0;
        int result = -1;
        for(int i = 0 ; i<freq.length ; i++){
            if(freq[i]>max){
                max = freq[i];
                result = i + 1950;
            }
        }
        return result;
    }
}
