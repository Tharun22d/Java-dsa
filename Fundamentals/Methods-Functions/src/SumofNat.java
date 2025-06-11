import java.util.Scanner;

public class SumofNat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("sum of numbers :  " + res(a));
    }
    static int res(int a){
        int sum = 0;
        for(int i = 1 ; i<=a ; i++){
            sum = sum+i;
        }
        return sum;
    }
}
