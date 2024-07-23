package Dynamicprogramming.boardPath;

public class printBoardPath {
    public static void printBoardPath(int curr, int end,
                                      String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }

//        printBoardPath(curr+1,end,ans+1);
//        printBoardPath(curr+2,end,ans+2);
//        printBoardPath(curr+3,end,ans+3);
//
        for(int i=1; i<=3; i++){
            printBoardPath(curr+i,end,ans+i);
        }
    }

    public static void main(String[] args) {
        printBoardPath(0,3,"");
        //System.out.println("Total ways are "+ans);
    }
}
