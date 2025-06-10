//Using Methods - Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String oddeve = Check(a);   //declaration type must be same as return type
        System.out.println(oddeve);
    }
    static String Check(int a){
        if(a%2 ==0){
           return "Even";
        }
        return "Odd";
    }
}
