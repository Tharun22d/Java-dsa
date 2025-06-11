/*
Given a positive integer maxVal, write a program to determine if there exists any Pythagorean triplet
(a,b,c) such that:

You are not allowed to use arrays, lists, hash sets, or other collections.
Use only primitive variables and loops to solve the problem.


Input: maxVal = 10

Output: true

Explanation:
There exists a Pythagorean triplet: (3, 4, 5)
Since 3² + 4² = 9 + 16 = 25 = 5²

 */

import java.sql.SQLOutput;
import java.util.Scanner;


public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxVal = input.nextInt();
        boolean found = Pythogorean(MaxVal);
        if(found){
            System.out.println(found);
        }
        else{
            System.out.println("False");
        }

    }
    static boolean Pythogorean(int MaxVal){
        for(int i = 1 ; i<MaxVal ; i++) {
            for(int j = 1 ; j <MaxVal;j++){
                for(int k = 1 ; k<MaxVal ; k++){
                    if(i*i == j*j + k*k){
                        System.out.println(i + " " + j + " " + k);
                        return true;
                    }

                }
            }
        } return false;
    }
}
