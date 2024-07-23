package StackCreate.Arrays;

public class implement_stack_using_arrays {
        int size = 100;
        int arr[] = new int[size];
        int top = -1;
        void push(int x) {
            top++;
            arr[top] = x;
        }
        int pop() {
            int x = arr[top];
            top--;
            return x;
        }
        int peek() {
            return arr[top];
        }
        int size() {
            return top + 1;
        }

    }

