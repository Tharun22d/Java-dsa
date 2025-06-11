// Given a positive integer num and a target digit d (from 0 to 9), count how many times the digit d appears in num.

public class countNum {
    public static void main(String[] args) {
        int num = 13323;
        int count = 0 ;

        while(num>0){
            int rem = num%10;
            if(rem ==3){
                count++;
            }
            num /= 10;


        }
        System.out.println(count);
    }
}
