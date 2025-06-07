import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int cat_1 = 0;
        int cat_2 = 0;
        int cat_3 = 0;

        while(true){
            num = input.nextInt();
            if(num==0){
                break;
            }

            if(num<0){
                cat_1+=num;
            }
            else if(num>=0 && num%2==0){
                cat_2+=num;
            }
            else{
                cat_3+=num;
            }
            
        }
        System.out.println("Negative sum : " + cat_1);
        System.out.println("Positive Even sum : " +cat_2);
        System.out.println("Positive Odd sum :  "+ cat_3);
    }
}
