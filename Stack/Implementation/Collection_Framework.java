package Stack.Implementation;

import java.util.Stack;

public class Collection_Framework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("After push the element. \n" + st);

        System.out.println("After the pop element. \n" + st.pop());

        System.out.println("See the first element. \n" + st.peek());

        System.out.println("Size of the Stack. \n" + st.size());
    }
}
