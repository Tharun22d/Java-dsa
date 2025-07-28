/*
744. Find Smallest Letter Greater Than Target
You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters.

If such a character does not exist, return the first character in letters.


Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'

Example 3:  -- character dosent exists

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 */


package Searching;

import java.util.*;

public class SmallerGreaterthanTarget_Strings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len = input.nextInt();
        char[] arr = new char[len];
        System.out.println("Enter the array values");
        for(int i = 0 ; i<len ; i++){
            arr[i] = input.next().charAt(0);   //["c" ,"d" ,"e","f"] - target = 'e' : op - 'e'
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target value : ");
        char target = input.next().charAt(0);
        System.out.println(Greaterthan(arr , target));
    }


    static char Greaterthan(char[] arr , char target){
        int left = 0;
        int right = arr.length -1 ;
        while(left<=right){
            int mid = left + (right -left)/2;
            if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return arr[left%arr.length];   //if character dosent exist we need to print the value at 0 index
        /*
        or method of writing
        if(left == arr.length){
             return arr[0];
        }
        return arr[left]
         */
    }
}
