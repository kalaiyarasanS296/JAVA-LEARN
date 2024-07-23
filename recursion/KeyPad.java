import java.util.ArrayList;

public class KeyPad {
    static String[] key = {" ", " ","abc","def","ghi",
                            "jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        String str = "23";
        ArrayList<String> list = new ArrayList<>();
        keypress(str,"",list);
       for(String s: list){
           System.out.println(s);
       }
    }

    public static void keypress(String str,String ans,
                                ArrayList<String> list){
        if(str.length() == 0){
            list.add(ans);
            return;
        }

        char ch = str.charAt(0);
        String press = key[ch - '0'];
        for(int i=0; i<press.length();i++){
            keypress(str.substring(1),
                    ans+press.charAt(i),list);
        }
    }
}
