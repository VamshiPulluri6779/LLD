package LLD.tictactoegame;

public class Board {

    int size;   // for using a board bigger than 3X3
    PlayingPiece[][] board;

    Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    boolean getEmptyCells(PlayingPiece[][] board){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] == null) return true;
            }
        }
        return false;
    }

    boolean addPiece(int row, int col, PlayingPiece piece){
        if(board[row][col] != null) return false;
        board[row][col] = piece;
        return true;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }
}
