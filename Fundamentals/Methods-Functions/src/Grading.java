
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total no of subjects : ");
        int tot = input.nextInt();

        for(int i = 1 ; i<=tot ;i++){
            System.out.print("Enter your mark in subject "+ i + " : ");
            int marks = input.nextInt();
            String Report = Validate(marks);
            System.out.println(Report);   //may use array to store and print grades at last
        }
    }
    static String Validate(int a){
        if (a >= 91 && a <= 100) {
            return "AA";
        } else if (a >= 81 && a <= 90) {
            return "AB";
        } else if (a >= 71 && a <= 80) {
            return"BB";
        } else if (a >= 61 && a<= 70) {
            return "BC";
        } else if (a>= 51 && a<= 60) {
            return "CD";
        } else if (a>= 41 && a <= 50) {
            return "DD";
        } else {
            return "Fail";
        }
    }
}
