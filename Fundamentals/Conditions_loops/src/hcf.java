import java.util.Scanner;

public class hcf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(); //18
        int b = input.nextInt(); //16
        int c;

        if (a<b){           //condition for hcf that a>b
            int temp = a ;
            a=b;
            b = temp;
        }
        int X = a;  //storing to calulate LCM
        int Y= b;   //storing to calulate LCM

        while(b!=0){        //true  // true
            c=a%b;   //a>b  //18%16 = 2  // 16%2 =0
            a=b;            // a = 16 // a=2  //Holds the answer
            b=c;            //b = 2 // b =0
        }
        System.out.println("Hcf : " + a);
        System.out.println("Lcm : " + (X*Y)/a);
    }
}
