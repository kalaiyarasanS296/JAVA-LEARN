package StackCreate.Arrays;

public class Main {
    public static void main(String[] args) {

        implement_stack_using_arrays s = new implement_stack_using_arrays();
        s.push(6);
        s.push(3);
        s.push(7);
        s.pop();
        System.out.println("The Top element is "+s.peek());
        int si = s.size();
        System.out.println("The size is " +si);


    }
}

