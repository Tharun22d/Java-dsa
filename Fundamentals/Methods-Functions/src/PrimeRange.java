//printing prime upto range n

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 2 ; i <a;i++){
            if(Isprime(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean Isprime(int a ){
        boolean flag = true;

        for(int i = 2; i*i<=a ; i++){
            if (a % i == 0){
                flag = false;
                break;
            }
        }
        if (flag) {
            return true;
        }
        else {
            return false;
        }
    }
}
