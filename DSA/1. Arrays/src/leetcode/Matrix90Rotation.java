/*
1886. Determine Whether Matrix Can Be Obtained By Rotation
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target

rotating matrix by 90,180,270, 360 to match the target
 */

package leetcode;

public class Matrix90Rotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0 ; i<4 ;i++){
            if(areMatricesEqual(mat,target)){
                return true;
            }
            mat = rotate(mat);

        }

        return false;
    }
    static int[][] rotate(int[][] mat){
        int[][] rotated = new int[mat.length][mat.length];
        int n = mat.length;
        for(int i = 0 ; i<mat.length ; i++){
            for(int j = 0 ; j<mat.length ; j++){
                rotated[i][j] = mat[n-1-j][i];  //rotating the matix by assigning it to new matrix
            }
        }
        return rotated;
    }
    static boolean areMatricesEqual(int[][] mat, int[][] target){
        for(int i = 0 ; i<mat.length ; i++){
            for(int j = 0 ; j<mat.length ; j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
