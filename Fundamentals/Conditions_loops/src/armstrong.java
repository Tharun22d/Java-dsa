import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int num = input.nextInt();
        int value = num;
        int sum = 0 ;
        int len = String.valueOf(num).length();

        while(num>0){
            int rem = num%10; //153 -- 3
            sum += Math.pow(rem ,len);  // 0+ 3pow(3)
            num /=10;  //15
        }

        if(sum == value){
            System.out.print("Armstrong");
        }
        else {
            System.out.print("Not an Armstrong");
        }
    }
}
