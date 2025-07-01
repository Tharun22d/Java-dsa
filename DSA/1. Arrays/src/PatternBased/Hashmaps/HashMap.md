# 1. HashMap         

## Creating a HashMap

```bash
 HashMap<Integer , Interger > map = new HashMap<>();
```

## Usage

```bash
    1. Count and Store the frequencies
    2. Key Value pairs
    3. Finding duplicates, checking for existence, counting occurrences.
```

### Operations

```java
  .getOrDefualt(key,defualt) -- get the value for that key if found or set value for key to default (used for setting the count)
                      .entrySet()  -- while itreating through the HashMap in for Each loop
                      .getKey()
                      .getValue()

   1. .put(Key,value)      //adding value for key in the map
   2. .containsKey(key)    // Checks if a value is present in a HashMap
   3. .get(key)            //gets the value for the key
```

### Itreating Through For Each loop

```java
Example : Itreating to Calulate the Freqwencies of Each value : 
 for(Map.Entry<Integer, Integer> i : demo.entrySet()){  //itrating through each value
            int key = i.getKey();
            int value = i.getValue();
            System.out.println(key + "->" + value);
        }
```


### Example - 1 : Calculating the Frequencies of Each value in an array

```java
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
```

### Example - 2 : Two Sum

```java
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };  //if founf return the value for the compliemnt and the current index of the nums[i];
            }

            numMap.put(nums[i], i);
        }

       return -1;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }
}

