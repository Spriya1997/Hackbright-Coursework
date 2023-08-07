package DataStructures;

import java.util.EmptyStackException;

// TimeComplexity : O(n) and SpaceComplexity : O(n)
public class stackImpInArray {

    private static String[] stack;
    private static int top;

    public stackImpInArray(int size){
        stack = new String[size];

    }
    public void push(String i) {
    if (top == stack.length) {
        String[] newArr = new String[2 * stack.length];
        System.arraycopy(stack, 0, newArr, 0, stack.length);
        stack = newArr;
    }
    stack[top++] = i;
}

public String pop() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
    String s = stack[--top];
    stack[top] = null;
    return s;
}

public String peek() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }

    return stack[top - 1];
}

public int size() {
    return top;
}

public boolean isEmpty() {
    return top == 0;
}

public static void printStack() {
    for (int i = top - 1; i >= 0; i--) {
        System.out.print(stack[i]+" ");
    }
}
    public static void main(String[] args) {
        stackImpInArray stack = new stackImpInArray(5);
        stack.push("(");
        stack.push(")");
        stack.push("(");
        stack.push("(");
        stack.pop();
        printStack(); 
    }
}
