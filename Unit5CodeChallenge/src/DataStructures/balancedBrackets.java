package DataStructures;

import java.util.Stack;

// TimeComplexity : O(n) and SpaceComplexity : O(n)
public class balancedBrackets {

    boolean isbalancedBrackets(String input) {
        Stack<Character> stk = new Stack<>();

        for(int index = 0; index < input.length(); index++){
            char ch = input.charAt(index);
            if( ch == '('){
                stk.push(')');
            }
            else if(ch == '{'){
                stk.push('}');
            }
            else if(ch == '['){
                stk.push(']');
            }
            else if(ch == '<'){
                stk.push('>');
            }
            else if(stk.isEmpty() || stk.pop() != ch){
                return false;
            }
        }
        return stk.empty();
    }
}

