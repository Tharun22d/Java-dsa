import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int originalnumber = num;
        double sum = 0;
        int len = String.valueOf(num).length(); //length of the number
        while(num!=0){
            int digit = num%10;   // 153%10 = 3 //15%10 = 5
            sum = sum + Math.pow(digit,len); // 0+3pow(3) // 3pow(3) + 5pow(3)
            num=num/10; // eliminates 3 then follows 15 in loop // eliminates 5 then 1
        }
        if (sum == originalnumber){
            System.out.print("Armstrong number ");
        }
        else {
            System.out.print("Not an Armstong number");
        }
    }
}
