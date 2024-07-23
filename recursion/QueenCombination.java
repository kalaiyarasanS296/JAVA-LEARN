public class QueenCombination {
    static boolean board[] = new boolean[4];
    public static void QueenCombination(
                                        int box, int qpsf,
                                        int tq, String ans){

        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        // If col exceeds the length of the board,
        // return as there are no more columns to place queens
        if (box == board.length) {
            return;
        }
        if(board[box] == false){
            board[box] = true;
            QueenCombination(box+1,
                    qpsf+1,tq,ans+"B"+box);

            board[box] = false;
        }
        QueenCombination(box+1,qpsf,tq,ans);

    }

    public static void main(String[] args) {
        QueenCombination(0,0,2,
                "");
    }
}
