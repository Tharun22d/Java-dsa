import java.util.Arrays;
import java.util.Scanner;

public class Inputoutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        for(int i = 0; i < arr.length ;i++){
//            arr[i] = input.nextInt();
//        }
//
//        for(int i = 0 ; i<arr.length;i++){
//            System.out.print(arr[i]);  //output
//        }
//        System.out.println(Arrays.toString(arr));  //convert to string and print

        String[] name = new String[5];

        for (int i = 0 ; i <name.length;i++){  //.length is a field , not a method
            name[i] = input.next();
        }

        for(int i = 0 ; i<name.length;i++){
            System.out.print(name[i] + " ");
        }

        System.out.println(Arrays.toString(name));
    }
}
