public class BoardPath {
    static int count = 0;
    public static void printBoardPath(int curr, int end,
                                      String ans){
        if(curr==end){
            count++;
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        printBoardPath(curr+1,end,ans+1);
        printBoardPath(curr+2,end,ans+2);
        printBoardPath(curr+3,end,ans+3);
    }

    public static void main(String[] args) {
        printBoardPath(0,3,"");
        System.out.println("Total ways are "+count);
    }
}
