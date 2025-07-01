/*
125. Valid Palindrome

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */


package PatternBased.TwoPointers;

public class ValidPallindrome {
    public boolean isPalindrome(String s) {
        String cleared = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();  // remove all the special characters from the String and convert to a string with no spaces
        int i = 0;
        int j = cleared.length()-1;
        while(i<j){
            if(cleared.charAt(i)!=cleared.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
