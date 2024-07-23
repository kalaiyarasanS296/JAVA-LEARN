import java.util.ArrayList;

public class MathPath {
    static ArrayList<String> list = new ArrayList<>();
    public static void Path(int n, int row,
                            int col,String ans){
        if(row == n && col == n){
            list.add(ans);
            return;
        }
        if(row > n || col > n){
            return;
        }
        Path(n,row,col+1,ans+"H");
        Path(n,row+1,col,ans+"V");
    }
    public static void main(String[] args)
    {
        Path(2,0,0,"");

        for(String s: list){
            System.out.println(s);
        }
        System.out.println("*****************************");

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
