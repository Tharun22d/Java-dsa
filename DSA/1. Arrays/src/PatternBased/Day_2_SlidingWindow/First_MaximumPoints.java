/*
1423. Maximum Points You Can Obtain from Cards

its not A consecutve Subarray Question.
Frist we need to calcualte the maximumSum from 0 to the value of k
the we start using two pinters to slide from the last value which is R and Decresea the value of the left sum present on the left (k-1 to 0)
then we add those two values to get the sum and update the max if required

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize
your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.
 */


package PatternBased.Day_2_SlidingWindoe;

public class First_MaximumPoints {
    static int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        //sum from left to k-1
        for(int left = 0 ; left<k ; left++){
            lsum = lsum + cardPoints[left];
        }
        //slide the window from left k-1 to 0 and subract the value witth the sum
        //at the same time slide the window down from r = length of aray till r = k;
        int max = lsum;
        for(int left = k-1 , right = cardPoints.length - 1 ; left>=0; left--,right--){
            lsum = lsum - cardPoints[left];
            rsum = rsum + cardPoints[right];
            max = Math.max(max , lsum+rsum);
        }
        return max;
    }
}
