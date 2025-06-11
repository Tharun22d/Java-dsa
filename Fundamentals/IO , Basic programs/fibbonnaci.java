import java.util.Scanner;

public class fibbonnaci {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the n Series : ");
        int n = obj.nextInt();
        System.out.println(value(n));

    }
    static int value(int n){
        int a = 0;
        int b = 1 ;
        for (int i = 1 ; i<=n ;i++){
            System.out.print(a+ " ");
            int c = a+b;
            a = b ;
            b = c;
        }
        return a;  //System.out.println(a);

    }
}
