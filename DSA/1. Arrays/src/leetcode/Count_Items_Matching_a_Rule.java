/*
1773. Count Items Matching a Rule

array is considerd as [type , color , name]
key is given as 'type' or 'color' or 'name'
need to check the valeue in that key is given ruleValue

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei

Input:      type   color  name      type       color    name       type    color   name
items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]]
RuleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

 */

package leetcode;
import java.util.*;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>(); // items = {}
        for(int i = 0 ; i<3 ; i++){
            items.add(new ArrayList<>());    //itwms = {{ },{ },{ }}  sub arraylist created
        }
        System.out.println("enter the values : ");
        for(int i = 0 ; i<3;i++){
            for(int j = 0 ; j<3 ;j++){
                items.get(i).add(input.next()); //for every ith value enter the value of j  //  i = 0 ; j = 0,1,2 - {{0,0,0},{},{}}
            }
        }
        System.out.println("enter the key : ");
        String rulekey = input.next();
        System.out.println("enter the value: ");
        String ruleValue = input.next();

        int res = countMatches(items,rulekey,ruleValue);
        System.out.println(res);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index =0;
        int count = 0;
        if(ruleKey.equals("type")){
            index = 0 ;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else if(ruleKey.equals("name")){
            index = 2 ;
        }

        for(int i = 0 ; i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
