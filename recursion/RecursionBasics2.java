public class RecursionBasics2 {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
        return;
    }
    public static void main(String[] args) {
        printDec(5);
    }
}
