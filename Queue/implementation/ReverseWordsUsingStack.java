import java.util.Stack;

public class ReverseWordsUsingStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String sentence = "Hello How are you World";
        String[] words = sentence.split("\\.");
        for(String rev: words){
            StringBuilder w = new StringBuilder(rev);
            w.reverse();
            stack.push(String.valueOf(w));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
