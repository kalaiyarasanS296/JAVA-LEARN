package StackCreate.ArrayList;

public class Main {

    public static void main(String args[]){

        StackCreation_arrayList s = new StackCreation_arrayList();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        int re = s.pop();
        System.out.println("The removed element is "+re);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
