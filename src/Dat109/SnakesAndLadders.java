package Dat109;

import java.util.Scanner;



public class SnakesAndLadders {
    public static final int BOARD_SIZE = 100;
    public static int player1 = 0;
    public static int player2 = 0;

    public static void main(String[] args) {
        // Create the snakes and ladders
        int[] snakes = {17, 54, 62, 64, 87, 93, 95, 98};
        int[] ladders = {4, 9, 20, 28, 40, 51, 63, 71};
        int[] snakeEnds = {7, 1, 19, 60, 36, 73, 75, 79};
        int[] ladderEnds = {14, 31, 38, 84, 59, 67, 81, 91};

        Scanner sc = new Scanner(System.in);

        while (player1 < BOARD_SIZE && player2 < BOARD_SIZE) {
            // Roll the dice for player 1
            System.out.println("Player 1 turn, press enter to roll the dice");
            sc.nextLine();
            int roll = (int) (Math.random() * 6) + 1;
            player1 += roll;
            System.out.println("Player 1 roll: "+ roll + " Player 1 position: " + player1);

            // Check if player 1 landed on a snake or ladder
            for (int i = 0; i < snakes.length; i++) {
                if (player1 == snakes[i]) {
                    player1 = snakeEnds[i];
                    System.out.println("Player 1 landed on a snake and moved to position: " + player1);
                    break;
                }
            }
            for (int i = 0; i < ladders.length; i++) {
                if (player1 == ladders[i]) {
                    player1 = ladderEnds[i];
                    System.out.println("Player 1 landed on a ladder and moved to position: " + player1);
                    break;
                }
            }
            if(player1>=BOARD_SIZE){
                System.out.println("Player 1 wins!");
                break;
            }
            // Roll the dice for player 2
            System.out.println("Player 2 turn, press enter to roll the dice");
            sc.nextLine();
            roll = (int) (Math.random() * 6) + 1;
            player2 += roll;
            System.out.println("Player 2 roll: "+ roll + " Player 2 position: " + player2);

            // Check if player 2 landed on a snake or ladder
            for (int i = 0; i < snakes.length; i++) {
                if (player2 == snakes[i]) {
                    player2 = snakeEnds[i];
                    System.out.println("Player 2 landed on a snake and moved to position: " + player2);
                    break;
                }
            }
            for (int i = 0; i < ladders.length; i++) {
                if (player2 == ladders[i]) {
                    player2 = ladderEnds[i];
                    System.out.println("Player 2 landed on a ladder and moved to position: " + player2);
                }}}}}
