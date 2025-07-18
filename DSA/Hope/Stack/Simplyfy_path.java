/*
71. Simplify Path

approach :
Input: "/home/user/Documents/../Pictures"
Split by /: ["", "home", "user", "Documents", "..", "Pictures"]
Ignore empty parts.
Push "home", push "user", push "Documents"
Encounter ".." → pop "Documents"
Push "Pictures"
Join stack: "home/user/Pictures"
Result: "/home/user/Pictures"

Example 1:
Input: path = "/home/"
Output: "/home"
Explanation: The trailing slash should be removed.

Example 2:
Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: Multiple consecutive slashes are replaced by a single one.


 */


import java.util.*;
public class Simplyfy_path {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        System.out.print(stack(path));
    }
    static String stack(String path){
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/"); //to an character array where to split  by / (ignore /)

        for(String i : arr){
            if(i.equals("") || i.equals(".")){
                continue;
            }
            else if (i.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(i);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder res = new StringBuilder();
        for(String val : stack){
            res.append('/').append(val);
        }
        return res.toString() ;  //convert the String builder to String
    }
}
