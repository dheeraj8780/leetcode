import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<Character>();
        for(char q:s.toCharArray()){
            if(q=='('){
                stk.push(')');
            }else if(q=='['){
                stk.push(']');
            }else if(q=='{'){
                stk.push('}');
            }else if(stk.isEmpty() || stk.pop()!=q){
                return false;
            }
        }
        return stk.isEmpty();
    }
}