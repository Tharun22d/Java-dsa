/*
Longest Substring with K Uniques

You are given a string s consisting only lowercase alphabets and an integer k.
Your task is to find the length of the longest substring that contains exactly k distinct characters.


Note : If no such substring exists, return -1.

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.

Consider the value till it reaches the given distinct character count

apporach: use hashmap to store the character as put the frequency of the character , store diffent characters upto K Characters
          once the character size has reached then count the length from left to right
          if the charater has reached more than k values then remove the value of the left
          once if the left is equal to zero then remove it
          and find the max value

*/


import java.util.*;

package PatternBased.Day_2_SlidingWindow;

public class Five_LongestSubstringKUnique {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int len = s.length();
        while(right<len){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){ //since the size of k is allowded
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            if(map.size() ==k){  // count the length only if the map size is reached
                max = Math.max(max , right - left +1);
            }
            right++;
        }
        return (max == Integer.MIN_VALUE) ? -1 : max;
    }
}

