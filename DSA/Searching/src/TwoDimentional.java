/*
1351. Count Negative Numbers in a Sorted Matrix
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
return the number of negative numbers in grid.

approach : chose the array coloum wise
            traverse the array and seach using binary search
            if in non increasing order, the value next to the index if its <0 will be the negative value
            so get the first index with the negative value
            then return the index and subract the length of the arrayy with the index value

 */


public class TwoDimentional {
    public static void main(String[] args) {
        int[][] arr = {
                {5,4,-1,-2,-3},
                {-1,-2,-3,-4},
                {0,0,-1,-2,-3},
                {-1,-2,-3,-4}
        };
        System.out.println(count(arr));
    }
    static int count(int[][] grid){
        int count = 0;
        for(int i = 0 ; i< grid.length ; i++){
            int index = binarySearch(grid[i]);
            if(index != -1){
                count = count + (grid[i].length - index) ;
            }
        }
        return count;
    }
    static int binarySearch(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while(left<= right){
            int mid = left +(right - left)/2;
            if(arr[mid] >= 0){
                left = mid + 1;
            }
            else{
                index = mid;
                right = mid - 1;
            }
        }
        return index;
    }

}
