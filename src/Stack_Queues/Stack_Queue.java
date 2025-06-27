package Stack_Queues;

import java.util.List;
import java.util.Stack;

public class Stack_Queue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        stack.add(60);
        stack.add(70);
        List<Integer> reversed = stack.reversed();
        System.out.println(reversed);

        System.out.println(stack);

    }


}
