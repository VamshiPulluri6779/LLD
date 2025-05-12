package LLD.tictactoegame;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    Deque<Player> players;   // As we want to have flexibility of add and removing from both ends
    Board gameBoard;

    Game(){
        initGame();
    }

    void initGame(){

        players = new LinkedList<>();

        Player player1 = new Player("player1", new PieceTypeX());
        Player player2 = new Player("player2", new PieceTypeO());

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    String startGame(){
        boolean noWinner = true;
        while(noWinner){

            Player currentPlayer = players.removeFirst();

            gameBoard.printBoard();
            if (!gameBoard.getEmptyCells(gameBoard.board)){
                noWinner = false;
                continue;
            }

            System.out.println("Player " + currentPlayer.name + ": It is your turn: ");
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(",");
            int row = Integer.parseInt(input[0].trim());
            int col = Integer.parseInt(input[1].trim());

            if(!gameBoard.addPiece(row,col,currentPlayer.playingPiece)){
                System.out.println("Incorrect input: Please enter again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);

            if(gameHasWinner(row,col,currentPlayer.playingPiece)){
                noWinner = false;
                return currentPlayer.name;
            }
        }
        return "tie";
    }

    boolean gameHasWinner(int row, int col, PlayingPiece piece){

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean adjDiagMatch = true;

        for(int i=0; i<gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType!= piece.pieceType) {
                rowMatch = false;
                break;
            }
        }

        for(int i=0; i<gameBoard.size; i++){
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType!= piece.pieceType) {
                colMatch = false;
                break;
            }
        }

        for(int i=0,j=0; i<gameBoard.size; i++,j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType!= piece.pieceType){
                diagMatch = false;
                break;
            }
        }

        for(int i=0,j= gameBoard.size-1; i<gameBoard.size; i++,j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType!= piece.pieceType){
                adjDiagMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagMatch || adjDiagMatch;
    }
}
