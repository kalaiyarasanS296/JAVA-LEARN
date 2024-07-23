//Queen Combination box respect
public class QueenCombinations {
    public static void QueenC(boolean[] board, int col,int qpsf, int tq, String ans){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        //place
        board[col] = true;
        QueenC(board,col+1,qpsf+1,tq,ans);
        board[col] = false;

    }

    public static void main(String[] args) {
        QueenC(new boolean[4],0,0,2,"");

    }
}
