//Given a string , return its reverse.
//You must not use built-in reverse methods (e.g., StringBuilder.reverse()).

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ch = input.next();

        for(int i = ch.length()-1 ; i>=0 ;i--){
            System.out.print(ch.charAt(i));
        }
    }
}
