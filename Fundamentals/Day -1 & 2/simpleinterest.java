import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Principle :");
        int p = obj.nextInt();
        System.out.print("Enter Rate :");
        int r = obj.nextInt();
        System.out.print("Enter Time :");
        int t = obj.nextInt();
        System.out.print("Simple Interest : " + (p+r+t)/100);
    }
}
