import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int original = num;
        int rev = 0 ;

        while(num>0){                //let n = 1331;
            int rem = num%10;        // n%10 = 1  // 3
            rev = rev *10 + rem;    // rev = 1  // rev = 1*10+ 3 = 13 // rev = 13*10 + 3 =133; // 1331
            num = num/10;
        }

        if(rev==original){
            System.out.print("Pallindrome");
        }

        else{
            System.out.print("Not a Pallindrome");
        }

    }
}
