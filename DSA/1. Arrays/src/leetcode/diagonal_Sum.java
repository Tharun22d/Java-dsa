/*
1572. Matrix Diagonal Sum
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary
diagonal that are not part of the primary diagona
 */

package leetcode;

public class diagonal_Sum {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int res = diagonalSum(arr);
        System.out.print(res);
    }
    public static int diagonalSum(int[][] mat) {
        int tot = 0;
        int left_count = 0 ;
        int mid = 0;
        int right_count = 0;
        int n = mat.length;
        for(int i = 0 ; i<n ; i++){
            left_count += mat[i][i];
        }

        for(int i = 0 ; i<n; i++){
            right_count += mat[i][n-1-i];
        }
        if(n%2!=0){
            mid = mat[(n-1)/2][(n-1)/2];
        }
        tot = left_count + right_count -mid;

        return tot;
    }
}
