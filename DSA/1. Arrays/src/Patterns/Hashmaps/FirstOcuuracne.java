/*
Finding the First Repeating Element:
Input:  [10, 5, 3, 4, 3, 5, 6]
Output: 5

usage of LinkedHashMap so that the order does not change

 */

package Patterns.Hashmaps;
import javax.crypto.spec.PSource;
import java.security.Key;
import java.util.*;

public class FirstOcuuracne {
    public static void main(String[] args) {
        int[] arr = {10,5,3,4,3,5,6};
        HashMap<Integer,Integer> dup = new LinkedHashMap<>();
        for(int i = 0 ; i<arr.length;i++){
            int num = arr[i];
            int count = dup.getOrDefault(num,0);
            dup.put(num,count+1);
        }

        for(Map.Entry<Integer,Integer> i : dup.entrySet()){
            int key = i.getKey();
            int val = i.getValue();

            if(val>1){
                System.out.println(key);
                break;
            }
        }

    }
}
