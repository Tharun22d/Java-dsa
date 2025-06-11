//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String age = eligibility(a);
        System.out.println(age);
    }

    static String eligibility(int a) {
        if (a >= 18) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
}

