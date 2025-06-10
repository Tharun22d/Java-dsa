//Define a Method to check whether a numeer is prime or not
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String check = Isprime(a);
        System.out.println(check);
    }

    static String Isprime(int a){
        boolean flag = true;

        if(a<=1){
            flag = false;
        }

        for(int i = 2 ; i*i<=a ; i++){
            if(a%i==0){
                flag = false;
                break;
            }
        }

        if(flag){
            return "Prime";
        }
        else return "Not Prime";

    }
}
