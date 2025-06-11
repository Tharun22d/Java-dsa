import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the text");
        String text = obj.next();

//        for (int i = 0 , j= text.length()-1; i<j ; i++ ,j--){
//            if(text.charAt(i)!=text.charAt(j)){
//                pallindrome = false;
//            }
//        }
//
//        if(pallindrome == true){
//            System.out.println("Pallindrome");
//        }
//        else {
//            System.out.println("Not a pallindrome");
//        }
        int i = 0;
        int j = text.length()-1;

        boolean palli = true;
        while (i<j){
            if(text.charAt(i) != text.charAt(j)){
                palli = false;
                break;
            }
            i++;
            j--;
        }
        if (palli) {
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
    }
}
