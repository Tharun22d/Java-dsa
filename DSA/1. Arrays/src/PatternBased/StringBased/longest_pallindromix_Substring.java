/*
5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"

notable : decared a empty string to store the substring from main string
          fetch substring from main string -> Variable = string.substring(start , end)
 */


package PatternBased.StringBased;

public class longest_pallindromix_Substring {
    public String longestPalindrome(String s) {
        int max = 0;
        String ans = " ";
        for(int left = 0 ; left < s.length() ; left++){
            for(int right = left ; right < s.length() ; right ++){
                if(ispalli(s, left , right)){
                    int len = right - left +1;
                    if(len>max){
                        max = len;
                        ans = s.substring(left , right +1);  // gets the substring of the particular index "syntax( var = string.substring(start , end))"
                    }
                }
            }
        }
        return ans;
    }

    static boolean ispalli(String s , int left , int right){
        int start = left;
        int end = right;
        while(start<=end){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
