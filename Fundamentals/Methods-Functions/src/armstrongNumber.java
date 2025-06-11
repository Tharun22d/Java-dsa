//armstrong number between range

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        for(int i = 100; i<999;i++){
            if(armstrong(i)){  //checks and prints
                System.out.println(i+" ");
            }
        }
    }

    static boolean armstrong(int n) {
            int sum = 0;
            int temp = n;

            while(temp>0){
                int rem = temp%10;
                sum+=Math.pow(rem,3);
                temp/=10;
            }

           if(sum==n){      //or return sum==n;
               return true;
            }
        return false;  //defualt return type of the function
    }
}
