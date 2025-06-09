import java.sql.SQLOutput;
import java.util.Scanner;

public class stringEquAL {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String a = input.next();
        String b = input.next();
        boolean flag = true;
        if(a.length() == b.length()){
            for(int i = 0; i<a.length() ; i++){   //alternative to a.equals(b);
                if(a.charAt(i) != b.charAt(i)){
                    flag = false;
                    break;
                }
            }
        }

        if(flag == false){
            System.out.println("Same letters");
        }
        else{
            System.out.print("not same");
        }
    }

}
