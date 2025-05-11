package LLD.SnakesAndLadders;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Deque<Player> players;
    Player winner;
    Dice dice;

    Game(){
        initGame();
    }

    private void initGame() {

        board = new Board(10, 5, 5);
        players = new LinkedList<>();

        Player player1 = new Player("player1", 0);
        Player player2 = new Player("player2", 0);
        players.add(player1);
        players.add(player2);

        dice = new Dice(1);
        winner = null;
    }

    void playGame(){

        while(winner == null){

            Player currentPlayer = players.removeFirst();

            System.out.println("Player : " + currentPlayer.name + " Current position is: "+
                    currentPlayer.currentPosition);

            int newPosition = currentPlayer.currentPosition + dice.rollDice();
            if( newPosition <= board.size * board.size - 1){
                newPosition = findAnyJumps(newPosition);
            }

            if(newPosition >= board.size * board.size - 1){
                winner = currentPlayer;
                System.out.println("Player " + currentPlayer.name + " won!");
                break;
            }
            currentPlayer.currentPosition = newPosition;

            System.out.println("Player : " + currentPlayer.name + " New position is: "+
                    currentPlayer.currentPosition);

            players.addLast(currentPlayer);
        }
    }

    int findAnyJumps(int currentPosition){

        Cell cell = board.getCell(currentPosition);
        if(cell.jump != null){
            if(cell.jump.start > cell.jump.end){
                System.out.println("Snake found");
            } else {
                System.out.println("Ladder found");
            }
            return cell.jump.end;
        }
        return currentPosition;
    }
}
