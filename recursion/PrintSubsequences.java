public class PrintSubsequences {
    public static void printSub(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        printSub(str.substring(1),ans+ch);
        printSub(str.substring(1),ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("The String is "+str);
        printSub(str,"");
    }
}
