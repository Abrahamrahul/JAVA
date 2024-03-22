import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';
    private static boolean gameOver = false;

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        Scanner scanner = new Scanner(System.in);
        
        while (!gameOver) {
            System.out.println("Player " + currentPlayer + "'s turn. Enter row and column (e.g., 1 1):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                printBoard();
                checkGameOver();
                switchPlayer();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '-';
    }

    private static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static void checkGameOver() {
        if (checkRows() || checkColumns() || checkDiagonals() || boardFull()) {
            gameOver = true;
        }
    }

    private static boolean checkRows() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumns() {
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        if ((board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
            (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }
        return false;
    }

    private static boolean boardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        System.out.println("It's a draw!");
        return true;
    }
}
