/*
panagram - a number is a panagram if sentence contains at least one of every letter of the English alphabet.

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
 */

package leetcode;

import java.util.Scanner;

public class panagram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = input.next();
        if(checkIfPangram(word)){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }

    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        for(char ch = 'a' ; ch<='z' ;ch++){ //looping through a to z
            if(sentence.indexOf(ch) <0){  //checking if a-z are missing in sentence , if the index is <0 they are not even present
                return false;
            }
        }
        return true;
    }
}
