//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = Twosum(a,b);
        System.out.println("sum : " + sum);
    }
    static int Twosum(int a , int b){
        return a+b;
    }
}
