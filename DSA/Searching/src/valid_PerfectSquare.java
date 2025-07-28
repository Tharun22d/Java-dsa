package Searching;

import java.util.Scanner;

public class valid_PerfectSquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(perfect(num));
    }
    static boolean perfect(int num){
        if(num == 0 || num ==1) return true;
        int left = 1;
        int right = num/2;
        while(left<=right){
            long mid = left + (right - left)/2;
            long square = mid*mid;

            if(mid*mid == num){
                return true;
            }
            else if(mid*mid > num){
                right = (int) mid -1 ;  //since mid is declared as long we must type cast it
            }
            else {
                left = (int) mid + 1;
            }
        }
        return false;
    }
}
