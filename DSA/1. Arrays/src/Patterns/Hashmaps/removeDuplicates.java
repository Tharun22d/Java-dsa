/*
usage of HashSet - for repeated occuracne measure
                .contains(value) - checks the value is presnet
                .add(value)- ads the array does not in order
                using linkedHashSet may have the order
 */

package Patterns.Hashmaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,6,6,7,7,8,9,9};
        //aproach 1 using LinkedHashSet

            HashSet<Integer> dup = new LinkedHashSet<>(); //linkedhasset to prevent order changing
            for(int i = 0 ; i<arr.length ;i++){
                dup.add(arr[i]);
            }
            System.out.println(dup);  //directly print hashset

        //aproach 2 update the arrayItself
            HashSet<Integer> set = new HashSet<>();
            int index = 0 ;
            for(int i = 0 ; i<arr.length;i++){
                if(!set.contains(arr[i])){
                    set.add(arr[i]);
                    arr[index] = arr[i];
                    index++;
                }
            }
            int[] uniqueElements = Arrays.copyOfRange(arr, 0 , index);
            System.out.println(Arrays.toString(uniqueElements));

    }
}
