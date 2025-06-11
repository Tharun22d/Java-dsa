import java.sql.SQLOutput;
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int sum = 0;

            for(int i = 1 ; i<num ;i++){
                if (num%i == 0){
                   sum = sum+i;
                }
            }

            if(sum == num){
                System.out.println("Perfect Number");
            }
            else{
                System.out.print("Not a Perfect Number");
            }


    }
}
