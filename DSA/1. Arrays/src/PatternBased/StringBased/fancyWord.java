/*
1957. Delete Characters to Make Fancy String
A fancy string is a string where no three consecutive characters are equal.
Given a string s, delete the minimum possible number of characters from s to make it fancy.

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
 */


package PatternBased.StringBased;

import java.util.Scanner;

public class fancyWord {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(makeFancyString(s));
    }
    static String makeFancyString(String s) {
        StringBuilder text = new StringBuilder();  //"aaabaaaa"
        if(s.length()==0){
            return " ";
        }
        int count = 1;
        text.append(s.charAt(0)); //"a"

        for(int i = 1 ; i<s.length() ;i++){

            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;  // reset the counter
            }

            if(count <3){
                text.append(s.charAt(i));
            }
        }
        return text.toString();
    }
}
