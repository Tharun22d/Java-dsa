/*
You're given a list of integers terminated by a 0. Write a function to return the largest number entered before the 0.

Input: numbers = [4, 9, 12, 3, 0, 5]
Output: 12
Explanation: We stop at the first 0. The largest value among [4, 9, 12, 3] is 12.

 */

import java.util.Scanner;

public class largestinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int largest = 0 ;
        while(n!=0){
            if(n>largest){
                largest = n;
            }
            n = input.nextInt();
        }

        System.out.print(largest);
    }
}
