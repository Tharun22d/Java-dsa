/*
832. Flipping an Image

flipping - reverse an array
inverting - swap o as 1 and 1 as o

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

 */
package leetcode;

public class flipping_Image {
    //only logic
    public int[][] flipAndInvertImage(int[][] image) {
        //reversing array
        for (int i = 0; i < image.length; i++) {
            for (int j = 0, k = image[i].length - 1; j < k; j++, k--) {
                int temp = image[i][k];
                image[i][k] = image[i][j];
                image[i][j] = temp;
            }
        }
        //inverting
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else if (image[i][j] == 0) {
                    image[i][j] = 1;
                }
            }

        }
        return image;
    }
}
