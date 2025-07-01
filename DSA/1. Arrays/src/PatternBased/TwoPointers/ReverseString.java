/*
344. Reverse String

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

 */


package PatternBased.TwoPointers;

public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length -1 ;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
