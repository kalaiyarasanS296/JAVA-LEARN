import java.util.*;
public class Question3 {
   static Stack<Integer> stack = new Stack<>();
    public static void pushAtBottom(int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        pushAtBottom(data);
        stack.push(temp);
    }

    public static void main(String args[]) {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(4);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
