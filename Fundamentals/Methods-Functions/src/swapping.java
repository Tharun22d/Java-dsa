/*
Pass by value - does not changes the value as the value are stored in stack
when changing it creates a copy of the value in the stack and alters it but not
the original value. The original Value remins unchanged

ex : int , char , double - Primitive Datatypes

Pass by reference - Changes the original value as the reference value are stored in
the stack which points to the actual value in the heap. As the reference value itself
can directly access the Value or object. It can alter the original value.

ex : array , objects

sample execution :
    main() {
        int[] arr = {1,2,99,73}
                     0 1 2 3
        Change();
     }
    Change num){
         num[0] = 99 ---> changes the value of the original 0th index of Array
         as we have the refernce but not the copy value
   }

 */


import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        swap(a,b);
        //does not alter the original value
    }

    static void swap(int a , int b){
        int temp = a ;              //pass by value -- value stored in stack but not in heap
        a = b;
        b = temp;
        System.out.print("a : " + a +" b " + b );   // changes the value as per local scope
    }
}
