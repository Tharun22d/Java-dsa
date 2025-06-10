// Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.

import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int larger = largest(a,b,c);
        int smaller = Smallest(a,b,c);

        System.out.println("Largest :  " + larger);
        System.out.println("Smallest : " + smaller);

    }
    static int largest(int a, int b, int c){
        int large = a;

        if(b>a){
            large= b;
        }
        if(c>a){
            large = c;
        }

        return large;
    }

    static int Smallest(int a , int b , int c){
        int small = a;

        if(b<a){
            small = b;
        }
        if(c<a){
            small = c;
        }

        return small;

    }
}
