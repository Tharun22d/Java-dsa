//return the occurances of each values
/*
HashMap opetations -
                    .getOrDefualt(key,defualt) -- get the value for that key if found or set value for key to default
                    .entrySet()
                    .getKey()
                    .getValue()
 */
package Patterns.Hashmaps;

import java.util.*;

public class Hashmaps {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,6,7,7};

        HashMap<Integer,Integer> demo = new HashMap<>(); //{{2,2} , {3,1} , {5,1} , {6,1} ,{7,2}}  -entryset
        for(int i =0 ; i<arr.length;i++){
            int num = arr[i]; //2 //3 //4 //5 //6 //7 //7
            int count = demo.getOrDefault(num,0);//get the value of num in hasmap; //1  //0 //0 //0 //0 //0 //1
            demo.put(num,count+1);  //update the value as 1 //2,2 //3,1  //4,1 //5,1  //6,1 //7,1 //7,2
        }

        for(Map.Entry<Integer, Integer> i : demo.entrySet()){  //itrating through each value
            int key = i.getKey();
            int value = i.getValue();
            System.out.println(key + "->" + value);
        }

    }
}
