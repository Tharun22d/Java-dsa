/*
declaration ArrayList<Class> name = new ArrayList<>(size);   // but size is not neessary
name.add(value);  //  add value to the list
sout(name)  //convert to string and print the values
sout(name.get(i))   // print values a that particular index
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> name = new ArrayList<>();
//        name.add(66);  //manually add values
//        name.add(87);
       for(int i = 0 ; i<5 ; i++){
           name.add(input.nextInt());
       }

       System.out.println(name);

       for(int i = 0 ; i<5 ; i++){
           System.out.print(name.get(i));
       }
    }
}
