
/*
989. Add to Array-Form of Integer
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

 */
package leetcode;
import java.util.*;

public class addInteger_to_array {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = num.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                k = k+num[i];
                i--;
            }

            ans.add(0,k%10);
            k = k/10;

        }

        return ans;
    }
}
