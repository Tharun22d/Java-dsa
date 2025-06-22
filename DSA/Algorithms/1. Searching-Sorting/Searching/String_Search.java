//linear Search

package Searching;

import java.util.Arrays;

public class String_Search {
    public static void main(String[] args) {
        //method 1 Using 'indexOf' checks whether the target is presnet in stringindex (string.indexOf(target))
            String name = "Tharun";
            char target = 'a';

            for(int i = 0 ; i<name.length();i++) {
                if (name.indexOf(target) != -1) {
                    System.out.println(true);
                    break;
                }
            }
        //method 2 using loop 'string.charAt(i)'
            for(int i = 0 ; i<name.length();i++){
                if(target == name.charAt(i)){   //since target is character no need to .equals , .equals are only for string
                    System.out.println(true);   //if you want to perform with .equals need to convert to strings
                    break;                      // if(String.valueOf(name.charAt(i)).equals(String.valueOf(target)))
                }
            }
        //method 3 converting the string to array and itreating upon that -name.toCharArray()
            char[] arr = name.toCharArray();
            System.out.println(Arrays.toString(arr));  //converts to array [T,h,a,r,u,n]
            for(int i = 0 ; i<arr.length;i++){
                if(arr[i] == target){
                    System.out.println(true);
                    break;
                }

            }
        int num = 1233445;  //way to find length of number without using String.valueOf(num).length()
        System.out.println((int)Math.floor(Math.log10(num)+1));
    }
}
