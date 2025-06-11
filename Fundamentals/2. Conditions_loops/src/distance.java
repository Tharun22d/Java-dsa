
import java.util.Scanner;

public class distance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the X co-ordinates : ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        System.out.print("Enter the Y co-ordinates : ");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();

        double Distance = Math.sqrt(Math.pow(x1-x2 , 2) + Math.pow(y1-y2,2));
        System.out.println(String.format("%.2f", Distance));  //upto 2 decimal precision
    }
}
