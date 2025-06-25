/*
An anagram is a string that contains the exact same characters as another string,
but the order of the characters can be different.

Input: s = "racecar", t = "carrace"
Output: true

Input: s = "jar", t = "jam"
Output: false
 */

package blind75;
import java.util.*;

public class anagram {
    public boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray(); //[r,a,c,e,c,a,r]
        char[] tarr = t.toCharArray(); //[c,a,r,r,a,c,e]

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character , Integer> smap = new HashMap<>();
        for(int i = 0 ; i<sarr.length ; i++){
            char ch = sarr[i];
            int count = smap.getOrDefault(ch,0);
            smap.put(ch,count+1);
        }
        HashMap<Character , Integer> tmap = new HashMap<>();
        for(int i = 0 ; i<tarr.length ; i++){
            char ch = tarr[i];
            tmap.put(ch , tmap.getOrDefault(ch,0)+1);
        }

        return smap.equals(tmap);  //checks each key and value of one Hashtable with other

    }
}
