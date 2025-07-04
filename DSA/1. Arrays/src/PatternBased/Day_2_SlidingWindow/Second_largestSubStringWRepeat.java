/*
3. Longest Substring Without Repeating Characters    -tag : HashMap , SlidingWindow . String
Given a string s, find the length of the longest substring without duplicate characters.

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Approach : use hashmap to check whether the key is present in the hashmap by incrementing right everytime;
           if present , move the left -> get the index value of the right + 1
           put the value of the right with the key to the index to further tracking of the value
           compute the length of the left and right
*/

package PatternBased.Day_2_SlidingWindow;
import java.util.*;

public class Second_largestSubStringWRepeat {
    static int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int n = s.length();
        int max = 0;

        // Loop through each character in the string using the right pointer
        while(right<n){

            // If this character was seen before and is inside the current window
            if(map.containsKey(s.charAt(right))){
                // Move the left pointer to one position right of the last seen index
                left = Math.max(map.get(s.charAt(right)) + 1,left);
            }

            // Update the last seen index of the current character
            map.put(s.charAt(right) , right);
            // Update the maximum length of substring found so far
            max = Math.max(max , (right-left)+1);
            right++;
        }
        return max;
    }
}
