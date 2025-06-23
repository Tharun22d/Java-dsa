//check if an array has dup
package blind75;
import java.util.*;
public class ContainsDup {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<>();
        for(int  i = 0 ; i<nums.length ; i++){
            int num = nums[i];
            if(!dup.contains(num)){
                dup.add(num);
            }
            else{
                return true;
            }
        }

        return false;
    }
}
