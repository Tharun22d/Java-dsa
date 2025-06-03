import java.util.Scanner;

public class operator {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a = obj.nextInt();
        System.out.print("Enter Number 2 : ");
        int b = obj.nextInt();

        System.out.println("Addition : "+ (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));

    }
}
