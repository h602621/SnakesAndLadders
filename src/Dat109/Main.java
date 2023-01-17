package Dat109;

public class Main extends SnakesAndLadders {

    public static void main(String[] args) {
        int[] board = createBoard();

        // Create players
        int player1 = 0;
        int player2 = 0;

        // Game loop
        while (player1 < BOARD_SIZE && player2 < BOARD_SIZE) {
            // Roll the dice for player 1
            int roll = roll();
            player1 += roll;

            // Check if player 1 landed on a snake or ladder
            if (player1 < BOARD_SIZE) {
                player1 = board[player1];
            }

            // Roll the dice for player 2
            roll = roll();
            player2 += roll;

            // Check if player 2 landed on a snake or ladder
            if (player2 < BOARD_SIZE) {
                player2 = board[player2];
            }

            System.out.println("Player 1: " + player1 + " Player 2: " + player2);
        }

        if (player1 >= BOARD_SIZE) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}


