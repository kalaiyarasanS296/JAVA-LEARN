public class GenerateParenthesis {
    public static void Generate(int n, int open, int close,
                                String ans){
        if(open == n && close == n){
            System.out.println(ans);
            return;
        }
        if(open > n || close > n){
            return;
        }
        Generate(n,open+1,close,ans+'(');
        if(close<open){
            Generate(n,open,close+1,ans+')');
        }
    }
    public static void main(String[] args) {
        int n = 3;
        Generate(n,0,0,"");
    }
}
