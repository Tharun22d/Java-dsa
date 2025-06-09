import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        swap(a,b);
    }

    static void swap(int a , int b){
        int temp = a ;
        a = b;
        b = temp;
        System.out.print("a : " + a +" b " + b );
    }
}
