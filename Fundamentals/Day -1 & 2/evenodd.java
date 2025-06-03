// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = input.nextInt();
        if (a%2 == 0){
            System.out.print("Even");
        }
        else {
            System.out.print("Odd");
        }
    }
}
