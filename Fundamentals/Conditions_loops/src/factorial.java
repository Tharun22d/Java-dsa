import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        BigInteger fact = BigInteger.ONE;   //to handle larger factorial values like 1000

        for(int i = n ; i>=1 ; i-- ){
            fact = fact.multiply(BigInteger.valueOf(i));  //fact = fact*i
        }

        System.out.print(fact);
    }
}
