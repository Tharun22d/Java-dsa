/*
1252. Cells with Odd Values in a Matrix

given the size mxn of the matix and indices array in which the 0th index is rows and 1st index is colum
for every indices valye of row you need to increment the row by 1 and similar for the coloumn as well

Input: m = 2, n = 3, indices = [[0,1],[1,1]]    - [0th row increment by 1  , 1st col increment by 1 ] ,[1st row by 1 , 1st col by 1]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
 */

package leetcode;

public class matrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int i = 0 ; i<indices.length ; i++){
            int rows = indices[i][0];
            int col = indices[i][1];

            for(int j = 0 ; j<mat[rows].length ; j++){
                mat[rows][j]++;
            }
            for(int k=0; k<mat.length ; k++){
                mat[k][col]++;
            }
        }
        int count = 0;
        for(int i = 0 ; i<mat.length ; i++){
            for(int j = 0 ; j<mat[i].length ; j++){
                if(mat[i][j]%2 == 1){
                    count++;
                }
            }
        }

        return count;
    }
}
