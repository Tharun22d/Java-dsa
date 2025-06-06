//Power In Java without Math.Pow

import java.util.Scanner;

public class power {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int pow = input.nextInt();
        int Mul = 1 ;

        for(int i = pow ; i>=1; i--){
            Mul *=num;
        }

        System.out.print(Mul);
    }
}
