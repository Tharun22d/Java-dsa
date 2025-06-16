import java.util.Arrays;
import java.util.Scanner;

public class countLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        int[] res = calculate(word);
        System.out.println(Arrays.toString(res));

    }
    static int[] calculate(String word){
        int[] count = new int[26];
        String newWord = word.toLowerCase();   //goodevening
        for(int i =0 ; i<word.length();i++){
            int index = newWord.charAt(i) - 'a';  //  chatAt(0) =g -a = 103-97
            count[index]++;
        }
        return count;
    }
}
