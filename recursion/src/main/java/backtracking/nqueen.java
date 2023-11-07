package backtracking;

public class nqueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(placeQueen(board,0));
    }
    static int placeQueen(boolean[][]board,int r){
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for(int col = 0; col<board.length;col++){
            if(canPlace(board,r,col)){
                board[r][col] = true;
                count = count + placeQueen(board,r+1);
                board[r][col] = false;
            }
        }
        return count;
    }

    private static boolean canPlace(boolean[][] board, int r, int c){
        //checking vertical row
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }
        //check left diagonal
        int maxLeft = Math.min(r,c);
        for( int i=1;i<maxLeft;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        //check right diagonal
        int maxRight = Math.min(r,board.length-c-1);
        for( int i=1;i<maxRight;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
