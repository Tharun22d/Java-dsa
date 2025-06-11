import java.util.Scanner;

public class EvnDaysInAMnth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of Days in a month : ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1 ; i <num ; i=i+2){
            sum = sum+1;
        }
        System.out.println("Days he can go out : " + sum);
    }
}
