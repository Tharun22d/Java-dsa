// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = input.nextInt();
        System.out.println(check(a));

    }
    static String check(int a){
        if (a%2 == 0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}
