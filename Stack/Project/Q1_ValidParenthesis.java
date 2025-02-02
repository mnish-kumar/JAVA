package Stack.Project;

import java.util.Stack;

public class Q1_ValidParenthesis {
    public static boolean valid(String s){

        Stack<Character> st = new Stack();

        char[] ch = s.toCharArray();
        for (char check : ch) {
            if (check == '(' || check == '{' || check == '[') st.push(check);
            else if (st.isEmpty()) return false;
            else if (st.peek() == '[' && check == ']' || st.peek() == '{' && check == '}' || st.peek() == '(' && check == ')') {
                st.pop();
            } else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(valid(s));
    }
}