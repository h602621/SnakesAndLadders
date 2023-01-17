package Dat109;

import java.util.Random;

public class SnakesAndLadders {

    public static final int BOARD_SIZE = 100;
    public static final int NUM_SNAKES = 15;
    public static final int NUM_LADDERS = 15;

    public static int roll (){
        return (int) (Math.random() * 6) + 1;
    }

    // Create the game board
    public static int[] createBoard() {
        int[] board = new int[BOARD_SIZE];
        // Fill the board with the normal spaces
        for (int i = 0; i < BOARD_SIZE; i++) {
            board[i] = i;
        }

        // Add snakes to the board
        Random rand = new Random();
        for (int i = 0; i < NUM_SNAKES; i++) {
            int start = rand.nextInt(BOARD_SIZE - 1);
            int end = rand.nextInt(start);
            board[start] = end;
        }

        // Add ladders to the board
        for (int i = 0; i < NUM_LADDERS; i++) {
            int start = rand.nextInt(BOARD_SIZE - 1);
            int end = rand.nextInt(BOARD_SIZE - start) + start;
            board[start] = end;
        }

        return board;
}}
