/*
3136. Valid Word
A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

Input: word = "234Adas"

Output: true

Explanation:

This word satisfies the conditions.
 */


package leetcode;

public class ValidWord {
    static boolean solve(String word){
        if (word.length()<3){
            return false;
        }

        boolean hasvowel = false;
        boolean hascons = false;

        for(char ch : word.toCharArray()){   //.tocCharArray()
            char ch1 = Character.toLowerCase(ch);  //Character.toLowerCase(name) -> converts to lower case
            if(!Character.isLetterOrDigit(ch1)){  //character.isLetterOrDigit(name) -> checks if the char has letter or digit
                return false;
            }
            if(Character.isLetter(ch1)){   //character.isletter(name) -> checks if the character is a letter
                if("aeiou".indexOf(ch1)!=-1){  // checks if chat at ch value is present in 'aeiou'
                    hasvowel = true;
                }
                else {
                    hascons = true;
                }
            }
        }
        return hasvowel && hascons;
    }
}
