//sum of N natural numbers;

import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {


         Scanner input = new Scanner(System.in);
         int num = input.nextInt();

        //loop approach
        int sum = 0;
        for(int i = 1 ; i <= num ; i++){
            sum +=i;
        }
        System.out.print(sum);

//        //mathematical approach
//        int sum = num*(num+1)/2; //n*(n+1)/2
//        System.out.print(sum);

    }
}
