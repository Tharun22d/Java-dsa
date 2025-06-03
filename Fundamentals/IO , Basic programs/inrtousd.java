import java.util.Scanner;

public class inrtousd {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Indian rupee : ");
        float ind = obj.nextFloat();
        float convert = 0.01205f;
        float usd = ind * convert;
        System.out.println("IND to USD is : " + usd);

    }
}
