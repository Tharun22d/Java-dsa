//Given a positive integer n, return a list of all its positive factors (divisors) in ascending order.
//A factor of n is a number i such that n % i == 0.

import java.util.Scanner;

public class factors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i = 1; i<=num ; i++){
            if(num%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
