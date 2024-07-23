public class SumOfN {
    public static int sum(int n){
        // base condition
        if(n == 1){
            return 1;
        }
        // recursive call
        int ans = n + sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
      int n = sum(5);
        System.out.println(n);
    }
}
