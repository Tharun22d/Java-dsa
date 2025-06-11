import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        BigInteger factorial = fact(a);
        System.out.print(factorial);

    }

    static BigInteger fact(int a){
        BigInteger ans = BigInteger.ONE;

        if(a == 0 || a ==1 ){
            return BigInteger.ONE;
        }
        else {
            for(int i = a ; i>=2; i--){
                ans = ans.multiply(BigInteger.valueOf(i));
            }
        }
        return ans;
    }
}


