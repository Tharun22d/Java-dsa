import java.util.Scanner;

public class stringPresent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lettter : ");
        String letter = input.next();
        System.out.println("Enter the target char : ");
        char target = input.next().charAt(0);
        boolean flag = false;
        for(int i = 0 ; i< letter.length();i++){
            if(letter.charAt(i) == target) {
                flag = true;
            }
        }
        if(flag){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        /*
        efficent method is using indexOf();

        if(letter.indexOf(target)<0){   //check whether the value has an index <0 (which is not present)
        System.out.print("Valye not found")
        }
         */

    }

}
