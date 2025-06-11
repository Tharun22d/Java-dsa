import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float OgValue = 599.99f;
        float discount = 29.1f;

        float price;

        float discountamount = OgValue * (discount/100);
        price = OgValue - discountamount;
        System.out.println(String.format("%.2f" , price)); //String.format() - formating a string to print 2 peicision decimal values

    }
}
