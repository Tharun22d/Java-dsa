import java.util.Scanner;

public class methodfunc1 {
    public static void main(String[] args){
        int a  =  sum();  //sum() -> stores the value returned
                          // calling sum(); dont print return value need to store it
        System.out.println(a);
    }
    static int sum(){         //int -> return type
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;

        return sum;   //returning the value
    }
}
