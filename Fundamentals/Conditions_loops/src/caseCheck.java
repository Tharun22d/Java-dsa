import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
        if(ch >= 97 && ch <= 112){ //ascii value of a = 97 and z =112
            System.out.print("Small letter");
        }
        else if(ch >= 65 && ch <=91){ //ascii value of A = 65 and Z = 91
            System.out.print("Capital");
        }
        else{
            System.out.println("Enter a valid Charater");
        }

    }
}
