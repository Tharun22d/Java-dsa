/*
Second Largest   - GFG 160 : Problem 1

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

brute force Approach :  Step 1: Find the largest
                        Step 2: create new array to store and Replace all occurrences of the
                                largest with MIN_VALUE if exists
                        Step 3: Find the second largest , itreate upon the stored array
                        Step 4: If no second largest found, return -1
Destroying the largest to the Minimum value(Integer.MIN_VALUE) so the next will ne the 2nd largest

Optimal Approach :  Step 1 : Set 2 vairables largest , smallest to MIN.VALUE;
                    Step 2 : itreatre throgh the array , to check
                                if array[i] > largest
                                    secondlargest = largest // 1st declare, to avoid loosing the largest
                                    largest = array[i]
                                else if check (arr[i] > secondlargest && arr[i]<largest)
                                    secondlargest = arr[i]
                    Step 3 : check in case if SecondLargest == Integre.MIN_VALue  {ex : [10 , 10]}
                                if not Return secondlargest;

*/

import java.util.*;

public class GFGArr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array :  ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of the Array :  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int res = getSecondLargest(arr);
        System.out.print(res);
    }


    public static int getSecondLargest(int[] arr) {
       /*
       // Brute force
        int[] ans = arr.clone();
        int largest = ans[0];       // 1 , 3 ,4  , 7
        for(int i = 1 ; i< ans.length ; i++){
            if(ans[i] > largest){
                largest = ans[i];
            }

        }

        for(int i = 0 ; i<ans.length; i++){
            if(ans[i] == largest){
                ans[i] = Integer.MIN_VALUE;
            }
        }

        int secondLargest = ans[0];

        for(int i = 1 ; i<ans.length ; i++){
            if(ans[i]>secondLargest){
                secondLargest = ans[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;

    }
        */

        //optimal approach
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {  //10 5 10
            if (arr[i] > largest) {
                Secondlargest = largest;  //seclar = 0
                largest = arr[i];         //lar = 10
            } else if (arr[i] > Secondlargest && arr[i] < largest) {
                Secondlargest = arr[i];
            }

        }
        if (Secondlargest == Integer.MIN_VALUE) {
            return -1;
        } else {
            return Secondlargest;
        }
    }
}
