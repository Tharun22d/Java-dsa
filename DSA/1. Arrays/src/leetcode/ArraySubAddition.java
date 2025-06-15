/*
1672. Richest Customer Wealth

ques : in a 2d array compute the sum of each subarray and return the maximum value

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.  -- ouput
 */

package leetcode;
import java.util.*;

public class ArraySubAddition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no of rows : ");
        int row = input.nextInt();
        System.out.println("enter the no of columns : ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];

        for(int i = 0 ; i < arr.length; i++) {
            for(int j = 0 ; j < arr[i].length ;j++){
                arr[i][j]  = input.nextInt();
            }
        }
        int res = maximumWealth(arr);
        System.out.print(res);
    }
    public static int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int i = 0 ; i <accounts.length;i++){
            int sum = 0 ;  //since sum updates for each itreation of i so inside the loop
            for(int j = 0 ; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum>max){
                max = sum;
            }

        }
        return max;
    }
}
