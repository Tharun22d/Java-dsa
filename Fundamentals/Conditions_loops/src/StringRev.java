import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();

        for(int i = text.length()-1 ; i>=0 ; i--){
            System.out.print(text.charAt(i));
        }
    }
}
