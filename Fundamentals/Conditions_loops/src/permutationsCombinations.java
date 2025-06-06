import java.util.Scanner;

public class permutationsCombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        System.out.print("Enter r : ");
        int r = input.nextInt();
        int s = n-r;

        //nCr =n!/r!(n-r)! , nPr = n!/(n-r)!

        int N = 1;
        int R = 1;
        int S = 1;


        //calculate n!
        for(int i = n ; i >=1 ; i--){
            N*=i;
        }
        //calculate r!
        for(int j = r ; j>=1 ;j--){
            R*=j;
        }
        //calculate (n-r)!
        for(int k = s ; k>=1 ;k--){
            S*=k;
        }

        System.out.println("nCr = "+ N/(R*S));
        System.out.println("nPr = " + N/S );

    }
}
