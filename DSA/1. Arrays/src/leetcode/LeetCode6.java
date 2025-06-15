/*
1431. Kids With the Greatest Number of Candies and output in an arraylist

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: The current max value is 5 which is held by Kid 3

Kid 1, they will have 2 + 3 = 5 candies, which is greater or equal to the current max of 5.
Kid 2, they will have 3 + 3 = 6 candies, which is greater or equal to the current max of 5.
Kid 3, they will have 5 + 3 = 8 candies, which is greater or equal to the current max of 5.
Kid 4, they will have 1 + 3 = 4 candies, which is less than the current max of 5.
Kid 5, they will have 3 + 3 = 6 candies, which is greater or equal to the current max of 5.
 */

package leetcode;
import java.util.*;

public class LeetCode6 {
    public static void main(String[] args){
        //input arr , //input target
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i =0; i < arr.length ; i++){
            arr[i] = input.nextInt();
        }
        int extraCandies = input.nextInt();

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>(); //declaring a new arraylist

        //finding maximum
        int max = candies[0];
        for(int i = 1 ; i< candies.length ; i++){
            if(candies[i]> max){
                max = candies[i];
            }
        }

        //check whether any sum is lesser than maximum and add it to the list
        for(int i = 0 ; i < candies.length ;i++){
            if(candies[i] + extraCandies >=max){
                result.add(true);   //adding values to arraylist
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
