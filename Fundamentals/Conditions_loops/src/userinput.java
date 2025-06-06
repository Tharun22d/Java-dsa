
/*
You're given a sequence of integers as input. The sequence ends when the value 0 is encountered.
Write a function that returns the sum of all integers before the zero.
The terminating zero is not included in the sum.

Input: numbers = [4, 3, 2, 0, 7, 9]
Output: 9
Explanation: 4 + 3 + 2 = 9; the sum stops before the 0.

 */


import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0 ;

//        int sum=0;   //method 1
//
//        while(true){
//            int n = input.nextInt();
//            sum = sum+n;
//            if(n == 0){
//                break;
//            }
//        }
//        System.out.print(sum);

        while(n!=0){   //method 2
            sum = sum+n;
            n = input.nextInt();
        }
        System.out.println(sum);
    }
}
