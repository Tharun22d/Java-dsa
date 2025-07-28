/*
441. Arranging Coins
You have n coins and you want to build a staircase with these coins.
The staircase consists of k rows where the ith row has exactly i coins.
The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.


analogy :

Visual analogy:
    Imagine you’re guessing a number between 0 and 𝑛
    n, and you want the highest number whose staircase sum ≤ 𝑛.

    left and right mark the range where your guess can be.
    Each guess (mid) splits the search space into two halves.
    By moving left or right, you narrow down the possible answers

 */


package Searching.Mathpatterns;

public class ArranageCoins {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrange(n));
        /*
        if n = 10
        |
        | |
        | | |
        | | | |   -4 complete rows
         */
    }
    static int Arrange(int n){
            /*
            check between 0 to nums with the sum of a mid value if the sum = target return it
             */
            int left = 0;
            int right = n;
            while(left<=right){
                long mid = left + (right -left)/2;
                long sum = (mid*(mid+1))/2;
                if(sum > n){
                    right = (int)mid-1 ;
                }
                else if(sum<n){
                    left = (int)mid+1;
                }
                else{
                    return (int)mid;
                }
            }

            return (int) right;

    }
}
