import java.util.*;

public class Pallindromic_Suffix {
    public static void main(String[] args) {
        String a = "aabace";
        int sol = calculate(a);
        System.out.println(sol);
    }
    static boolean ispallindrome(String a , int start , int end){
        int i = start;
        int j = end;  //
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int calculate(String a){
        int sum = 0;
        int i = 0;
        int j = i+1;
        while(i<j){
            //abbaccee
            if(ispallindrome(a,i,j)){
                int len = 0;
                for(int k = 0; k<=j;k++){
                    len++;
                }
                int power = (int)Math.pow(len,2);
                sum = sum+power;

                i=j+1;
                j=i+1;
            }
            else{
                int len = 0;
                for(int k = 0 ; k<=i;k++){
                    len++;
                }
                int power = (int)Math.pow(len,2);
                sum = sum+power;
                i++;
                j++;

            }


        }
        return sum;
    }
}
