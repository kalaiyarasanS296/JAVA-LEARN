import java.util.ArrayList;

public class TotalSubsequences {
    static ArrayList<String> list = new ArrayList<>();
        public static void printSub(String str, String ans){
            if(str.length() == 0){
                list.add(ans);
                return;
            }
            char ch = str.charAt(0);
            printSub(str.substring(1),ans+ch);
            printSub(str.substring(1),ans);
        }

        public static void main(String[] args) {
            String str = "xyz";
            System.out.println("The String is "+str);
            printSub(str,"");

            for(String s: list){
                System.out.println(s);
            }
        }
    }


