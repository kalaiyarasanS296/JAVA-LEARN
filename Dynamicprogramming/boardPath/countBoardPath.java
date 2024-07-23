package Dynamicprogramming.boardPath;

public class countBoardPath {
    public static int BoardPath(int curr, int end){
        if(curr==end){

            return 1;
        }
        if(curr>end){
            return 0;
        }

        int BP1 = BoardPath(curr+1,end);
        int BP2 = BoardPath(curr+2,end);
        int BP3 = BoardPath(curr+3,end);

        int ans = BP1 + BP2 + BP3;
        return ans;


    }

    public static void main(String[] args) {
        int result = BoardPath(0,3);
        System.out.println("Total Ways are "+result);

    }
}
