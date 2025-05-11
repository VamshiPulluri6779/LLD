package LLD.SnakesAndLadders;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;
    int size;

    Board(int size, int snakesCount, int laddersCount){
        this.size = size;
        initializeCells();
        addSnakesAndLadders(snakesCount, laddersCount);
    }

    private void initializeCells() {
        cells = new Cell[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                cells[i][j] = new Cell();
            }
        }
    }


    private void addSnakesAndLadders(int snakesCount, int laddersCount) {
        while(snakesCount > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, size * size);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, size * size);
            if(snakeTail >= snakeHead) continue;

            Jump snake = new Jump();
            snake.start = snakeHead;
            snake.end = snakeTail;

            Cell cell = getCell(snakeHead); // for getting snake head co-ordinates in matrix's terms
            cell.jump = snake;

            snakesCount--;
        }

        while(laddersCount > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, size * size);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, size * size);
            if(ladderStart >= ladderEnd) continue;

            Jump ladder = new Jump();
            ladder.start = ladderStart;
            ladder.end = ladderEnd;

            Cell cell = getCell(ladderStart); // for getting snake head co-ordinates in matrix's terms
            cell.jump = ladder;

            laddersCount--;
        }
    }

    Cell getCell(int position){
        return cells[(position)/size][(position) % size];  // return corresponding cell of board
    }
}
