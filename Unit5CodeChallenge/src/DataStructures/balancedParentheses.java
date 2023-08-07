package DataStructures;

public class balancedParentheses {

    private static boolean isbalancedParentheses(String input) {
        // TimeComplexity : O(n) and SpaceComplexity : O(1)
        int count = 0;
        for(int index = 0; index < input.length(); index++){
            char ch = input.charAt(index);
            if( ch== '('){
                count++;
            }
            else if(ch == ')'){
                count--;
            }
            if(count < 0){
                return false;
            }
        }
        return count == 0;
        //Another method using Stack:

        // TimeComplexity : O(n) and SpaceComplexity : O(n)
        // Stack<Character> stk = new Stack<>();
        
        // for(int index = 0; index < input.length(); index++){
        //     char ch = input.charAt(index);
        //     if( ch== '('){
        //         stk.push(')');
        //     }
        //     else if(stk.isEmpty() || stk.pop() != ch){
        //         return false;
        //     }
        // }
        // return stk.empty();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Is Valid Paranthesis : " +isbalancedParentheses("((")); // invalid
        System.out.println("Is Valid Paranthesis : " +isbalancedParentheses("((()()))")); // valid
        System.out.println("Is Valid Paranthesis : " +isbalancedParentheses("()()()")); // invalid
    }
}
