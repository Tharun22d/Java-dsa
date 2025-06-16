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

        for(char ch = 'a' ; ch<='z' ;ch++){
            if(sentence.indexOf(ch) <0){  //check whether the values present in sentence
                return false;
            }
        }
        return true;
    }
}
